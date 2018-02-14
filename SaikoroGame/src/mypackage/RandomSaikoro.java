
package mypackage;

import java.util.Random;

public class RandomSaikoro {
	
	  public static void main(String[] args) {
	  }

	  /* 指定回数サイコロを振るメソッド                 　　　              */
	  /* 引数 num:  サイコロを振る回数                                   */
	  /* 返値 data: 出力したランダム数字（1から6）配列        */
	  public int[] ThrowSaikoro(int num) {  

		  /* 指定回数サイコロを振った結果を出力 */
		  System.out.println("結果は...\n	");
		  int data[] = new int[num];
			for (int i = 0; i < num; i++) {
				Random rnd = new Random();
				
				/* 1~6までのランダム数値を決定 */
				int val = rnd.nextInt(5)+1;				
				data[i]=val;
				
				/* 1~6までのランダム数値を表示 */
				PrintSaikoroMe(val);
			}
			
			return data;
	  }
	 

	  /* 結果の表示をサイコロっぽくするメソッド                        */
	  /* 引数 val:  サイコロの目                                         */
	  public static void PrintSaikoroMe(int val) {
		  
		  /* どっちへ何歩進むか結果 */
		  if (val%2==0) {
			  System.out.println("西へ"+val+"歩！");
		  }else {
			  System.out.println("東へ"+val+"歩！");
		  }

		  /* サイコロの目を出力*/
		  switch(val) {
		  case 1:
			  System.out.println("---------\n"
			  		  + "|       ｜\n"
			  		  + "|   ●   ｜\n"
			  		  + "|       ｜\n"
			  		  + "---------"
			  );
			  break;

		  case 2:
			  System.out.println("---------\n"
			  		  + "|●      ｜\n"
			  		  + "|       ｜\n"
			  		  + "|      ●｜\n"
			  		  + "---------"
			  );
			  break;

		  case 3:
			  System.out.println("---------\n"
			  		  + "|●      ｜\n"
			  		  + "|   ●   ｜\n"
			  		  + "|      ●｜\n"
			  		  + "---------"
			  );
			  break;

		  case 4:
			  System.out.println("---------\n"
			  		  + "|●     ●｜\n"
			  		  + "|       ｜\n"
			  		  + "|●     ●｜\n"
			  		  + "---------"
			  );
			  break;

		  case 5:
			  System.out.println("---------\n"
			  		  + "|●     ●｜\n"
			  		  + "|   ●   ｜\n"
			  		  + "|●     ●｜\n"
			  		  + "---------"
			  );
			  break;

		  case 6:
			  System.out.println("---------\n"
			  		  + "|●     ●｜\n"
			  		  + "|●　       　●｜\n"
			  		  + "|●     ●｜\n"
			  		  + "---------"
			  );
			  break;

			  
		  }

		}
}



