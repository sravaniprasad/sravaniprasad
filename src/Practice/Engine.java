package Practice;

public class Engine {

	private  int cost;
	private String type;
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Engine [cost=" + cost + ", type=" + type + "]";
	}
	
	
	
}
