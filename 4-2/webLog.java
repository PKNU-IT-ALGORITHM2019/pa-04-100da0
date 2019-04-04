package Q2;

import java.util.Comparator;

public class webLog {

	public String IP;
	public String Time;
	public String URL;
	public String Status;
	public int date;
	public int month;
	public int year;
	public int time;

	public webLog(String[] buffer) {
		IP=buffer[0];
		Time=buffer[1].substring(1);  //기호 [ 제거
		URL= buffer[2];
		Status=buffer[3];

		String tmp1=Time.replaceAll(":", "");  //기호 : 제거
		String tmp2[]=tmp1.split("/");
		this.date=Integer.parseInt(tmp2[0]);

		if(tmp2[1].equals("Jan")) month=1;
		else if(tmp2[1].equals("Jan")) month=2;
		else if(tmp2[1].equals("Feb")) month=3;
		else if(tmp2[1].equals("Mar")) month=4;
		else if(tmp2[1].equals("Apr")) month=5;
		else if(tmp2[1].equals("Jun")) month=6;
		else if(tmp2[1].equals("Jul")) month=7;
		else if(tmp2[1].equals("Aug")) month=8;
		else if(tmp2[1].equals("Sep")) month=9;
		else if(tmp2[1].equals("Oct")) month=10;
		else if(tmp2[1].equals("Nov")) month=11;
		else this.month=12;
		year=Integer.parseInt(tmp2[2].substring(0,4));
		time=Integer.parseInt(tmp2[2].substring(4,10));	

	}


	public static Comparator<webLog> IPComparator = new Comparator<webLog>() {
		public int compare(webLog a,webLog b) {
			try{
				if(a.IP.compareTo(b.IP)==0) {
					return a.Time.compareTo(b.Time);
				}
				return a.IP.compareTo(b.IP);
				
			}catch(NullPointerException npe) {
				return 0;
			}
		}
	};

	public static Comparator<webLog> timeComparator = new Comparator<webLog>() {
		public int compare(webLog a,webLog b) {
			try{
				if(a.year == b.year) {
					if(a.month == b.month) {
						if(a.date == b.date) {
							return a.time-b.time;
						}
						return a.date-b.date;
					}
					return a.month-b.month;
				}
				return a.year-b.year;
			}catch(NullPointerException npe) {
				return 0;

			}
		}
	};
}