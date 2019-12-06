package com.manthan.bean.dao;

import com.manthan.files.bean.ProductInfoBean;
import com.manthan.files.bean.UserInfoBean;

public interface UserInfoDao {
	public UserInfoBean authenticate(String email,String password);
	public UserInfoBean register(int user_id,String user_name,String email,String password);

	

}
