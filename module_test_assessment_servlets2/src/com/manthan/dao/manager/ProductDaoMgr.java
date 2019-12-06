package com.manthan.dao.manager;

import com.manthan.bean.dao.ProductDao;
import com.manthan.bean.dao.ProductInfoDaoImplements;

public class ProductDaoMgr {
	private ProductDaoMgr()
	{
		
	}
	public static ProductDao getDaoIns()
	{
		return new ProductInfoDaoImplements();
		
	}

}
