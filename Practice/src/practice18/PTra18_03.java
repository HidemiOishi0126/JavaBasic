/*
 * PTra18_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import entity.Player;

public class PTra18_03 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		ArrayList<Player> list = new ArrayList<Player>();
			try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
	            while (scanner.hasNext()) {
					String line = scanner.nextLine();
					String[] array = line.split(",");

					Player player = new Player();
					player.setPosition(array[0]);
					player.setName(array[1]);
					player.setCountry(array[2]);
					player.setTeam(array[3]);


					list.add(player);


	            }
	        } catch (FileNotFoundException e) {
	            System.out.println("ファイルが見つかりません");
	        }



		// ★ ①のArrayListの中から"レアル・マドリード", "バルセロナ"の選手を除外してください
			for(int i = list.size() - 1;i >= 0;i--) {
			if (list.get(i).getTeam().equals("レアル・マドリード") || list.get(i).getTeam().equals("バルセロナ")) {
				list.remove(i);
			}
		}


		// ★ 削除後のArrayListの中身を全件出力してください
			for(Player player : list) {
				player.toString();
				System.out.println(player);
			}

	}
}
