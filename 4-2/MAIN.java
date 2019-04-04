package Q2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


public class MAIN {

	static webLog data[]=new webLog[200000]; ;
	static int n =0;
	static String flag="blank";
	
	public static void main(String[] args) {	
		Scanner kb = new Scanner(System.in);
		while( true ) { 
			System.out.print("$ ");
			String command = kb.next();

			if(command.equals("read")) {
				String fileName = kb.next();
				read( fileName );
			}
			else if(command.equals("sort")) {
				String str = kb.next();	
				flag=str;
				if(str.equals("-t"))
					sortTime();
				else if(str.equals("-ip"))
					sortIP();
			
			}
			
			else if(command.equals("print")) {
				if(flag.equals("-t"))
					printTime();
				else if(flag.equals("-ip"))
					printIP();
				else print();
			}
			
			else if(command.equals("exit")) {
				break;
			}		
		}
		kb.close();

	}


	static void read( String fileName ){		
		try {
			Scanner filereade = new Scanner(new File(fileName));
			String line = filereade.nextLine();
			while(filereade.hasNext()) {
				line = filereade.nextLine();
				if(line.equals("")) continue;
				else {
					String []buffer=line.split(",");
					data[n]= new webLog(buffer);
					n++;
				}
			}
			filereade.close();	 
			// System.out.println("Success");

		}catch(FileNotFoundException e){
			System.out.println("No file");
			return ;
		}
	}


	static void sortTime() {
		Arrays.sort(data,webLog.timeComparator);
	}
	static void sortIP() {
		Arrays.sort(data,webLog.IPComparator);
	}


	static void printIP() {
		for(int i=0;i<n;i++) {
			System.out.println(data[i].IP); 
			System.out.println("\tTime : "+data[i].Time); 
			System.out.println("\tURL : "+data[i].URL); 
			System.out.println("\tStatus : "+data[i].Status);	 
			System.out.println();
		} 
	}
		static void printTime() {
			for(int i=0;i<n;i++) {
				System.out.println(data[i].Time); 
				System.out.println("\tIP : "+data[i].IP); 
				System.out.println("\tURL : "+data[i].URL); 
				System.out.println("\tStatus : "+data[i].Status);	
				System.out.println();
			} 

		}
		static void print() {
			for(int i=0;i<n;i++) {
				System.out.println("Time : "+data[i].Time); 
				System.out.println("IP : "+data[i].IP); 
				System.out.println("URL : "+data[i].URL); 
				System.out.println("Status : "+data[i].Status);	 
				System.out.println();
			} 

		}

	}
