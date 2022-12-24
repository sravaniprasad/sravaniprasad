package string;

public class CheckName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String userName="sravani123";

isValidUsername(userName);
	}

	static boolean isValidUsername(String userName) {
		
		if(userName.contains(" ")||userName.contains("/")||userName.contains("@")) {
		return false;
		}
		return true;
		// TODO Auto-generated method stub
		
	}

}
