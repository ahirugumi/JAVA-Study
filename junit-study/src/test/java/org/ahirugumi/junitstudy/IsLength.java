/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ahirugumi.junitstudy;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;


/**
 *
 * @author tomohiro
 */
public class IsLength extends BaseMatcher<String>{

	private String len;
	IsLength(String arg){
		len=arg;
	}
	
	/**
	 * テストが成功するか失敗するかをtrueかfalseで返す
	 * @param item
	 * @return 
	 */
	@Override
	public boolean matches(Object item) {
		if (!(item instanceof String)) return false;
		if (((String)item).length() != this.len.length()) return false;
		return true;
	}

	/**
	 * テストに失敗した場合のメッセージの作成
	 */
	@Override
	public void describeTo(Description description) {
		description.appendValue(this.len);
		description.appendText(" but item is ");
		description.appendValue(this.len.length());
	}
	public static Matcher<String> lengthOf(String arg)
	{
		return new IsLength(arg);
	}
}
