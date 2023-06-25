package week1.dayone;

import java.util.Iterator;

public class Fabonocci {

	public static void main(String[] args) {
		
int n = 15;

int firstnumber = 0;
 int secondnumber = 1;
 
 System.out.println("print fabonacci series");
 
 for (int i = 1; i<=n;i++) {
	 
	 int sum = firstnumber + secondnumber;
	 firstnumber = secondnumber;
	 secondnumber = sum;
	 System.out.println(firstnumber + " ");
 }
 
	}

}
