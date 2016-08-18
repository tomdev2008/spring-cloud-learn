/**
 * 
 */
package com.dianwoba.springcloud.config.client.api;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dianwoba.springcloud.config.client.api.UserClient.UserClientFallback;

import xxx.UserConfiguration;

/**
 * @author Zhu
 * @date 2016年7月28日 下午1:09:19
 * @description
 */
@FeignClient(name = "my-service-provider", fallback = UserClientFallback.class, configuration = UserConfiguration.class)
public interface UserClient {
	@RequestMapping(method = RequestMethod.GET, value = "/user/username")
	String getUsername();

	@Component
	static class UserClientFallback implements UserClient {

		/*
		 * (non-Javadoc)
		 * 
		 * @see
		 * com.dianwoba.springcloud.config.client.api.UserClient#getUsername()
		 */
		@Override
		public String getUsername() {
			return "fuck";
		}
	}
}
