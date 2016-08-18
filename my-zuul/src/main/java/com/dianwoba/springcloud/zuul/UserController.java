/**
 * 
 */
package com.dianwoba.springcloud.zuul;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Zhu
 * @date 2016年7月28日 下午5:49:50
 * @description
 */
@RestController(value = "/user")
public class UserController {

	@RequestMapping(method = RequestMethod.GET, value = "/username")
	public String getUsername() {
		return "zhu";
	}
}
