/**
 * 
 */
package com.dianwoba.springcloud.api.impl;

import com.dianwoba.springcloud.api.UserService;

/**
 * @author Zhu
 * @date 2016年7月25日 下午1:29:04
 * @description
 */
public class UserServiceImpl implements UserService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.dianwoba.springcloud.api.UserService#getUsername(int)
	 */
	@Override
	public String getUsername(int id) {
		return "zhuchao";
	}

}
