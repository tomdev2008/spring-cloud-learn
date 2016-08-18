/**
 * 
 */
package com.dianwoba.springcloud.config.client;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
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
public class TestController {

	@Autowired
	private LoadBalancerClient loadBalancer;

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/test1")
	@HystrixCommand(fallbackMethod = "testFallback", threadPoolKey = "test1")
	public String test1() {
		ServiceInstance instance = loadBalancer.choose("my-service-provider");
		URI storesUri = URI.create(String.format("http://%s:%s/user/username", instance.getHost(), instance.getPort()));
		return restTemplate.getForObject(storesUri, String.class);
	}

	@RequestMapping("/test2")
	@HystrixCommand(fallbackMethod = "testFallback", threadPoolKey = "test2", commandProperties = {
			@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1") })
	public String test2() {
		ServiceInstance instance = loadBalancer.choose("my-service-provider");
		URI storesUri = URI.create(String.format("http://%s:%s/user/username", instance.getHost(), instance.getPort()));
		return restTemplate.getForObject(storesUri, String.class);
	}

	@RequestMapping("/test3")
	@HystrixCommand(fallbackMethod = "testFallback", commandProperties = {
			@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1") })
	public String test3() {
		ServiceInstance instance = loadBalancer.choose("my-service-provider-2");
		URI storesUri = URI.create(String.format("http://%s:%s/user/username", instance.getHost(), instance.getPort()));
		return restTemplate.getForObject(storesUri, String.class);
	}

	@SuppressWarnings("unused")
	private String testFallback() {
		return "fallback";
	}
}
