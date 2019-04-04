package assignment03;

public class quicksort1 {
	
	static double quick1(int A[],int p,int r) {
		long start = System.currentTimeMillis();
		quickSort(A,p,r);
		long end = System.currentTimeMillis();
		return ((end - start)/1000.0);	
	}
	static void quickSort(int A[],int p,int r) {
		if(p<=r) {  
			int q=partition(A,p,r);
			quickSort(A,p,q-1);
			quickSort(A,q+1,r);
		}
		return;
	}
	static int partition(int A[],int p,int r) { 
		int x = A[r];
		int i=p-1;
		for(int j=p;j<r;j++) {
			if(A[j]<=x) {
				i++;
			int tmp =A[i];
			A[i]=A[j];
			A[j]=tmp;
			}
		}
		int tmp =A[i+1];
		A[i+1]=A[r];
		A[r]=tmp;
		return i+1;

	}

	}
