package by.grsu.configuration;

import by.grsu.util.StringCrypter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by alek on 4.4.17.
 */
@Configuration
@ComponentScan({ "by.grsu.test" })
public class BeansConfiguration {

    @Bean(name = "crypter")
    public StringCrypter crypter() {
        return new StringCrypter(new byte[]{3,6,1,2,2,1,9,7});
    }

}
