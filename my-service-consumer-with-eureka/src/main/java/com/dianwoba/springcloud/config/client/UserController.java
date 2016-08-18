/**
 * 
 */
package com.dianwoba.springcloud.config.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

/**
 * @author Zhu
 * @date 2016年7月27日 下午1:44:26
 * @description
 */
@RestController
public class UserController {

	private static final String SERVICE_NAME = "MY-SERVICE-PROVIDER";

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/")
	@HystrixCommand(fallbackMethod = "testFallback", commandProperties = {
			@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1") })
	public String test() {
		return restTemplate.getForObject(buildUrl("user/username"), String.class);
	}

	private String buildUrl(String uri) {
		return String.format("http://%s/%s", SERVICE_NAME, uri);
	}

	@SuppressWarnings("unused")
	private String testFallback() {
		return "fallback";
	}
}
