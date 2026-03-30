package curriculum.d;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Quetion7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String name = "";
		int hp = 0;
		int at = 0;
		int sp = 0;
		try { //ファイル読み込み
			File file = new File("C:\\Users\\ryama\\OneDrive\\勉強用\\Quetion7\\daemon_status.txt");
			BufferedReader br = new BufferedReader(new FileReader(file)); //1行ずつ読み取り
			name = br.readLine();
			String hpStr = br.readLine();
			String atStr = br.readLine();
			String spStr = br.readLine();
			br.close();

			hp = Integer.parseInt(hpStr); //int型に変換
			at = Integer.parseInt(atStr); //int型に変換
			sp = Integer.parseInt(spStr); //int型に変換
		} catch (IOException e) { //ファイル読み込み時のエラー読み取り
			e.printStackTrace(); //エラー詳細をコンソールに表示
		}
		Scanner scanner = new Scanner(System.in);
		String playerName = scanner.nextLine(); //プレイヤー名入力
		Random random = new Random();
		int playerHp = random.nextInt(100); 
		int playerAt = random.nextInt(100);
		int playerSp = random.nextInt(100);
		Character player = new Character(playerName, playerHp, playerAt, playerSp);
		Character daemon = new Character(name, hp, at, sp);
		Character first;
		Character second;
		if (player.getSp() > daemon.getSp()) { //プレイヤーSPの数値が高い場合
			first = player; //先に攻撃
			second = daemon;
		} else if (daemon.getSp() > player.getSp()) { //DaemonSPの数値が高い場合
			first = daemon; //先に攻撃
			second = player;
		} else { //同じSPの場合
			int r = random.nextInt(2); //同じ数字の場合、ランダムで先行を決めるため
			if (r == 0) { //0の場合
				first = player; //プレイヤーが先に攻撃
				second = daemon;
			} else { //1の場合
				first = daemon; //daemonが先に攻撃
				second = player;
			}
		}
		while (player.getHp() > 0 && daemon.getHp() > 0) { //プレイヤーHPが0より大きいかつDaemonが0より大きい場合
			second.setHp(second.getHp() - first.getAt()); //後攻のHPを先行の攻撃分引く
			System.out.println(first.getName() + "の攻撃！");
			System.out.println(second.getName() + "のHP: " + second.getHp());
			if (second.getHp() <= 0) { //後攻のHPが0になった場合、終了
				break;
			}
			first.setHp(first.getHp() - second.getAt()); //後攻の攻撃
			System.out.println(second.getName() + "の攻撃！");
			System.out.println(first.getName() + "のHP: " + first.getHp());
			if (player.getHp() > 0) { //プレイヤーのHPが0になった場合
				System.out.println("Playerの勝ち！");
			} else { //DaemonのHPが0になった場合
				System.out.println("Daemonの勝ち！"); 
			}
		}
		try { //ファイル出力
			FileWriter fw = new FileWriter("battle_log.txt");
			if (player.getHp() > 0) { //出力する処理
				fw.write("Playerの勝ち！"); //出力内容
			} else {
				fw.write("Daemonの勝ち！");
			}
			fw.close();
		} catch (IOException e) { //エラー処理
			e.printStackTrace();
		}
		scanner.close();
	}
}
