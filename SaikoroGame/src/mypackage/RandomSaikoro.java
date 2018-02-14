
package mypackage;

import java.util.Random;

public class RandomSaikoro {

	int surface_num; // 何面体のさいころか
	int throw_num; // サイコロを振る回数
	int data[];

	public static void main(String[] args) {
	}

	/* コンストラクタ (面数指定) */
	/* サイコロの面を指定した面数とする */
	public RandomSaikoro(int val, int val2){
		  surface_num=val;//指定数面さいころ		  
		  throw_num=val2;
		  data = new int[throw_num];
	  }

	/* 指定回数サイコロを振るメソッド */
	/* 引数 num: サイコロを振る回数 */
	/* 返値 data: 出力したランダム数字（1から6）配列 */
	public int[] throwSaikoro(int num) {

		/* 指定回数サイコロを振った結果を出力 */
		System.out.println("結果は...");
		for (int i = 0; i < num; i++) {
			Random rnd = new Random();

			/* 1~nまでのランダム数値を決定 */
			int val = rnd.nextInt(surface_num) + 1;
			data[i] = val;

			/* 1~nまでのランダム数値を表示 */
			printSaikoroMe(val);
		}

		return data;
	}

	/* 結果の表示                     */
	/* 引数 val: サイコロの目 */
	private static void printSaikoroMe(int val) {

		/* どっちへ何歩進むか結果 */
		if (val % 2 == 0) {
			System.out.println("西へ" + val + "歩！");
		} else {
			System.out.println("東へ" + val + "歩！");
		}
	}
}
