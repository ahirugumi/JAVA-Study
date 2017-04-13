/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ahirugumi.junitstudy;

/**
 *
 * @author tomohiro
 */
public class MyExampleFactoryImpl implements IExampleFactory{
	public MyExampleClass newMyExampleClass() {
		return new MyExampleClass();
	}
}
