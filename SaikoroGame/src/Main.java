import java.io.*;

import mypackage.RandomSaikoro;
import mypackage.DecidedState;

/* �Q�[����Main�֐� */
public class Main {
	public static void main(String[] args) {

		/* �Q�[������ */
		System.out.println("�悤�����A�T�C�R���Q�[��(���K)��!\n" + "�T�C�R����U���Ċ�Ȃ�o���ڂ̕������֐i�݁A�����Ȃ�o���ڂ̕������֐i�ނ�B\n");

		/* �T�C�R���̐��̓��� */
		System.out.print("���T�C�R����U��H\n>");
		int saikoro_num = inputNum();
		
		/* �T�C�R���̖ʐ��̓��� */
		System.out.print("���ʃT�C�R����U��H\n>");
		int surface_num = inputNum();

		/* �T�C�R����U��񐔂̓��� */
		System.out.print("���ꂼ�ꉽ��T�C�R����U��H\n>");
		int throw_num = inputNum();

		/* ���ʃT�C�R��������U�邩������ */
		System.out.println(saikoro_num + "��" + surface_num + "�ʃT�C�R����" + throw_num + "�񂸂ł��ˁI");

		/* �w������T�C�R���̖ڂ������_���Ō��肵�A�\�� */
		//RandomSaikoro rs = new RandomSaikoro(surface_num, throw_num);
		for (int i = 1; i <= saikoro_num; i++) {
			RandomSaikoro rs = new RandomSaikoro(surface_num, throw_num);

			/* �T�C�R����U�� */
			int data[] = new int[throw_num];
			data = rs.throwSaikoro(throw_num);

			/* �T�C�R���̖ڂ���A���ݒl�̌��ʂ�\�� */
			System.out.print(i + "�ځF");
			DecidedState ds = new DecidedState();
			ds.decidedState(data);
		}

	}

	/* ���l���̓��\�b�h            */
	/* �Ԓl: ���͂��ꂽ���l */
	private static int inputNum() {

		String str = null;
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		try {
			str = input.readLine();
			/* �T�C�R����U��񐔂������łȂ���΍ēx���� */
			while (!isNumber(str)) {
				System.out.print("���������ĂˁB\n>");
				str = input.readLine();
			}
			/* �G���[�n���h�����O */
		} catch (IOException e) {
			e.printStackTrace();
		}
		return Integer.parseInt(str);
	}

	/* ���l���胁�\�b�h */
	/* ���� val: ������������镶���� */
	/* �Ԓl: ���l�ł��� True / ���l�łȂ� False */
	private static boolean isNumber(String val) {
		try {
			Integer.parseInt(val);
			return true;
		} catch (NumberFormatException nfex) {
			return false;
		}
	}
}
