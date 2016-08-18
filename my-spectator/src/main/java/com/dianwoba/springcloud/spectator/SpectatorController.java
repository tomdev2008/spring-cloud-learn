/**
 * 
 */
package com.dianwoba.springcloud.spectator;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.spectator.api.Counter;
import com.netflix.spectator.api.Registry;

/**
 * @author Zhu
 * @date 2016年7月28日 下午5:49:50
 * @description
 */
@RestController
@RequestMapping("/spectator")
public class SpectatorController {

	@Resource
	private Registry registry;

	@RequestMapping(method = RequestMethod.GET, value = "/add")
	public void add() {
		// create a counter with a name and a set of tags
		Counter counter = registry.counter("counterTest", "key", "value");
		counter.increment(); // increment when an event occurs
		counter.increment(10);
	}
}
