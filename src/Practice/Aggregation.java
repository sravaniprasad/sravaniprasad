package Practice;

import java.util.List;

//aggregation-------independent,weak association
class Jeep{
	
	private String jeepName;
	private int jeepCost;
	
	private MusicPlayer musicPlayer;

	public Jeep(String jeepName, int jeepCost, MusicPlayer musicPlayer) {
		//super();
		this.jeepName = jeepName;
		this.jeepCost = jeepCost;
		this.musicPlayer = musicPlayer;
	}

	@Override
	public String toString() {
		return "Jeep [jeepName=" + jeepName + ", jeepCost=" + jeepCost + ", musicPlayer=" + musicPlayer + "]";
	} 
	
	
}

public class Aggregation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MusicPlayer musicPlayer=null;
		
		MusicPlayer musicPlayer=new MusicPlayer("sony",5000);
		Jeep jeep=new Jeep("Mahindra",20,musicPlayer);
		System.out.println(jeep);
		
	}

}
