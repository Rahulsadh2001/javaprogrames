package PalindromeNumber;

public class P {

	public static void main(String[] args) {
		int num= 122;
		int rev=0,temp;
		temp=num;
		while(num>1)
		{	num=num%10;
		rev=rev*10+num;
		num=num/10;
		}
		if (temp==rev) {
			
			System.out.println("number is palidrome");
		}
		else {System.out.println("number is not palidrome");}
	}

}
