package com.manthan.dao.manager;

import com.manthan.bean.dao.UserInfoDao;
import com.manthan.bean.dao.UserInfoDaoImplements;

public class UserDaoMgr {
	private UserDaoMgr()
	{
		
	}
	public static UserInfoDao getDaoIns()
	{
		return new UserInfoDaoImplements();
		
	}

}
