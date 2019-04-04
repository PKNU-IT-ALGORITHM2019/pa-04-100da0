package assignment03;

public class bubblesort {
	static double bubble(int A[],int n) { 
		long start = System.currentTimeMillis();   //O(n^2)
		for(int i=n-1;i>=1;i--) {
			for(int j=0;j<i;j++) {
				if(A[j]>A[j+1]){
					int tmp = A[j];
					A[j]=A[j+1];
					A[j+1]=tmp;			
				}
			}
		}
		long end = System.currentTimeMillis();
		return ((end - start)/1000.0);
	}
}

