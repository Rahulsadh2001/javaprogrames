package SumofEvenNumber;

public class EvenSum {

	public static void main(String[] args) {
		int snumber=8;
		int lnumber=250;
		int sum =0;
		for(int i=snumber;i<=lnumber;i++) {
			
			if(i%2==0) {
				
				sum =sum +i;
				
			}
		}
System.out.print(sum);
	}

}
