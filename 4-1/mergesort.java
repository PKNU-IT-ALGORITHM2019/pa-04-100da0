package assignment03;

public class mergesort {
	static double  mergeSort(int A[],int p, int r) {
		long start = System.currentTimeMillis();
		if(p<r) {    //p>=r �� ���� �����Ͱ� 1�� or 2�� �ΰ���̱� ������ ���� ����
			int q = (p+r)/2;   //q = p���� r �� �߰� �� (����)
			mergeSort(A,p,q);
			mergeSort(A,q+1,r);
			merge(A,p,q,r);
		}
		long end = System.currentTimeMillis();
		return ((end - start)/1000.0);
	}

	static void merge(int data[],int p,int q,int r) {
		int i=p, j=q+1,k=p;
		int tmp[]=new int [data.length];;
		while(i<=q && j<=r) {
			if(data[i]<=data[j])
				tmp[k++]=data[i++];
			else 
				tmp[k++]=data[j++];
		}
		while(i<=q) tmp[k++]=data[i++];
		while(j<=r) tmp[k++]=data[j++];
		for(int t=p;t<=r;t++)
			data[t]=tmp[t];
	}
	
}
