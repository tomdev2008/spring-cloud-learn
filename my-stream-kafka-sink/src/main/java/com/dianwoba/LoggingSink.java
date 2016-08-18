/**
 * 
 */
package com.dianwoba;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * @author Zhu
 * @date 2016年8月1日 下午12:32:19
 * @description
 */
@EnableBinding(Sink.class)
public class LoggingSink {

	@StreamListener(Sink.INPUT)
	public void log(String message) {
		System.out.println(message);
	}
}
