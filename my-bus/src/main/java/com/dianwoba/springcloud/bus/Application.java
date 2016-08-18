/**
 * 
 */
package com.dianwoba.springcloud.bus;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Zhu
 * @date 2016年7月26日 下午3:26:03
 * @description
 */
@SpringBootApplication
@EnableEurekaClient
public class Application {

	public static void main(String[] args) {
		new SpringApplicationBuilder(Application.class).profiles("dev").bannerMode(Mode.OFF).web(true).run(args);
	}

}
