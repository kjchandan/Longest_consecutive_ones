package longest_consecutive_ones;

import java.util.*;
public class Long_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int count =0;  //Take count as 0
		
		while(n>0)   //loop untill n is 0.
		{
		n = n & n<<1;  // check if n and left shift of n is not eqal to zer and then give to assign the value to n.
		count++;      //If it is not eqal to zero then increment count . 
		}
		System.out.println(count);// soo we eill get eh consecutivte ones as many as count.
	}

}
