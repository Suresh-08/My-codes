package week1.dayone;

public class SwitchCaseLearning {

	public static void main(String[] args) {

		String browserType = "chrome";
		
		switch (browserType) {
		case "chrome":
			System.out.println("is not edge");
			break;
		case "firefox":
		System.out.println("is not edge");
		break;
		
		case "Edge":
			System.out.println("this is edge");
			break;
		default :
			System.out.println("this is safari");
			break;
		}
	
	}

}
