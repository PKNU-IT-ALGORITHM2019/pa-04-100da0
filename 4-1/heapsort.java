package assignment03;

public class heapsort {

	static double heap(int[]A,int n) {
		long start = System.currentTimeMillis();
		HEAPSORT(A,n);
		long end = System.currentTimeMillis();
		return ((end - start)/1000.0);	
	}

	static void bulid(int[]A,int n){
		int size=A.length;
		for(int i=size/2;i>=0;i--) {
			MAXheapfiy(A,size,i);
		}
		return;
	}

	static void HEAPSORT(int []A,int n) {
		bulid(A,n);
		for(int i=n-1;i>=1;i--) {
			swap(A,0,i);
			MAXheapfiy(A,i,0);
		}
	}

	static void MAXheapfiy(int []A,int n,int i) {
		int left = 2*i;
		int right = 2*i+1;
		if(left >=n || right >=n) return;

		int k=left;
		if(A[k]<A[right]) k=right;

		if(A[i] >= A[k]) return;
		swap(A,i,k);
		MAXheapfiy(A,n,k); 
	}


	public static void swap(int[] arr, int p, int i) { 
		int tmp = arr[p]; 
		arr[p] = arr[i]; 
		arr[i] = tmp;		 
	}
}