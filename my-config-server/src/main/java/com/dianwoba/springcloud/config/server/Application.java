/**
 * 
 */
package com.dianwoba.springcloud.config.server;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author Zhu
 * @date 2016年7月26日 下午1:51:18
 * @description
 */
@SpringBootApplication
@EnableConfigServer
public class Application {

	public static void main(String[] args) {
		new SpringApplicationBuilder(Application.class).bannerMode(Mode.OFF).web(true).run(args);
	}

}
