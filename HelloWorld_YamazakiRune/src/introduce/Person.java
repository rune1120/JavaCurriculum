package introduce;

public class Person {
	String name;
	int age;
	double height;
	double weight;
	
	static int count = 0;
	
	public Person(String name, int age, double height, double weight){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	public Person() {
		// TODO 自動生成されたコンストラクター・スタブ
		count++;
	}

	public double bmi() {
		return weight / (height * height);
	}
	public void print() {
		System.out.println("「名前は"+ this.name +"です」");
		System.out.println("「年は"+ this.age +"です」");
		System.out.println("「BMIは"+ String.format("%.2f",bmi() )+"です」");
	}

}
