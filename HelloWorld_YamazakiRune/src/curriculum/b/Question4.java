package curriculum.b;

import java.util.Arrays;
import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	//Q1
	int [] numbers = {1, 2, 3, 4, 5};
	for (int num : numbers) {
	System.out.println(num);
	}
	System.out.println();
	
	//Q2
	int [] numbers1 = {10, 20, 30, 40, 50};
	for (int i = numbers1.length -1; i >= 0; i--) {
	System.out.println(numbers1[i]);	
	}
	System.out.println();
	
	//Q3
	int [] numbers2 = {3, 5, 7, 9, 11};
	int sum = 0;
    for (int num2 : numbers2) {
    	sum += num2;
    }
	System.out.println(sum);
	System.out.println();	
	
	//Q4
	int [] numbers3 = {12, 7, 9, 21, 5, 18};
	int max = Arrays.stream(numbers3).max().getAsInt();
	int min = Arrays.stream(numbers3).min().getAsInt();	
	System.out.println("最大値" + max);
	System.out.println("最小値" + min);
	System.out.println();
	
	//Q5
	int [] numbers4 = {1, 2, 3, 4, 5};
	int twice = 0;
	for (int num4 : numbers4) {
		twice = num4 * 2;
	System.out.println(twice);
	}
	System.out.println();
	
	//Q6
	int [] numbers5 = {4, 7, 10, 15, 20};
	Scanner scanner = new Scanner(System.in);
	int nextInt = scanner.nextInt();
	if(Arrays.stream(numbers5).anyMatch(n -> n == nextInt)) {
		System.out.println(nextInt + "は配列に含まれています");
	}else {
		System.out.println("含まれていません");
	}
	System.out.println();
	
	//Q7
	int[][] array = {{1,2},{3,4},{5,6}};
	 for (int i = 0; i < array.length; i++) {
		for (int j = 0; j < array[i].length; j++) {
			System.out.println(array[i][j]);
        }
	  }
	 System.out.println();
	 
	 //Q8
	 int[][] array1 = {{10,20,30},{40,50,60},{70,80,90}};
	 int sum1 = 0;
	 for (int i = 0; i < array1.length; i++) {
		 for (int j = 0; j < array1[i].length; j++) {
			 sum1 += array1[i][j];
		 }
	  }
	 System.out.println(sum1);
	 System.out.println();
	
	//Q9
	int[][] array2 = {{12,15,8},{6,19,25},{30,2,10}};
	int max1 = array2[0][0];
	int min1 = array2[0][0];
	for (int i = 0; i < array2.length; i++) {
		for (int j = 0; j < array2[i].length; j++) {
			
			if (array2[i][j] > max1) {
				max1 = array2[i][j];
			}
			if (array2[i][j] < min1) {
				min1 = array2[i][j];
			}
		}
	  }
	System.out.println("最大値" + max1);
	System.out.println("最小値" + min1);
	System.out.println();
	
	//Q10
	int[][][] array3 = {{{1,2},{3,4}},{{5,6},{7,8}}};
	for(int i = 0; i < array3.length; i++) {
		for(int j = 0; j < array3[i].length; j++) {
			for(int k = 0; k < array3[i][j].length; k++) {
				System.out.print(array3[i][j][k]);
				System.out.println();
			}
		}
	}
	scanner.close();
  }
}
