
package mypackage;

import java.util.Random;

public class RandomSaikoro {
	
	  public static void main(String[] args) {
	  }

	  /* �w��񐔃T�C�R����U�郁�\�b�h                 �@�@�@              */
	  /* ���� num:  �T�C�R����U���                                   */
	  /* �Ԓl data: �o�͂��������_�������i1����6�j�z��        */
	  public int[] ThrowSaikoro(int num) {  

		  /* �w��񐔃T�C�R����U�������ʂ��o�� */
		  System.out.println("���ʂ�...\n	");
		  int data[] = new int[num];
			for (int i = 0; i < num; i++) {
				Random rnd = new Random();
				
				/* 1~6�܂ł̃����_�����l������ */
				int val = rnd.nextInt(5)+1;				
				data[i]=val;
				
				/* 1~6�܂ł̃����_�����l��\�� */
				PrintSaikoroMe(val);
			}
			
			return data;
	  }
	 

	  /* ���ʂ̕\�����T�C�R�����ۂ����郁�\�b�h                        */
	  /* ���� val:  �T�C�R���̖�                                         */
	  public static void PrintSaikoroMe(int val) {
		  
		  /* �ǂ����։����i�ނ����� */
		  if (val%2==0) {
			  System.out.println("����"+val+"���I");
		  }else {
			  System.out.println("����"+val+"���I");
		  }

		  /* �T�C�R���̖ڂ��o��*/
		  switch(val) {
		  case 1:
			  System.out.println("---------\n"
			  		  + "|       �b\n"
			  		  + "|   ��   �b\n"
			  		  + "|       �b\n"
			  		  + "---------"
			  );
			  break;

		  case 2:
			  System.out.println("---------\n"
			  		  + "|��      �b\n"
			  		  + "|       �b\n"
			  		  + "|      ���b\n"
			  		  + "---------"
			  );
			  break;

		  case 3:
			  System.out.println("---------\n"
			  		  + "|��      �b\n"
			  		  + "|   ��   �b\n"
			  		  + "|      ���b\n"
			  		  + "---------"
			  );
			  break;

		  case 4:
			  System.out.println("---------\n"
			  		  + "|��     ���b\n"
			  		  + "|       �b\n"
			  		  + "|��     ���b\n"
			  		  + "---------"
			  );
			  break;

		  case 5:
			  System.out.println("---------\n"
			  		  + "|��     ���b\n"
			  		  + "|   ��   �b\n"
			  		  + "|��     ���b\n"
			  		  + "---------"
			  );
			  break;

		  case 6:
			  System.out.println("---------\n"
			  		  + "|��     ���b\n"
			  		  + "|���@       �@���b\n"
			  		  + "|��     ���b\n"
			  		  + "---------"
			  );
			  break;

			  
		  }

		}
}



