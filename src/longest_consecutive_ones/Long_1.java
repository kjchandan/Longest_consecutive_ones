package longest_consecutive_ones;

import java.util.*;
public class Long_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int count =0;
		
		while(n>0) 
		{
		n = n & n<<1;
		count++;
		}
		System.out.println(count);
	}

}
