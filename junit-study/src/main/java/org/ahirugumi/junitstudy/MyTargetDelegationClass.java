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
public class MyTargetDelegationClass {
	private MyDateFactory factory;
	private IDateFactory ifactory;
	private MyExampleFactory exampleFactory;
	private IExampleFactory iexampleFactory;
	
	public void mehotd0(){
		MyExampleClass ex=newMyExampleFactory();
		ex.test1();
		//この後業務ロジック
	}

	public void mehotd1(){
		MyExampleClass ex=newMyExampleFactory();
		ex.test1();
		//この後業務ロジック
	}
	
	public Date method2(){
		return newDateClass();
	}
	
	public Date method3(){
		return newIDateClass();
	}

	protected Date newIDateClass(){
		this.setIfactory(new MyDateFactoryImpl());
		return this.getIfactory().newMyDate();
	}

	protected Date newDateClass(){
		this.setFactory(new MyDateFactory());
		return this.getFactory().newMyDate();
	}

	protected MyExampleClass newMyExampleFactory(){
		this.setExampleFactory(new MyExampleFactory());
		return this.getExampleFactory().newMyExampleClass();
	} 
	
	protected MyExampleClass newIMyExampleFactory(){
		this.setIexampleFactory(new MyExampleFactoryImpl());
		return this.getIexampleFactory().newMyExampleClass();
	} 
	
	public MyDateFactory getFactory() {
		return factory;
	}

	public void setFactory(MyDateFactory factory) {
		this.factory = factory;
	}

	public IDateFactory getIfactory() {
		return ifactory;
	}

	public void setIfactory(IDateFactory ifactory) {
		this.ifactory = ifactory;
	}

	public MyExampleFactory getExampleFactory() {
		return exampleFactory;
	}

	public void setExampleFactory(MyExampleFactory exampleFactory) {
		this.exampleFactory = exampleFactory;
	}

	public IExampleFactory getIexampleFactory() {
		return iexampleFactory;
	}

	public void setIexampleFactory(IExampleFactory iexampleFactory) {
		this.iexampleFactory = iexampleFactory;
	}

}
