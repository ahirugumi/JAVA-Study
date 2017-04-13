/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ahirugumi.junitstudy;

import java.util.Date;

/**
 *
 * @author tomohiro
 */
public class MyDateFactoryImpl implements IDateFactory{

	public Date newMyDate() {
		return new Date();
	}
	
}
