package com.spring.controller;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("com.spring.controller")
public class PersonConfiguration {
	@Bean
	public InternalResourceViewResolver resolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/");
		resolver.setSuffix(".jsp");
		return resolver;
	}

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/mahiindia");
		dataSource.setUsername("root");
		dataSource.setPassword("Nilay240%");
		return dataSource;

	}

	@Bean
	public LocalSessionFactoryBean sessionFactory(DataSource ds) {
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(ds);
		sessionFactory.setPackagesToScan("com.spring.controller");
		Properties props = new Properties();
		props.put("hibernate dialect", "org.hibernate.dialect.MySQL5Dialect");
		sessionFactory.setHibernateProperties(props);
		return sessionFactory;
	}

	@Bean
	public HibernateTemplate hibernateTemplate(SessionFactory sf) {
		HibernateTemplate hTemp = new HibernateTemplate(sf);
		hTemp.setCheckWriteOperations(false);
		return hTemp;
	}

	@Bean
	public HibernateTransactionManager transactionManager(SessionFactory sf) {
		HibernateTransactionManager txManager = new HibernateTransactionManager(sf);
		return txManager;
	}

}
