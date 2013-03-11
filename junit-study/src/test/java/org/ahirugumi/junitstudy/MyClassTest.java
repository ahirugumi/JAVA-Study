/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ahirugumi.junitstudy;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import org.junit.Ignore;

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
}