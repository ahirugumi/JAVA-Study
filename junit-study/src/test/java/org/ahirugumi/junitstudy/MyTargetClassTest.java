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
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertThat;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author tomohiro
 */
public class MyTargetClassTest {

	public MyTargetClassTest() {
	}

	@BeforeClass
	public static void setUpClass() {
	}

	@AfterClass
	public static void tearDownClass() {
	}

	@Before
	public void setUp() {
	}

	@Test
	public void 副作用メソッドをオーバーライドテスト() {
		//副作用があるクラスをメソッドに切り出して、オーバーライドできるようする。
		//その後、テストクラスで、オーバーライドする
		//以下の例では、モックを作り、副作用があるクラスを切り替える
		MyTargetClass target = new MyTargetClass() {
			@Override
			protected MyExampleClass newMyExampleClass() {
				return new MockMyExampleClass();
			}
		};
		target.method1();
	}

	@Test
	public void 副作用にする日付のテスト() {
		//副作用がある日付クラスを返すメソッドを作成する。
		//そのメソッドをオーバーライドし、適当な日付を返すようにして、テストをする。
		MyTargetClass target = new MyTargetClass() {
			@Override
			protected Date newDateClass() {
				Date date = null;
				try {
					date = DateFormat.getDateInstance().parse("2013/02/16");
				} catch (ParseException ex) {
					Logger.getLogger(MyTargetClassTest.class.getName()).log(Level.SEVERE, null, ex);
				}
				return date;
			}
		};
		assertThat(getDateString(target.method2()), is("2013/02/16"));
	}

	private String getDateString(Date dt) {
		DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
		return df.format(dt);
	}

	@After
	public void tearDown() {
	}
}