package org.ahirugumi.study.loggingproxy;

/**
 * ロギングのターゲットになるクラス
 * ビジネスロジックを想定
 * 
 * @author ahirugumi
 */
public class MyLogic implements IBaseLogic {

	public String method1(String[] args) {
		System.out.println("method1");
		return "";
	}

	public int method2(int arg) {
		System.out.println("method2");
		return 0;
	}

	public Object method3() {
		System.out.println("method3");
		return null;
	}
}
