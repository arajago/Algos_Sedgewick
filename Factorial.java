public class Factorial{

	public static void main(String[] args){
		int n=Integer.parseInt(args[0]);
		System.out.println("Factorial("+n+"): "+factorial(n, 1));
	}
	
	//Factorial using tail recursive
	private static long factorial(int n, long result ){
		if(n==0){
			return result;
		}
		return factorial(n-1, n*result);
	}

}