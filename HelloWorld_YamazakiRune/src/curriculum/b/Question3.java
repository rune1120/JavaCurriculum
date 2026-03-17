package curriculum.b;

import java.util.Random;
import java.util.Scanner;

public class Question3 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//Q1
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println();
		
		//Q2
		for (int j = 2; j <= 20; j += 2){
		System.out.println(j);
		}
		System.out.println();
		
		//Q3
		for (int k = 10; k >=1; k--) {
			System.out.println(k);
		}
		System.out.println();
		
		//Q4
		int sum = 0;
		for (int l = 1; l <= 100; l++) {
			sum += l;
		}
		System.out.println(sum);
		System.out.println();
		
		//Q5
		String[] triangle = {"*","**","***","****","*****"};
		for (String num : triangle) {
			System.out.println(num);
		}
		System.out.println();
		
		//Q6
		int count = 1;
		while (count <= 10) {
			System.out.println(count);
			count++;
		}
		System.out.println();
		
		//Q7
		int count1 = 2;
		while (count1 <= 20) {
			System.out.println(count1);
			count1 += 2;
		}
		System.out.println();
		
		//Q8
		int count2 = 10;
		while (count2 >= 1) {
			System.out.println(count2);
			count2--;
		}
		System.out.println();
		
		//Q9
		int sum1 = 0;
		int m = 1;
		while (m <= 100 ) {
			sum1 += m;
			m++;
		}
			System.out.println(sum1);
			System.out.println();
			
		//Q10
	    while (true) {
	    	Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
	    if (n == 0) {
			System.out.println("「終了しました」");
			break;
	    }
	    sc.close();
	   }
	    System.out.println();
	    
	    //Q11
	    for (int o = 1; o <= 9; o++) {
	    	for (int p = 1; p <= 9; p++) {
	            int multiplication = o * p;
	    	System.out.print(String.format("%02d*%02d=%02d||", o, p, multiplication));
		}
	    	System.out.println();
	    }
	    
	    //Q12
	    Scanner scanner = new Scanner(System.in);
	    String appliance = scanner.next();	
	    String[] parts = appliance.split("、"); //「、」区切り
	    Random random = new Random(); //ランダム関数
	    int number = random.nextInt(11); //11までランダムで出力
	    int number1 = random.nextInt(11);
	    int number2 = random.nextInt(11);
	    int number3 = random.nextInt(11);
	    int number4 = random.nextInt(11);
	    int number5 = random.nextInt(11);
	    int tv = number5;
	    int display = 11 - tv;
	    for (String item : parts) { 
	    switch (item) {
	    case "パソコン":
	    	System.out.println("パソコンの残り台数は"+ number +"台です");
	    	break;
	    case "冷蔵庫":
	    	System.out.println("冷蔵庫の残り台数は"+ number1 +"台です");
	    	break;
	    case "扇風機":
	    	System.out.println("扇風機の残り台数は"+ number2 +"台です");
	    	break;
	    case "洗濯機":
	    	System.out.println("洗濯機の残り台数は"+ number3 +"台です");
	    	break;
	    case "加湿器":
	    	System.out.println("加湿器の残り台数は"+ number4 +"台です");
	    	break;
		case "テレビ" :
			System.out.println("テレビの残り台数は"+ tv +"台です");
			break;
		case "デイスプレイ" :
	    	System.out.println("ディスプレイの残り台数は"+ display +"台です");
	    	break;
		default:
			System.out.println("『受け取った値』は指定の商品ではありません");
	    }	
	    scanner.close();
	}
}
}