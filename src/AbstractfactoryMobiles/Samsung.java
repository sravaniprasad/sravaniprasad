package AbstractfactoryMobiles;

import AbstractFactory.Device;

public class Samsung extends Device{

	
	private String ram;
	private int version;
	
	
	
	
	
	public Samsung(String ram, int version) {
		super();
		this.ram = ram;
		this.version = version;
	}





	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return "Samsung ::::  ram is "+this.ram + "and version is "+this.version;
	}





	@Override
	public String toString() {
		return "Samsung [ram=" + ram + ", version=" + version + "]";
	}

	
	
}
