package sounds.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sounds.CompactDisc;
import sounds.SgtPeppers;

/**
 * Created by zjx on 2018/6/4.
 */
@Configuration
public class CDConfig {
    @Bean
    public CompactDisc sgtPepers(){
        return new SgtPeppers();
    }
}
