package org.ahirugumi.study.seaser.di;

public class SetterInject {

	private IDomain domain;

	public void execute() {
		System.out.println("SetterInject -> execute() start");
		domain.execute();
		System.out.println("SetterInject -> execute() end");
	}

	public void setDomain(IDomain domain) {
		this.domain = domain;
	}
}
