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
public class MyCategoryMethodTest {

	@Category(Category1Tests.class)
	@Test
	public void category1_test1() {
		System.out.println("category1_test1");
	}

	@Category(Category2Tests.class)
	@Test
	public void category2_test1() {
		System.out.println("category2_test1");
	}
}
