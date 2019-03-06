/*
 * PTra17_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice17.ptra17;

public class PTra17_04 {
	public static void main(String[] args) {

		String str = "スッキリわかるJava入門";

		messageSlowly(str);
	}
		/*
		 * ★ strに入っている文字列を1文字ずつゆっくり表示させるプログラムを完成させてください
		 * ※ Thread.sleep を使用すること
		 */

	public static void messageSlowly(String str) {

			char[] array = str.toCharArray(); //文字列を配列に入れる

			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i]);


				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
				}
			}
		}


	}

