package org.zgg.io.bytes;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {

        // 1.���췽��

//        FileInputStream fis = new FileInputStream(new File("fos.txt"));
        FileInputStream fis = new FileInputStream("fos.txt");

        // 2.��Ա�����Ļ���ʹ��

        //������һ�ζԴ����������õķ������Բ��������شӴ���������ȡ�����������Ĺ���ʣ���ֽ�����
//        System.out.println(fis.available()); //103
//
//        int n1 = fis.read();  // һ�ζ�ȡһ���ֽ�
//        System.out.println("�����ֽڣ�"+n1);
//        System.out.println("�����ֽ�Ϊ��"+(char)n1);
//
//        //�����Ͷ����������������ݵ� n ���ֽ�
//        //����Ҫ�������ַ��� ������ʵ���������ַ���
//        long i = fis.skip(3);
//        System.out.println((char)fis.read());  //b
//
//        System.out.println(fis.available()); //98
//
//        byte[] bys1 = new byte[1024];
//        int n2 = fis.read(bys1);  // һ�ζ���һ���ֽ����� , ���෽��
//        System.out.println("������ֽ�����"+ n2);
//        System.out.println("����һ���ֽ����飺"+ Arrays.toString(bys1));
//
//        byte[] bys2 = new byte[1024];
//        int n3 = fis.read(bys2,0,3);  // һ�ζ���һ���ֽ������һ����
//        System.out.println("������ֽ�����"+ n3);
//        System.out.println("����һ���ֽ������һ���֣�"+ Arrays.toString(bys2));

        //3.ѭ����ȡ

        int by = 0;
        while ((by = fis.read()) != -1) {
            System.out.print((char) by);
        }

        // ����ĳ���һ����1024����1024��������
        byte[] bys = new byte[1024];
        int len = 0;
        while ((len = fis.read(bys)) != -1) {   // һ�ζ�ȡ1024���ֽ�
            System.out.print(new String(bys, 0, len));
        }

        fis.close();
    }
}
