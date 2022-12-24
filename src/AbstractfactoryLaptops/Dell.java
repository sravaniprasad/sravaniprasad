package AbstractfactoryLaptops;

import AbstractFactory.Device;

public class Dell extends Device{

	private String ram;
	private int version;
	
	
	
	
	public Dell(String ram, int version) {
		super();
		this.ram = ram;
		this.version = version;
	}


	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return "DELL ::::  ram is "+this.ram + "and version is "+this.version;
	}


	@Override
	public String toString() {
		return "Dell [ram=" + ram + ", version=" + version + "]";
	}
	
	

}
