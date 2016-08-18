/**
 * 
 */
package com.dianwoba.springcloud.config.server;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Zhu
 * @date 2016年7月26日 下午1:51:18
 * @description
 */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class Application {

	public static void main(String[] args) {
		new SpringApplicationBuilder(Application.class).bannerMode(Mode.OFF).web(true).run(args);
	}

}
