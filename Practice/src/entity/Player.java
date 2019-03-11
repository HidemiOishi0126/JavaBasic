package entity;

public class Player {

	private String position;
	private String name;
	private String country;
	private String team;


	public String getPosition() {
		return this.position;
	}
	public void setPosition(String position) {
		this.position = position;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return this.country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public String getTeam() {
		return this.team;
	}
	public void setTeam(String team) {
		this.team = team;
	}


	public String toString() {


		String list = position +","+ name +","+ country +","+ team ;

		return list ;

	}



}
/*
 * ★ BestElevenCandidate.csvの情報を保持するためのクラス、entity.Playerクラスを作成してください
 *
 * メソッド
 * 		各アクセサ
 *
 * 		toString()	：	Objectクラスのオーバーライド
 * 		各フィールドの値を、カンマ区切りの文字列で取得する
 */
