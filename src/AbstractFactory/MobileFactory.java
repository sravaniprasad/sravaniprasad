package AbstractFactory;

import AbstractfactoryLaptops.Dell;
import AbstractfactoryLaptops.Hp;
import AbstractfactoryMobiles.OnePlus;
import AbstractfactoryMobiles.Samsung;

public class MobileFactory extends AbstractDeviceFactory{

	@Override
	Device getGadget(DeviceType devicetype) {
		// TODO Auto-generated method stub
		switch(devicetype) {
		case Samsung:
			return new Samsung("4GB",7);
		case OnePlus:
			return new OnePlus("6GB",9);
			
		
		}
		
		return null;
	}

	
}
