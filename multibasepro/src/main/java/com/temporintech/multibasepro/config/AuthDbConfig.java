package com.temporintech.multibasepro.config;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AuthDbConfig {

	@Bean
	@ConfigurationProperties(prefix = "auth.datasource")
	public DataSource authDataSource() {
		return DataSourceBuilder.create().build();
	}
}