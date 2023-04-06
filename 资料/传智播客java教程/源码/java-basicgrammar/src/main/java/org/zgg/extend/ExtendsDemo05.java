package org.zgg.extend;
/*
	������д�����
		A:һ����ľ�̬�����,��������,���췽����ִ������
			��̬����� > �������� > ���췽��
		B:��̬��������������ļ��ض�����
			��̬���������ݻ�����ִ��
		C:�����ʼ��֮ǰ�Ȼ���и���ĳ�ʼ��

	����ǣ�
		��̬�����Fu
		��̬�����Zi
		��������Fu
		���췽��Fu
		��������Zi
		���췽��Zi
*/
public class ExtendsDemo05 {
    public static void main(String[] args) {
        Zi z = new Zi();
    }

    static class Fu {
        static {
            System.out.println("��̬�����Fu");
        }

        {
            System.out.println("��������Fu");
        }

        public Fu() {
            System.out.println("���췽��Fu");
        }
    }

    static class Zi extends Fu {
        static {
            System.out.println("��̬�����Zi");
        }

        {
            System.out.println("��������Zi");
        }

        public Zi() {
            System.out.println("���췽��Zi");
        }
    }
}
