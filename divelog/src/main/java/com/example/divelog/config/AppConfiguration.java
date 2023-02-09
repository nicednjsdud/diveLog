package com.example.divelog.config;

import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationPropertiesScan
@EnableConfigurationProperties({SiteProperties.class})
public class AppConfiguration {

}
