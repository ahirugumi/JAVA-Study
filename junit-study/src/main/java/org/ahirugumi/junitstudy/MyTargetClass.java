/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ahirugumi.junitstudy;

import java.util.Date;

/**
 *
 * @author tomohiro
 */
public class MyTargetClass {
	public void method1(){
		MyExampleClass ex=newMyExampleClass();
		ex.test1();
		//この後業務ロジック
	}
	
	public Date method2(){
		return newDateClass();
	}
	
	protected Date newDateClass(){
		return newDateClass();
	}
	
	protected MyExampleClass newMyExampleClass(){
		return new MyExampleClass();
	}
}
