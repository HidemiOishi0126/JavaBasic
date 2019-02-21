package practice06;
/*
 * PTra06_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_07 {
	public static void main(String[] args) {

		// ★ for文を使って、以下のような出力になるようにしてください
		/*
		 * 出力結果例
		 * -----------------------------------
		 * □□□□□
		 * ■□□□□
		 * ■■□□□
		 * ■■■□□
		 * ■■■■□
		 * ■■■■■
		 * ■■■■□
		 * ■■■□□
		 * ■■□□□
		 * ■□□□□
		 */

		for(int i = 0;i < 5;i++) {

			for(int j = 0;j < 5;j++) {

				if(i > j) {
					System.out.print("■");
				}else if(i <= j){
					System.out.print("□");
				}
			}
			System.out.println("");
		}

		for(int I = 0;I < 5;I++) {

			for(int J = 4;J >= 0;J--) {

				if(I <= J) {
					System.out.print("■");
				}else if(I > J){
					System.out.print("□");
				}
			}
			System.out.println("");
		}


	}
}
