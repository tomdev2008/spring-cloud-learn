/**
 * 
 */
package xxx;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.Feign;
import feign.Logger;
import feign.Request.Options;
import feign.Retryer;

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

	@Bean
	public Retryer retryer() {
		return new Retryer.Default(0, 0, 0);
	}
	
	@Bean
	public Options options(){
		return new Options(10 * 1000, 1 * 1000);
	}
}
