package curriculum.a;

public class Question1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        //Q1 初期値設定
		byte byteNum = 0;
		short shortNum = 0;
		int intNum = 0;
		long longNum = 0L;
		float floatNum = 0.0f;
		double doubleNum = 0.0d;
		char letter = '\u0000';
		String letters = null;
		boolean isBoolean = false;
		
		//Q2　変数に代入
		byteNum = 10;
		shortNum = 100;
		intNum = 1000;
		longNum = 10000;
		floatNum = 9.5f;
		doubleNum = 10.5;
		letter = 'a';
		letters = "ハロー";
		isBoolean = true;
		
		//Q3 代入した変数を用いて出力
		System.out.println(byteNum + shortNum + intNum +longNum );
		System.out.println(byteNum + byteNum);
		System.out.println(letter + letters +isBoolean);
		System.out.println(byteNum + byteNum + byteNum + shortNum + intNum +longNum);
		System.out.println(byteNum * shortNum * intNum *longNum);
		System.out.println(doubleNum / shortNum);
		System.out.println(byteNum - shortNum);
		System.out.println();
		
		//Q4 
		String name = "山田太郎";
		System.out.println("こんんちは、" + name + "さん！");
		System.out.println();
		
		//Q5
		int age = 25;
		System.out.println("年齢：" + age + "歳");
		System.out.println();
		
		//Q6
		int num1 = 10;
		int num2 = 5;
		int sum = num1 + num2;
		System.out.println(sum);
		System.out.println();
		
		//Q7
		int score = 80;
		score = score + 20;
		System.out.println("最終スコア：" + score);
		System.out.println();
		
		//Q8
		double price = 99.99;
		int i = (int) price; //double→intへ変換
		System.out.println(i);
		System.out.println();
		
		//Q9
		String numStr = "123";
		int intnum = Integer.parseInt(numStr); //String→intに変換
		System.out.println(intnum + 10);
		System.out.println();
		
		//Q10
		int num = 50;
		String str = String.valueOf(num);
		System.out.println("得点：" + str + "点");
		System.out.println();
		
		//Q11
		int a = 10;
		int b = 20;
		boolean result = a < b;
		System.out.println(result);
		System.out.println();
		
		//Q12
		int x = 15;
		System.out.println(x >= 10 ? "OK" : "NG");
		System.out.println();
		
		//Q13
		String text = "私はJavaが好きです。Javaは楽しい！";
		System.out.println(text.replace("Java", "Python"));
	}

}
