public class BinarySearch1{
	
	public static void main(String[] args){
		int[] arr = new int[]{0, 2, 4, 5, 6, 7, 8, 9, 12, 33, 44, 55};
		int n = Integer.parseInt(args[0]);
		
		System.out.println("binarySearch result: "+recursiveBinarySearch(arr, n, 0, arr.length-1));
	}

	
	public static int binarySearch(int[] sortedArr, int n){
		int lo=0;
		int hi=sortedArr.length-1;
		int mid=-1 ;
		while (lo <= hi){
			mid= lo + (hi - lo)/2;
			if(n == sortedArr[mid]){
				return mid;
			}else if(n > sortedArr[mid]){
				lo=mid+1;
			}else{
				hi=mid-1;
			}
		}
		return -1;
	}
	
	public static int recursiveBinarySearch(int[] sortedArr, int n, int lo, int hi){
		if(lo > hi){
			return -1;
		}
		int mid=lo + (hi - lo)/2;
		if(n == sortedArr[mid]){
			return mid;
		}else if(n > sortedArr[mid]){
			return recursiveBinarySearch(sortedArr, n, mid+1, hi);
		}else{
			return recursiveBinarySearch(sortedArr, n, lo, mid-1);
		}
	}
}