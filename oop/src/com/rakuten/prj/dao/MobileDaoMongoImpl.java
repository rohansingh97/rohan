/**
 * 
 */
package com.rakuten.prj.dao;

import com.rakuten.prj.entity.Mobile;

/**
 * @author rohan
 *
 */
public class MobileDaoMongoImpl implements MobileDao {

	@Override
	public void addMobile(Mobile m) {
		System.out.println("Stored in Mongodb");

	}

}
