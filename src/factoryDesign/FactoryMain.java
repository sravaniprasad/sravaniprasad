package factoryDesign;

import factoryDesignPhone.Android;
import factoryDesignPhone.OS;
import factoryDesignPhone.OSFactory;
import factoryDesignPhone.Windows;

public class FactoryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
OSFactory  osf=new OSFactory();
		//OS obj=new Windows();
OS obj=osf.getInstance("IOS");
		obj.spec();
		OS obj1=osf.getInstance("Android");
		obj1.spec();
		
	}

}
