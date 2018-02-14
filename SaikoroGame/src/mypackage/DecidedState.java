
package mypackage;

public class DecidedState {
	
	  public static void main(String[] args) {
	  }

	  /* サイコロの目から、現在値を決定するメソッド　              */
	  /* 引数 data: サイコロの出力結果配列                       */
	  public void decidedState(int data[]) {  
		  
		  /*　現在地を計算  */
		  int num = data.length;
		  int nowState = 0;
		  for (int i = 0; i < num; i++) {
				
				if (data[i]%2==0) {
					/*　西へ進む  */
					nowState=nowState+data[i];
				} else {
					/*　東へ進む  */
					nowState=nowState-data[i];
				}
		  }
		  
		  /*　現在地（東西）を決定  */	
		  if (nowState>0) {
			  System.out.println("現在地は初めの位置から西へ"+nowState+"歩です\n");			  
		  }else if(nowState<0) {
			  System.out.println("現在地は初めの位置から東へ"+(nowState*-1)+"歩です\n");			  			  
		  }else {
			  System.out.println("現在地は初めの位置と同じ場所です\n");				  
		  }
		  
	  }
}
