/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ahirugumi.junitstudy;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

/**
 *
 * @author tomohiro
 */
@RunWith(Categories.class)
@IncludeCategory(Category1Tests.class)
@ExcludeCategory(Category2Tests.class)
@SuiteClasses({MyCategoryClassTest.class, MyCategoryMethodTest.class})
public class CategorizedSuteTest{
}