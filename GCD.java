public class GCD{
	public static void main(String[] args){
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		
		System.out.println("GCD of "+n1+" and "+n2+ " is: "+gcd(n1, n2));
	}
	
	public static int gcd(int n1, int n2){
		if(n1 % n2 == 0){
			return n2;
		}
		return gcd(n2, n1%n2);
		
	}
}