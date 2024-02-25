package ir.vanosheeh.onlineshop;

import ir.vanosheeh.onlineshop.config.RsaKeyProperties;
import ir.vanosheeh.onlineshop.models.User;
import ir.vanosheeh.onlineshop.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties(RsaKeyProperties.class)
public class OnlineShopApplication {
    public static void main(String[] args)
    {
        SpringApplication.run(OnlineShopApplication.class, args);
    }

//    @Bean
//    CommandLineRunner commandLineRunner(UserRepository users)
//    {
//        return args ->
//        {
//            users.save(new User("user", "{noop}password","ROLE_USER"));
//            users.save(new User("admin", "{noop}password","ROLE_ADMIN"));
//        };
//    }
}