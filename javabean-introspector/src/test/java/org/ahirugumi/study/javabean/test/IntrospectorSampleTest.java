/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ahirugumi.study.javabean.test;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.ahirugumi.study.javabean.IntrospectorSample;
import org.junit.Test;
import static junit.framework.Assert.*;

/**
 * Introspector Sample Test
 *
 * @author ahirugumi
 */
public class IntrospectorSampleTest {

	@Test
	public void testIntrospector_Sample() {
		BeanInfo bean;
		try {
			bean = Introspector.getBeanInfo(IntrospectorSample.class);
			PropertyDescriptor[] pd = bean.getPropertyDescriptors();
			for (PropertyDescriptor proDes : pd) {
				System.out.println("プロパティの名前 : " + proDes.getName());
				System.out.println("Getterの名前 : " + proDes.getReadMethod());
				System.out.println("Setterの名前 : " + proDes.getWriteMethod());
				System.out.println("===");
			}
		} catch (IntrospectionException ex) {
			Logger.getLogger(IntrospectorSampleTest.class.getName()).log(Level.SEVERE, null, ex);
			fail("テスト失敗");
		}
	}
}
