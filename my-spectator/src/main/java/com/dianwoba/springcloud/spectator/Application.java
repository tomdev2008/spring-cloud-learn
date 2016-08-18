/**
 * 
 */
package com.dianwoba.springcloud.spectator;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author Zhu
 * @date 2016年7月26日 下午3:26:03
 * @description
 */
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		new SpringApplicationBuilder(Application.class).profiles("dev").bannerMode(Mode.OFF).web(true).run(args);
	}

}
