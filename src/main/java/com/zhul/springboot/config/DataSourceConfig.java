package com.zhul.springboot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {
	    @Primary
	    @Bean(name = "dsone")
	    @ConfigurationProperties(prefix = "spring.datasource.dsone")
	    public DataSource dataSourceSentence() {
	        return DataSourceBuilder.create().build();
	    }

		//如果有更多的数据源需要，在此添加相关的bean，注意bean属性name，@ConfigurationProperties为配置文件配置数据源的前缀
		//有一个bean就要对于在config文件夹创建对应的xxxConfig.java文件生成工厂
}
