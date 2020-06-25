package sample.liquibase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.*;

@Controller
@SpringBootApplication
public class SampleLiquibaseApplication {
    @RequestMapping("/")
        @ResponseBody
        String home() {
        return "DB Migrate Demo using the Liquibase !!!!!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleLiquibaseApplication.class, args);
    }

}