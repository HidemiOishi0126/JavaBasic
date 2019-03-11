package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */

		Car[] cars = new Car[3];



		for(int i=0;i < cars.length;i++) {
			System.out.println(i + 1 + "台目");
			cars[i] = new Car();

			System.out.println("シリアルナンバー、車の色、ガソリン量をカンマ区切りで入力して下さい。");
			String input = new java.util.Scanner(System.in).nextLine();

			String[] carInfo = input.split(",");

			cars[i].serialNo = Integer.parseInt(carInfo[0]);
			cars[i].color = carInfo[1];
			cars[i].gasoline = Integer.parseInt(carInfo[2]);


		}




		final int distance = 300;

		for (int i = 0; i < cars.length; i++) {

			System.out.println("-------------"  + cars[i].color + "----------------------");

			int path = 0;
			int n = 0;
			while(true) {
				int num = cars[i].run();
				path = path + num;
				n++;
				if(num < 0) {
					System.out.println("目的地に到達できませんでした");
				break;
				}
				if(path >= 300) {

					System.out.println("目的地まで" + n + "時間かかりました。"
					+"残りのガソリンは" + cars[i].gasoline + "リットルです");
					break;
				}
			}
		}



	}
}
