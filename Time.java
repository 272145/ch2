public class Time{
	public static void main(String[] args){
		int day = 14;
		String month;
		month  = "September";
		int year = 2026;
		System.out.println("Today is " + " "+ year + " " + month + " " + day);
		//Ex 2.3
		int hour = 14;
		int minute = 50;
		int second;
		second = minute *60 + hour * 3600;
		System.out.print("Current time is	");
		System.out.print(hour);
		System.out.print(":");
		System.out.println(minute);
		
		System.out.println("It has been" + " " + second + " " + "Seconds since midnight");
		}
}
