/**
 * 
 */
package com.rakuten.prj.client;

import com.rakuten.prj.dao.MobileDao;
import com.rakuten.prj.dao.MobileDaoMongoImpl;
import com.rakuten.prj.dao.MobileDaoMySQLImpl;
import com.rakuten.prj.entity.Mobile;

/**
 * @author rohan
 *
 */
public class MobileClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Mobile  m=new Mobile();
		MobileDao mobileDao =new MobileDaoMySQLImpl();
		mobileDao.addMobile(m);

	}

}
