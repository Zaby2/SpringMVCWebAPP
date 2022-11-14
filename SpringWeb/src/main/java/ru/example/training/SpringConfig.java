package ru.example.training;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.example.training")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
}
