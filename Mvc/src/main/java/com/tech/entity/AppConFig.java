package com.tech.entity;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.tech")

public class AppConFig {
	@Bean
	public InternalResourceViewResolver viewResolver() {

		InternalResourceViewResolver irvr = new InternalResourceViewResolver();
		irvr.setSuffix(".jsp");
		return irvr;
	}

	@Bean
	public DriverManagerDataSource manager() {

		DriverManagerDataSource d = new DriverManagerDataSource();
		d.setDriverClassName("com.mysql.cj.jdbc.Driver");
		d.setUrl("jdbc:mySql://localhost:3306/mvc");
		d.setUsername("root");
		d.setPassword("root");
		return d;
	}

	@Bean
	public LocalSessionFactoryBean sf() {
		LocalSessionFactoryBean lsb = new LocalSessionFactoryBean();
		lsb.setDataSource(manager());

		Properties p = new Properties();
		p.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL55Dialect");
		p.setProperty("hibernate.hbm2ddl.auto", "update");
		p.setProperty("hibernate.show_sql", "true");

		lsb.setHibernateProperties(p);
		lsb.setAnnotatedClasses(com.tech.model.Employee.class);

		return lsb;
	}


	

}