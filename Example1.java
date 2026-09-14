
public class Example1{
	public static void main(String[] args){
		String name;
		int age;
		name = "George";
		age = 16;
		System.out.println("My name is" + " " + name + " " + "and I am" + " " + age);
		System.out.println(7/2);
		System.out.println(7.0/2);
		System.out.println(7%2);
		
		// Ex 2.2
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
		System.out.println("Current time is:");
		System.out.print(hour);
		System.out.print(":");
		System.out.print(minute);
		System.out.println("");
		System.out.println(" It has been" + " " + second + " " + "Seconds since midnight");
	

	}
}

