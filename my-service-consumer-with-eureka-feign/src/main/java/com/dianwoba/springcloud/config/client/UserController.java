/**
 * 
 */
package com.dianwoba.springcloud.config.client;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dianwoba.springcloud.config.client.api.UserClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * @author Zhu
 * @date 2016年7月27日 下午1:44:26
 * @description
 */
@RestController
public class UserController {

	@Resource
	private UserClient userClient;

	@RequestMapping("/")
	@HystrixCommand(fallbackMethod = "testFallback")
	public String test() {
		return userClient.getUsername();
	}

	@SuppressWarnings("unused")
	private String testFallback() {
		return "fallback";
	}
}
