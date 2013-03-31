/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ahirugumi.junitstudy;

import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 *
 * @author tomohiro
 */
@Category(Category1Tests.class)
public class MyCategoryClassTest {

	@Test
	public void category1_test1() {
		System.out.println("category1_test1");
	}

	@Test
	public void category1_test2() {
		System.out.println("category1_test2");
	}
}
