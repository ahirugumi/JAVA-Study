/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ahirugumi.junitstudy;

import java.util.ArrayList;
import java.util.List;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.matchers.JUnitMatchers.*;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertThat;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 *
 * @author tomohiro
 */
public class MyClassTest {

	public MyClassTest() {
	}

	@BeforeClass
	public static void setUpClass() {
		System.out.println("before class");
	}

	@AfterClass
	public static void tearDownClass() {
		System.out.println("after class");
	}

	@Before
	public void setUp() {
		System.out.println("before");
	}

	@After
	public void tearDown() {
		System.out.println("after");
	}

	@Ignore
	public void ignoreで除外するテスト()
	{
		System.out.println("ignore");
	}
	
	@Test
	public void getNameのテスト() 
	{
		System.out.println("getNemeテスト");
		assertThat(new MyClass().getName(),is("myclass"));
	}
	
	@Test
	public void CustomMatcherのテスト()
	{
		//lengthが同じだと成功
		assertThat(new String("foo"),is(IsLength.lengthOf("aaa")));
		//lengthが違うと失敗
		assertThat(new String("foo"),is(IsLength.lengthOf("aa")));
	}
	
	@Test
	public void matcherのテスト()
	{
		//equalsか
		assertThat("is",is("is"));
		//not equalsか
		assertThat("is not",is(not("is")));
		//nullか
		assertThat(null,is(nullValue()));
		//not nullか
		assertThat("not null",is(notNullValue()));
		//同じインスタンスか
		String foo=new String();
		String bar=foo;
		assertThat(foo,is(sameInstance(bar)));
		//指定したインスタンスか
		assertThat("instance",is(instanceOf(String.class)));

		List<String> list = new ArrayList<String>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		//リストに値が含まれているか
		assertThat(list,hasItems("aaa","ccc"));
		assertThat(list,hasItem("ccc"));
	}
}