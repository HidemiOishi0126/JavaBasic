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
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();

		car1.color = "red";
		car1.gasoline = 50;

		car2.color = "blue";
		car2.gasoline = 75;

		car3.color = "green";
		car3.gasoline = 90;

		Car[] cars = new Car[3];
		cars[0] = car1;
		cars[1] = car2;
		cars[2] = car3;


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
