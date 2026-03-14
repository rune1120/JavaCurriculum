package curriculum.b;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//Q1
		int score = 75;
		if (score >= 60) {
			System.out.println("合格です！");
		}
		System.out.println();

		//Q2
		int age = 25;
		if (age >= 20) {
			System.out.println("適正年齢です");
		} else if (age <= 30) {
			System.out.println("適正年齢です");
		} else {
			System.out.println("対象外です");
		}
		System.out.println();
		
		//Q3
		int age1 = 18;
		if (age1 >= 20) {
			System.out.println("成人です");
		}else if (age1 >=13) {
			System.out.println("ティーンエージャーです");
		}else if (age1 <= 12) {
			System.out.println("子供です");
		}
		System.out.println();
		
		//Q4
		int x = 30;
		int y = 15;
		int z = 50;
		if (x >= y && x >= z) {
			System.out.println(x);
		}else if (y >= x && y >= z) {
			System.out.println(y);
		}else {
			System.out.println(z);
		}
		System.out.println();
		
		//Q5
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num > 0) {
			System.out.println("正の数です");
		} else if (num == 0) {
			System.out.println("0です");
		} else {
			System.out.println("負の数です");
		}
		System.out.println();
		
		//Q6
		Scanner sc1 = new Scanner(System.in);
		int value = sc1.nextInt();
		if (value % 2 == 0) {
			System.out.println("偶数です");
		} else {
			System.out.println("奇数です");
		}
		System.out.println();
		
		//Q7
		Scanner sc2 = new Scanner(System.in);
		int score1 = sc2.nextInt();
		if (score1 >= 90) {
			System.out.println("優");
		} else if (score1 >= 70) {
			System.out.println("良");
		} else if (score1 >= 50) {
			System.out.println("可");
		} else {
			System.out.println("不可");
		}
		System.out.println();
		
		//Q8
		Scanner sc3 = new Scanner(System.in);
		String input = sc3.nextLine();
		if (input == null || input.equals("")) {
			System.out.println("「入力が無効です」");
		}
		System.out.println();
		
		//Q9
		Scanner sc4 = new Scanner(System.in);
		int day = sc4.nextInt();
		switch (day) {
		case 1:
			System.out.println("月曜日");
			break;
		case 2:
			System.out.println("火曜日");
			break;
		case 3:
			System.out.println("水曜日");
			break;
		case 4:
			System.out.println("木曜日");
			break;
		case 5:
			System.out.println("金曜日");
			break;
		case 6:
			System.out.println("土曜日");
			break;
		case 7:
			System.out.println("日曜日");
			break;
		default:
			System.out.println("無効な入力です");
		}
		System.out.println();
		
		//Q10
		Scanner sc5 = new Scanner(System.in);
		int month = sc5.nextInt();
		switch (month) {
		case 12: case 1: case 2:
			System.out.println("冬");
			break;
		case 3: case 4: case 5:
			System.out.println("春");
			break;
		case 6: case 7: case 8:
			System.out.println("夏");
			break;
		case 9: case 10: case 11:
			System.out.println("秋"); 
			break;
		default:
			System.out.println("無効な月です");
		}
	}

}
