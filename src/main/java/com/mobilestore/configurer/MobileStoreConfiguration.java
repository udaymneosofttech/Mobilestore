package com.mobilestore.configurer;



import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;

import com.mobilestore.hloentity.Customer;

@Configuration
public class MobileStoreConfiguration {
	
	@Autowired
	private DataSource ds;
	
	
	@Bean
	private LocalSessionFactoryBean getFactory() {
		
		
		 LocalSessionFactoryBean factory=new LocalSessionFactoryBean();
		Properties p=new Properties();
		p.setProperty("hbn2ddl.auto", "update");
		p.setProperty("hibernate.show_sql", "true");
		p.setProperty("hibernate.dialect","org.hibernate.dialect.Oracle10gDialect");
		
		factory.setDataSource(ds);
		factory.setHibernateProperties(p);
		factory.setAnnotatedClasses(Customer.class);
		return factory;
	}

}
