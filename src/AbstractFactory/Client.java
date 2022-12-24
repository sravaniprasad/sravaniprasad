package AbstractFactory;

public class Client {
public static void main(String args[]) {
	Device dell=FactoryGenerator.getFactory(FactoryType.LaptopFactory).getGadget(DeviceType.Dell);

System.out.println(dell.getDetails());

AbstractDeviceFactory mobile=FactoryGenerator.getFactory(FactoryType.MobileFactory);
Device mobile1=mobile.getGadget(DeviceType.Samsung);

System.out.println(mobile1.getDetails());


}
}
