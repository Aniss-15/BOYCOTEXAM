package tn.esprit.testboycott;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class TestBoycottApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestBoycottApplication.class, args);
    }

}
