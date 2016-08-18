/**
 * 
 */
package com.dianwoba.springcloud.eureka.client;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Zhu
 * @date 2016年7月22日 下午3:23:42
 * @description
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class Application {

	@RequestMapping("/")
	public String home() {
		return "Hello world";
	}

	public static void main(String[] args) {
		new SpringApplicationBuilder(Application.class).bannerMode(Mode.OFF).web(true).run(args);
	}

}
