/**
 * 
 */
package xxx;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.Logger;

/**
 * @author Zhu
 * @date 2016年7月28日 下午2:15:30
 * @description 
 */
@Configuration
public class UserConfiguration {
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
