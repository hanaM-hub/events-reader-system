package project.eventsreadersystem.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.scheduling.annotation.EnableAsync;

import javax.sql.DataSource;

@Configuration
@EnableAsync
@ComponentScan({
        "project.eventsreadersystem.service",
        "project.eventsreadersystem.entity",
        "project.eventsreadersystem.repository"
})
public class Config {
    @Bean(name = "dataBseName")
    @Primary
    @ConfigurationProperties(prefix="spring.datasource")
    public DataSource primaryDataSource() {
        return DataSourceBuilder.create().build();
    }
}