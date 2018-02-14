import java.io.*;
import mypackage.RandomSaikoro;
import mypackage.DecidedState;

/* ゲームのMain関数 */
public class Main {
	  public static void main(String[] args) {
		  
		  /* ゲーム導入 */
		  System.out.println("ようこそ、サイコロゲーム(練習)へ!\n"
				  			+"サイコロを振る回数を決めてね。\n"
				  			+"奇数なら出た目の歩数東へ進み、偶数なら出た目の歩数西へ進むよ。"
				  );
		  System.out.print("何回サイコロを振る？\n>");
		  
		  /*　ゲーム中身 */	  
		  try {

			  /* サイコロを振る回数の入力 */
			  BufferedReader input =
					  new BufferedReader (new InputStreamReader (System.in));
			  String str;
			  str = input.readLine( ); 

			  /* サイコロを振る回数が数字でなければ再度入力 */
			  while(!isNumber(str)) {
				  System.out.print("数字を入れてね。\n>");
				  str = input.readLine( );  
			  }
			  
			  /* サイコロを振る回数が決定*/		
			  System.out.println(str+"回ですね！");	

			  /* 指定回数だけサイコロの目をランダムで決定し、表示 */		  
			  RandomSaikoro rs = new RandomSaikoro();
			  int num = Integer.parseInt(str); 
			  int data[] = new int[num];			
			  data = rs.ThrowSaikoro(num);

			  /* サイコロの目から、現在値の結果を表示 */
			  DecidedState ds = new DecidedState();
			  ds.decidedstate(data);
			  
		/* エラーハンドリング */			  
		} catch (IOException e) {
			e.printStackTrace();
		}
	  }

	  /* 数値判定メソッド                                                        */
	  /* 引数 val: 数字判定をする文字列                         */
	  /* 返値: 数値である  True / 数値でない  False */
	  public static boolean isNumber(String val) {
			try {
				Integer.parseInt(val);
				return true;
			} catch (NumberFormatException nfex) {
				return false;
			}
		}
}
