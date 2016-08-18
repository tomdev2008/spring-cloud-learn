/**
 * 
 */
package com.dianwoba.springcloud.atlas;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.Banner.Mode;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.metrics.atlas.AtlasTagProvider;
import org.springframework.cloud.netflix.metrics.atlas.EnableAtlas;
import org.springframework.context.annotation.Bean;

/**
 * @author Zhu
 * @date 2016年7月26日 下午3:26:03
 * @description
 */
@SpringBootApplication
@EnableAtlas
public class Application {

	@Bean
	AtlasTagProvider atlasCommonTags(@Value("${spring.application.name}") String appName) {
		return () -> Collections.singletonMap("app", appName);
	}

	public static void main(String[] args) {
		new SpringApplicationBuilder(Application.class).profiles("dev").bannerMode(Mode.OFF).web(true).run(args);
	}

}
