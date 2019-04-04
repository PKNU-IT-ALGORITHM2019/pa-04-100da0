package assignment03;

public class insertsort {
	static double Insertion(int A[],int n) {
		long start = System.currentTimeMillis();//O(n^2) - ÃÖ¾ÇÀÇ °æ¿ì
		for(int i=1;i<n;i++) {
			int target = A[i];
			for(int j=i-1;j>=0;j--) {
				if(A[j]>target)	A[j+1]=A[j];	
				else {
					A[j+1] = target;
				break;
				}
				if(j==0) A[0] = target;
			}
		}
		long end = System.currentTimeMillis();
		return ((end - start)/1000.0);

	}
}
