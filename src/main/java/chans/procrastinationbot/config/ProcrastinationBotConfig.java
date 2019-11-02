package chans.procrastinationbot.config;

import org.springframework.context.annotation.Configuration;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.annotation.PostConstruct;

@Configuration
@RequiredArgsConstructor
public class ProcrastinationBotConfig {


    @PostConstruct
    public void postConstruct() {
        for(int i = 0; i < 10; i++)
        System.out.println("HELELELAJSDLFJASLDJFJLASDFJASDFJL");
    }


}
