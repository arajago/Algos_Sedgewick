
public class Ex1_1_19{
	
	public static void main(String[] args){
		if(args.length != 1){
			System.out.println("Not enough arguments");
		}
		int n= Integer.parseInt(args[0]);
		//System.out.println("Inefficient Fibonnaci caluculation: "+fibonacci(n));
		System.out.println("tailRecursiveFibonnaci Fibonnaci caluculation: "+tailRecursiveFibonnaci(0,1,n));
		
		
	}
	
	//Given n, find the nth fibonacci number;
	public static long fibonacci(int n){
		if(n==1 ){
			return 0;
		}
		if(n==2){
			return 1;
		}
		return fibonacci(n-1)+fibonacci(n-2);
	}
	
	
	public static long tailRecursiveFibonnaci(int first, int second, int n){
		if(n==1){
			return 0;
		}
		if(n==2){
			return second;
		}
		return tailRecursiveFibonnaci(second, first+second, n-1);
		
	}
	
}