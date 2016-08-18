/**
 * 
 */
package com.dianwoba.springcloud.eureka.server;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Zhu
 * @date 2016年7月22日 下午2:37:49
 * @description
 */
@SpringBootApplication
@EnableEurekaServer
public class Application {

	public static void main(String[] args) {
		new SpringApplicationBuilder(Application.class).bannerMode(Mode.OFF).web(true).run(args);
	}

}