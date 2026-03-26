package curriculum.c;

import java.util.Scanner;

public class Quetion6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		CPU cpuNumber = new CPU();

		String[] hands = { "グー", "チョキ", "パー" };
		while (true) {
			System.out.print("グー(0),チョキ(1),パー(2)を入力：");
			int player = scanner.nextInt();
			if (player < 0 || player > 2) { //入力チェック
				System.out.println("0~2を入力してください");
				continue;
			}

			System.out.println("あなたの手：" + hands[player]);
			int cpu = cpuNumber.getHand();
			System.out.println("CPUの手：" + hands[cpu]);

			if (player == cpu) {
				System.out.println("あいこ！もう1回");
			} else if ((player + 2) % 3 == cpu) {
				System.out.println("あなたの負け…");
			} else {
				System.out.println("あなたの勝ち！");
				break;
			}
		}
		scanner.close();
	}
}
