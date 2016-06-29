package com.taojinqu.manual.product.dao.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.taojinqu.manual.product.disconf.ProductDbConfig;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
@EnableTransactionManagement
@MapperScan(basePackages = "com.taojinqu.manual.product.dao.mapper", sqlSessionFactoryRef = "mySqlSessionFactory", sqlSessionTemplateRef = "mySqlSessionTemplate")
public class ProductDataSourceConfig {

	@Autowired
	private ProductDbConfig productDbConfig;

	@Bean(destroyMethod = "close", name = "mydb")
	protected HikariDataSource buildDataSource() {
		HikariConfig cfg = new HikariConfig();
		cfg.setUsername(productDbConfig.getUsername());
		cfg.setPassword(productDbConfig.getPassword());
		cfg.setJdbcUrl(productDbConfig.getUrl());
		cfg.setDriverClassName(productDbConfig.getDriver());
		cfg.setIdleTimeout(productDbConfig.getTimeout());
		cfg.setMaximumPoolSize(productDbConfig.getPool());
		return new HikariDataSource(cfg);
	}

	@Bean(name = "mytx")
	protected PlatformTransactionManager createTransactionManager(@Qualifier("mydb") DataSource dataSource) {
		return new DataSourceTransactionManager(dataSource);
	}

	@Bean(name = "mySqlSessionFactory")
	public SqlSessionFactory sqlSessionFactory(@Qualifier("mydb") DataSource dataSource) throws Exception {
		final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
		sessionFactory.setDataSource(dataSource);
		return sessionFactory.getObject();
	}

	@Bean(name = "mySqlSessionTemplate")
	public SqlSessionTemplate amonSqlSessionTemplate(
			@Qualifier("mySqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
		return new SqlSessionTemplate(sqlSessionFactory);
	}
}
