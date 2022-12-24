package Practice;
class Jeep1{
	
	private String jeepName;
	
	
	private final Engine engine;
	
	public Jeep1(String jeepName,int cost,String type) {
		
		engine =new Engine();
		this.jeepName=jeepName;
		engine.setCost(cost);
		engine.setType(type);
	}

	public Engine getEngine() {
		return engine;
	}

	public String getJeepName() {
		return jeepName;
	}

	public void setJeepName(String jeepName) {
		this.jeepName = jeepName;
	}

	@Override
	public String toString() {
		return "Jeep1 [jeepName=" + jeepName + ", engine=" + engine + "]";
	}
	
	
}
public class Composition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Jeep1 jeep=new Jeep1("mahindra",20000,"honda");

Engine engine1=jeep.getEngine();
//System.out.println("Engine :"+engine1.getCost()+"  "+engine1.getType());
//System.out.println("Jeep :"+jeep.getJeepName());
System.out.println(jeep);
	
//    jeep=null;
//	jeep.getEngine();
	
	
	}

}
