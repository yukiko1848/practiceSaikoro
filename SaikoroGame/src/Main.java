import java.io.*;

import mypackage.RandomSaikoro;
import mypackage.DecidedState;

/* ゲームのMain関数 */
public class Main {
	public static void main(String[] args) {

		/* ゲーム導入 */
		System.out.println("ようこそ、サイコロゲーム(練習)へ!\n" + "サイコロを振って奇数なら出た目の歩数東へ進み、偶数なら出た目の歩数西へ進むよ。\n");

		/* サイコロの数の入力 */
		System.out.print("何個サイコロを振る？\n>");
		int saikoro_num = inputNum();
		
		/* サイコロの面数の入力 */
		System.out.print("何面サイコロを振る？\n>");
		int surface_num = inputNum();

		/* サイコロを振る回数の入力 */
		System.out.print("ぞれぞれ何回サイコロを振る？\n>");
		int throw_num = inputNum();

		/* 何面サイコロを何回振るかが決定 */
		System.out.println(saikoro_num + "個の" + surface_num + "面サイコロを" + throw_num + "回ずつですね！");

		/* 指定個だけサイコロの目をランダムで決定し、表示 */
		//RandomSaikoro rs = new RandomSaikoro(surface_num, throw_num);
		for (int i = 1; i <= saikoro_num; i++) {
			RandomSaikoro rs = new RandomSaikoro(surface_num, throw_num);

			/* サイコロを振る */
			int data[] = new int[throw_num];
			data = rs.throwSaikoro(throw_num);

			/* サイコロの目から、現在値の結果を表示 */
			System.out.print(i + "個目：");
			DecidedState ds = new DecidedState();
			ds.decidedState(data);
		}

	}

	/* 数値入力メソッド            */
	/* 返値: 入力された数値 */
	private static int inputNum() {

		String str = null;
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		try {
			str = input.readLine();
			/* サイコロを振る回数が数字でなければ再度入力 */
			while (!isNumber(str)) {
				System.out.print("数字を入れてね。\n>");
				str = input.readLine();
			}
			/* エラーハンドリング */
		} catch (IOException e) {
			e.printStackTrace();
		}
		return Integer.parseInt(str);
	}

	/* 数値判定メソッド */
	/* 引数 val: 数字判定をする文字列 */
	/* 返値: 数値である True / 数値でない False */
	private static boolean isNumber(String val) {
		try {
			Integer.parseInt(val);
			return true;
		} catch (NumberFormatException nfex) {
			return false;
		}
	}
}
