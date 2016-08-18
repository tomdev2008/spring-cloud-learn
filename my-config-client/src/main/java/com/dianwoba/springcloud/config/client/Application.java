/**
 * 
 */
package com.dianwoba.springcloud.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.Banner.Mode;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Zhu
 * @date 2016年7月26日 下午3:26:03
 * @description
 */
@SpringBootApplication
@RestController
public class Application {

	@Value("${redis.master.name}")
	private String redisMasterName;

	@RequestMapping("/")
	public String home() {
		return redisMasterName;
	}

	public static void main(String[] args) {
		new SpringApplicationBuilder(Application.class).profiles("dev").web(true).run(args);
	}

}
