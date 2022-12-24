package AbstractfactoryMobiles;

import AbstractFactory.Device;

public class OnePlus extends Device {

	

	private String ram;
	private int version;
	
	public OnePlus(String ram, int version) {
		super();
		this.ram = ram;
		this.version = version;
	}

	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return "OnePlusL ::::  ram is "+this.ram + "and version is "+this.version;
	}

	@Override
	public String toString() {
		return "OnePlus [ram=" + ram + ", version=" + version + "]";
	}
	
	
	
}
