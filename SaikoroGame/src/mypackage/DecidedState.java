
package mypackage;

public class DecidedState {
	
	  public static void main(String[] args) {
	  }

	  /* �T�C�R���̖ڂ���A���ݒl�����肷�郁�\�b�h�@              */
	  /* ���� data: �T�C�R���̏o�͌��ʔz��                       */
	  public void decidedstate(int data[]) {  
		  
		  /*�@���ݒn���v�Z  */
		  int num = data.length;
		  int nowState = 0;
		  for (int i = 0; i < num; i++) {
				
				if (data[i]%2==0) {
					/*�@���֐i��  */
					nowState=nowState+data[i];
				} else {
					/*�@���֐i��  */
					nowState=nowState-data[i];
				}
		  }
		  
		  /*�@���ݒn�i�����j������  */	
		  if (nowState>0) {
			  System.out.print("���ݒn�͏��߂̈ʒu���琼��"+nowState+"���ł�");			  
		  }else if(nowState<0) {
			  System.out.print("���ݒn�͏��߂̈ʒu���瓌��"+(nowState*-1)+"���ł�");			  			  
		  }else {
			  System.out.print("���ݒn�͏��߂̈ʒu�Ɠ����ꏊ�ł�");				  
		  }
		  
	  }
}