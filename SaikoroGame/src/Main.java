import java.io.*;
import mypackage.RandomSaikoro;
import mypackage.DecidedState;

/* �Q�[����Main�֐� */
public class Main {
	  public static void main(String[] args) {
		  
		  /* �Q�[������ */
		  System.out.println("�悤�����A�T�C�R���Q�[��(���K)��!\n"
				  			+"�T�C�R����U��񐔂����߂ĂˁB\n"
				  			+"��Ȃ�o���ڂ̕������֐i�݁A�����Ȃ�o���ڂ̕������֐i�ނ�B"
				  );
		  System.out.print("����T�C�R����U��H\n>");
		  
		  /*�@�Q�[�����g */	  
		  try {

			  /* �T�C�R����U��񐔂̓��� */
			  BufferedReader input =
					  new BufferedReader (new InputStreamReader (System.in));
			  String str;
			  str = input.readLine( ); 

			  /* �T�C�R����U��񐔂������łȂ���΍ēx���� */
			  while(!isNumber(str)) {
				  System.out.print("���������ĂˁB\n>");
				  str = input.readLine( );  
			  }
			  
			  /* �T�C�R����U��񐔂�����*/		
			  System.out.println(str+"��ł��ˁI");	

			  /* �w��񐔂����T�C�R���̖ڂ������_���Ō��肵�A�\�� */		  
			  RandomSaikoro rs = new RandomSaikoro();
			  int num = Integer.parseInt(str); 
			  int data[] = new int[num];			
			  data = rs.ThrowSaikoro(num);

			  /* �T�C�R���̖ڂ���A���ݒl�̌��ʂ�\�� */
			  DecidedState ds = new DecidedState();
			  ds.decidedstate(data);
			  
		/* �G���[�n���h�����O */			  
		} catch (IOException e) {
			e.printStackTrace();
		}
	  }

	  /* ���l���胁�\�b�h                                                        */
	  /* ���� val: ������������镶����                         */
	  /* �Ԓl: ���l�ł���  True / ���l�łȂ�  False */
	  public static boolean isNumber(String val) {
			try {
				Integer.parseInt(val);
				return true;
			} catch (NumberFormatException nfex) {
				return false;
			}
		}
}
