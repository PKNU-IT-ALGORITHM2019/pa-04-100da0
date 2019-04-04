package assignment03;

public class quicksort2 {
	static double quick2(int A[],int p,int r) {
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
	static int partition(int A[],int p,int r) {    //중간값을 pivot 자리로 이동
		int k=0;
		if((A[k]>A[(r+p)/2] && A[k]<A[r])||(A[k]<A[(r+p)/2] && A[k]>A[r])) k=0;
		else if((A[(r+p)/2]>A[k] && A[(r+p)/2]<A[r])||(A[(r+p)/2]<A[k] && A[(r+p)/2]>A[r])) k=(r+p)/2;
		else k=r;
		
		int y=A[k];
		A[k]=A[r];
		A[r]=y;
		int i=p-1;
		for(int j=p;j<r;j++) {
			if(A[j]<=y) {
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
