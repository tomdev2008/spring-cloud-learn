/**
 * 
 */
package com.dianwoba.springcloud.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Zhu
 * @date 2016年7月28日 下午5:49:50
 * @description
 */
@RestController
@RequestMapping(value = "/user")
@RefreshScope
public class UserController {

	@Value("${env}")
	private String env;

	@RequestMapping(method = RequestMethod.GET, value = "/test")
	public String test() {
		return env;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/username")
	public String getUsername() {
		return "zhu";
	}
}
