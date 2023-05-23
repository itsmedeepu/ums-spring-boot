package com.deepak.ums.config;

import java.util.Properties;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@Configuration
public class MysqlDBconfig {

	@Bean
	public DataSource getDataSource() {

		DataSource dataSource = new DataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/user_config");
		dataSource.setUsername("root");
		dataSource.setPassword("root");

		return dataSource;

	}

	@Bean
	public LocalSessionFactoryBean getLocalSessionFactoryBean() {

		LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
		factoryBean.setDataSource(getDataSource());
		factoryBean.setHibernateProperties(getHibernaProperties());
		factoryBean.setPackagesToScan("com.deepak.ums.entity");
		return factoryBean;

	}

	public static Properties getHibernaProperties() {

		Properties prop = new Properties();
		prop.setProperty("hibernate.hbm2ddl.auto", "update");
		prop.setProperty("hibernate.show_sql", "true");

		return prop;
	}

}
