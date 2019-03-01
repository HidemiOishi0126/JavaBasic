package practice14.common;

public class JavaCourse implements Course{

	String PREFIX = "【Eラーニング】";

	/**
	 * コースの名称を取得します。
	 * 例）Java、DB基礎、IT基礎　など
	 * @return
	 */
	public String getCourseName() {
		return "【Eラーニング】Java";
	}
	/**
	 * コースの単元を取得します
	 * 例）プログラミングの書き方、式と演算子　など
	 * @return
	 */
	public String[] getCourseUnit() {
		String[] list ={"式と演算","制御構文","メソッド","配列","オブジェクト指向","継承","高度な継承"};
		return list;

	}
}


/*
 * ★ common.Courseを実装した、JavaCourseクラスを作成してください
 *
 * コース名称
 * 		「【Eラーニング】Java」
 * 単元
 * 		式と演算
 * 		制御構文
 * 		メソッド
 * 		配列
 * 		オブジェクト指向
 * 		継承
 * 		高度な継承
 */
