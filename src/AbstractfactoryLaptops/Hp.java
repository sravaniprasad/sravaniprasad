package AbstractfactoryLaptops;

import AbstractFactory.Device;

public class Hp extends Device {

	
	private String ram;
	private int version;
	private String cpu;
	
	
	
	
	
	public Hp(String ram, int version, String cpu) {
		super();
		this.ram = ram;
		this.version = version;
		this.cpu = cpu;
	}


	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return "DELL ::::  ram is "+this.ram + "and version is "+this.version +"CPU is  "+this.cpu;
	}


	@Override
	public String toString() {
		return "Hp [ram=" + ram + ", version=" + version + ", cpu=" + cpu + "]";
	}

	
}
