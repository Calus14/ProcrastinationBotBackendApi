package chans.procrastinationbot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("chans.procrastinationbot.repository")
public class ProcrastinationBot {

    public static void main(String[] args) {
        SpringApplication.run(ProcrastinationBot.class, args);
    }

}

