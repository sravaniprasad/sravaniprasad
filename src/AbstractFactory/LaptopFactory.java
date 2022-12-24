package AbstractFactory;

import AbstractfactoryLaptops.Dell;
import AbstractfactoryLaptops.Hp;

public class LaptopFactory extends AbstractDeviceFactory{

	@Override
	Device getGadget(DeviceType devicetype) {
		// TODO Auto-generated method stub
		switch(devicetype) {
		case Dell:
			return new Dell("8GB",10);
		case Hp:
			return new Hp("4GB",11,"mediatek");
			
		
		}
		
		return null;
	}

}
