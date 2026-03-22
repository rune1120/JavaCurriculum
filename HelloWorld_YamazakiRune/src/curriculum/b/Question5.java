package curriculum.b;

public class Question5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
   //Q1
	 sayHello();
	 System.out.println();
	 
	//Q2
	 int result = doubleValue(5);
	 System.out.println("5を2倍すると" + result + "です");
	 System.out.println();
	 
	//Q3
	 System.out.println(10 + "は" + (isEven(10) ? "偶数" : "奇数") + "です");
	 System.out.println(7 + "は" + (isEven(7) ? "偶数" : "奇数") + "です");
	 System.out.println();
	 
	 //Q4
	  Greeting greeting = new Greeting();
	   greeting.sayHello();
	   System.out.println();
	   
	 //Q5
	   Animal animal = new Animal();
	    animal.setName("ライオン");
	    animal.setHight(2.1);
	    animal.setSpeed(80);
	   System.out.println("動物名："+ animal.getName());
	   System.out.println("体長:"+ animal.getHight()+ "m");
	   System.out.println("速度:"+ animal.getSpeed()+"km/h");
}
	//Q1
	public static void sayHello() {
		System.out.println("Hello,World!");
	}
	
	//Q2
	public static  int doubleValue (int a) {
		return a * 2;
	}
	
	//Q3
	public static boolean isEven (int num) {
		return num % 2 == 0;
		}
}
