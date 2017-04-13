/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ahirugumi.junitstudy;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;

/**
 *
 * @author tomohiro
 */
public class MyTargetDelegationClassTest {

	@Test
	public void 副作用にする日付factoryのテスト() {
		MyTargetDelegationClass target = new MyTargetDelegationClass();
		target.setFactory(new MyDateFactory() {
			@Override
			public Date newMyDate() {
				Date date = null;
				try {
					date = DateFormat.getDateInstance().parse("2013/02/16");
				} catch (ParseException ex) {
					Logger.getLogger(MyTargetClassTest.class.getName()).log(Level.SEVERE, null, ex);
				}
				return date;
			}
		});
		assertThat(getDateString(target.method2()), is("2013/02/16"));
	}

	private String getDateString(Date dt) {
		DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
		return df.format(dt);
	}

	@Test
	public void 副作用にする日付interfaceのテスト() {
		MyTargetDelegationClass target = new MyTargetDelegationClass();
		target.setIfactory(new MyDateFactoryImpl() {
			@Override
			public Date newMyDate() {
				Date date = null;
				try {
					date = DateFormat.getDateInstance().parse("2013/02/16");
				} catch (ParseException ex) {
					Logger.getLogger(MyTargetClassTest.class.getName()).log(Level.SEVERE, null, ex);
				}
				return date;
			}
		});
		assertThat(getDateString(target.method3()), is("2013/02/16"));
	}
	
	@Test
	public void 副作用メソッドをオーバーライドテスト() {
		MyTargetDelegationClass target = new MyTargetDelegationClass();
		target.setExampleFactory(new MyExampleFactory(){
			@Override
			public MyExampleClass newMyExampleClass(){
				return new MockMyExampleClass();
			}
		});
		target.mehotd1();
	}

	@Test
	public void 副作用メソッドをオーバーライドテスト_intergace() {
		MyTargetDelegationClass target = new MyTargetDelegationClass();
		target.setIexampleFactory(new MyExampleFactoryImpl(){
			@Override
			public MyExampleClass newMyExampleClass(){
				return new MockMyExampleClass();
			}
		});
		target.mehotd0();
	}
}
