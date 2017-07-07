package com.tb.sso.query.api.server;

import com.tb.sso.query.api.bean.TbUser;

public interface QueryUserService {
	
	
	/**
	 * 通过token获取用户服务
	 * @param token
	 * @return
	 */
	public TbUser queryUserByToken(String token);

}
