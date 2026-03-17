package curriculum.b;

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
	}
}
