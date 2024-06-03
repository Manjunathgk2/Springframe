package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class appconfig
{
    @Bean
    public samsung getphone()
    {
        return new samsung();
    }
}
