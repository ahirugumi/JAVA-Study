package org.ahirugumi.study.seaser.di;

public class ConstructorInject {

	private IDomain domain;

	public ConstructorInject(IDomain domain) {
		this.domain = domain;
	}

	public void execute() {
		System.out.println("ConstructorInject -> execute() start");
		domain.execute();
		System.out.println("ConstructorInject -> execute() end");
	}
}
