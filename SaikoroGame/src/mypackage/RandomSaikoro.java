
package mypackage;

import java.util.Random;

public class RandomSaikoro {

	int surface_num; // ���ʑ̂̂������납
	int throw_num; // �T�C�R����U���
	int data[];

	public static void main(String[] args) {
	}

	/* �R���X�g���N�^ (�ʐ��w��) */
	/* �T�C�R���̖ʂ��w�肵���ʐ��Ƃ��� */
	public RandomSaikoro(int val, int val2){
		  surface_num=val;//�w�萔�ʂ�������		  
		  throw_num=val2;
		  data = new int[throw_num];
	  }

	/* �w��񐔃T�C�R����U�郁�\�b�h */
	/* ���� num: �T�C�R����U��� */
	/* �Ԓl data: �o�͂��������_�������i1����6�j�z�� */
	public int[] throwSaikoro(int num) {

		/* �w��񐔃T�C�R����U�������ʂ��o�� */
		System.out.println("���ʂ�...");
		for (int i = 0; i < num; i++) {
			Random rnd = new Random();

			/* 1~n�܂ł̃����_�����l������ */
			int val = rnd.nextInt(surface_num) + 1;
			data[i] = val;

			/* 1~n�܂ł̃����_�����l��\�� */
			printSaikoroMe(val);
		}

		return data;
	}

	/* ���ʂ̕\��                     */
	/* ���� val: �T�C�R���̖� */
	private static void printSaikoroMe(int val) {

		/* �ǂ����։����i�ނ����� */
		if (val % 2 == 0) {
			System.out.println("����" + val + "���I");
		} else {
			System.out.println("����" + val + "���I");
		}
	}
}
