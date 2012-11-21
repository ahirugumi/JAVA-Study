package org.ahirugumi.study.seaser.di.test;

import org.ahirugumi.study.seaser.di.ConstructorInject;
import org.ahirugumi.study.seaser.di.MethodInject;
import org.ahirugumi.study.seaser.di.SetterInject;
import org.junit.Test;
import org.seasar.framework.container.S2Container;
import org.seasar.framework.container.factory.S2ContainerFactory;

public class SeaserDiTest {

	/**
	 * SetterInjection Test
	 */
	@Test
	public void testSetterInject() {
		S2Container con = S2ContainerFactory.create("org/ahirugumi/study/seaser/di/setter-inject.dicon");
		con.init();
		SetterInject ap = (SetterInject) con.getComponent(SetterInject.class);
		ap.execute();
	}

	/**
	 * ConstructorInjection Test
	 */
	@Test
	public void testConstructorInject() {
		S2Container con = S2ContainerFactory.create("org/ahirugumi/study/seaser/di/constructor-inject.dicon");
		con.init();
		ConstructorInject ap = (ConstructorInject) con.getComponent(ConstructorInject.class);
		ap.execute();
	}

	/**
	 * MethodInjection Test
	 */
	@Test
	public void testMethodInjection() {
		S2Container con = S2ContainerFactory.create("org/ahirugumi/study/seaser/di/method-inject.dicon");
		con.init();
		MethodInject ap = (MethodInject) con.getComponent(MethodInject.class);
		ap.execute();
	}
}
