/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ahirugumi.junitstudy;

import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;
import org.junit.experimental.runners.Enclosed;

/**
 *
 * @author tomohiro
 */
//Enclosedで構造化
@RunWith(Enclosed.class)
public class MyClassParameterTest {

	@RunWith(Theories.class)
	public static class パラメータ化テスト {

		//@DataPointでパラメータ指定
		@DataPoint
		public static Fixture DATA1 = new Fixture(MyClass.Weeks.MON, MyClass.Weeks_JP.月);
		@DataPoint
		public static Fixture DATA2 = new Fixture(MyClass.Weeks.TUE, MyClass.Weeks_JP.火);
		@DataPoint
		public static Fixture DATA3 = new Fixture(MyClass.Weeks.WED, MyClass.Weeks_JP.水);
		@DataPoint
		public static Fixture DATA4 = new Fixture(MyClass.Weeks.THU, MyClass.Weeks_JP.木);
		@DataPoint
		public static Fixture DATA5 = new Fixture(MyClass.Weeks.FRI, MyClass.Weeks_JP.金);
		@DataPoint
		public static Fixture DATA6 = new Fixture(MyClass.Weeks.SAT, MyClass.Weeks_JP.土);
		@DataPoint
		public static Fixture DATA7 = new Fixture(MyClass.Weeks.SUN, MyClass.Weeks_JP.日);

		@Theory
		public void パラメータ化テスト(Fixture fx) {
			String msg = fx.week + " -> " + fx.week_jp;
			System.out.println(msg);
			MyClass my = new MyClass();
			assertThat(msg, my.getWeek(fx.week), is(fx.week_jp));
		}

		//フィクスチャオブジェクトでパラメータを作る
		static class Fixture {

			MyClass.Weeks week;
			MyClass.Weeks_JP week_jp;

			Fixture(MyClass.Weeks week, MyClass.Weeks_JP week_jp) {
				this.week = week;
				this.week_jp = week_jp;
			}
		}
	}
}
