package com.temporintech.multibasepro.config;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppDbConfig {

	@Bean
            @Primary
	@ConfigurationProperties(prefix = "app.datasource")
	public DataSource appDataSource() {
		return DataSourceBuilder.create().build();
	}

}