package introduce;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Person person1 = new Person();

		
		person1.name = "鈴木太郎";
		person1.age = 20;
		person1.height = 1.7;
		person1.weight = 60;
		
		person1.print();
		System.out.println("合計"+ Person.count +"人です");
		//System.out.println(person1.name);
		//System.out.println(person1.age);
		//System.out.println(person1.height);
	}

}
