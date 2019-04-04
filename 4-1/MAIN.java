package assignment03;
public class MAIN {
	public static int N[]= {1000,10000,100000};
	public static int[]arr1;
	public static int[]arr2;
	public static void main(String[] args) {
		System.out.println("\t  Random1000      Reverse1000     Random10000    Reverse10000    Random100000   Reverse100000");

		for(int i=0;i<3;i++) {                  //bubblesort
			if(i==0)
				System.out.print("Bubble   \t");
			arrayreverse(N[i]);
			double b1 =0;
			double b2 = bubblesort.bubble(arr2,N[i]);

			for(int k=0;k<10;k++) {
				arrayrandom(N[i]);
				b1+= bubblesort.bubble(arr1,N[i]);	
			}
			b1=(Math.round(b1/10)*1000)/1000.0;
			System.out.print(b1+"\t\t");
			System.out.print(b2+"\t\t");
		}
		System.out.println();


		for(int i=0;i<3;i++) {            //selectionsort
			if(i==0)
				System.out.print("Selection\t");
			arrayreverse(N[i]);
			double s1=0;
			double s2=selectionsort.selection(arr2,N[i]);
			for(int k=0;k<10;k++) {
				arrayrandom(N[i]);
				s1+=selectionsort.selection(arr1,N[i]);
			}
			s1=(Math.round((s1/10)*1000)/1000.0);
			System.out.print(s1+"\t\t");
			System.out.print(s2+"\t\t");
		}
		System.out.println();


		for(int i=0;i<3;i++) {               //insertionsort
			if(i==0)
				System.out.print("Insertion\t");
			arrayreverse(N[i]);
			double i1=0;
			double i2=insertsort.Insertion(arr2,N[i]);

			for(int k=0;k<10;k++) {
				arrayrandom(N[i]);
				i1+=insertsort.Insertion(arr1,N[i]);
			}
			i1=(Math.round((i1/10)*1000)/1000.0);
			System.out.print(i1+"\t\t");
			System.out.print(i2+"\t\t");
		}
		System.out.println();


		for(int i=0;i<3;i++) {               //merge
			if(i==0)
				System.out.print("Merge    \t");
			arrayreverse(N[i]);
			double m1=0;
			double m2=mergesort.mergeSort(arr2,0,N[i]-1);

			for(int k=0;k<10;k++) {
				arrayrandom(N[i]);
				m1+=mergesort.mergeSort(arr1,0,N[i]-1);
			}
			m1=(Math.round((m1/10)*1000)/1000.0);
			System.out.print(m1+"\t\t");
			System.out.print(m2+"\t\t");
		}
		System.out.println();


	

		for(int i=0;i<3;i++) {           //quick1 sort
			if(i==0)
				System.out.print("Quick1   \t");
			arrayreverse(N[i]);
			double q1=0;

			for(int k=0;k<10;k++) {
				arrayrandom(N[i]);	
				q1+=quicksort1.quick1(arr1,0,N[i]-1);
			}
			q1=(Math.round((q1/10)*1000)/1000.0);
			System.out.print(q1+"\t\t");
			if(i!=2) {
				double q2=quicksort1.quick1(arr2,0,N[i]-1);
				System.out.print(q2+"\t\t"); 
			}
			else System.out.print("-");
		}
		System.out.println();		

		

		for(int i=0;i<3;i++) {           //quick2 sort
			if(i==0)
				System.out.print("Quick2   \t");
			arrayreverse(N[i]);
			double q1=0;
			double q2=quicksort2.quick2(arr2,0,N[i]-1);

			for(int k=0;k<10;k++) {
				arrayrandom(N[i]);	
				q1+=quicksort2.quick2(arr1,0,N[i]-1);
			}
			q1=(Math.round((q1/10)*1000)/1000.0);
			System.out.print(q1+"\t\t");
			System.out.print(q2+"\t\t");
		}
		System.out.println();		


		for(int i=0;i<3;i++) {           //quick3 sort
			if(i==0)
				System.out.print("Quick3   \t");
			arrayreverse(N[i]);
			double q1=0;
			double q2=quicksort3.quick3(arr2,0,N[i]-1);

			for(int k=0;k<10;k++) {
				arrayrandom(N[i]);	
				q1+=quicksort3.quick3(arr1,0,N[i]-1);
			}
			q1=(Math.round((q1/10)*1000)/1000.0);
			System.out.print(q1+"\t\t");
			System.out.print(q2+"\t\t");
		}
		System.out.println();		


		for(int i=0;i<3;i++) {           //heapsort
			if(i==0)
				System.out.print("Heap     \t");
			arrayreverse(N[i]);
			double h1=0;
			double h2=heapsort.heap(arr2,N[i]);

			for(int k=0;k<10;k++) {
				arrayrandom(N[i]);	
				h1+=heapsort.heap(arr1,N[i]);
			}
			h1=(Math.round((h1/10)*1000)/1000.0);
			System.out.print(h1+"\t\t");
			System.out.print(h2+"\t\t");
		}
		System.out.println();		
	
	for(int i=0;i<3;i++) {           //librarysort
		if(i==0)
			System.out.print("Library  \t");
		arrayreverse(N[i]);
		double l1=0;
		double l2=librarysort.lib(arr2);

		for(int k=0;k<10;k++) {
			arrayrandom(N[i]);	
			l1+=librarysort.lib(arr1);
		}
		l1=(Math.round((l1/10)*1000)/1000.0);
		System.out.print(l1+"\t\t");
		System.out.print(l2+"\t\t");
	}
	System.out.println();		
	}
	
	public static void arrayrandom(int n) {
		arr1=new int [n];	
		for(int j=0;j<n;j++) {
			arr1[j]=(int) (Math.random()*n+1);
		}	
	}
	public static void arrayreverse(int n) {
		int count=n;
		arr2=new int [n];
		for(int j=0;j<n;j++) {
			arr2[j]=count--;
		}	
	}

	public static void print(int []data,int n) {
		for(int i=0;i<n;i++)
			System.out.print(data[i]+" ");
		System.out.println();
	}

}


