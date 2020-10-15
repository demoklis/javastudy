package com.demoklis.starter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@ConditionalOnClass(Service.class)
@EnableConfigurationProperties(Properties.class)
public class ExampleAutoConfig {
    @Autowired
    private Properties properties;

    public ExampleAutoConfig(){

    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(prefix = "example.service",value = "enabled",havingValue = "true")
    public Service exampleService(){
        return new Service(properties.getPrefix(),properties.getSuffix());
    }
}
