package org.zgg.io.bytes;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamDemo {
    public static void main(String[] args) throws IOException {

        // 1.���췽��

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
                "bos.txt"));
//        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
//                "bos.txt"),2);

        // 2.��Ա�����Ļ���ʹ��

        //������һ�ζԴ����������õķ������Բ��������شӴ���������ȡ�����������Ĺ���ʣ���ֽ�����
//        System.out.println(bis.available()); //23
//
//        int n1 = bis.read();  // һ�ζ�ȡһ���ֽ�
//        System.out.println("�����ֽڣ�"+n1);  //97
//        System.out.println("�����ֽ�Ϊ��"+(char)n1);  //a
//
//        //�����Ͷ����������������ݵ� n ���ֽ�
//        //����Ҫ�������ַ��� ������ʵ���������ַ���
//        long i = bis.skip(3);
//        System.out.println((char)bis.read());  //b
//
//        System.out.println(bis.available()); //18
//
//        byte[] bys1 = new byte[1024];
//        int n2 = bis.read(bys1);  // һ�ζ���һ���ֽ�����   , ���෽��
//        System.out.println("������ֽ�����"+ n2);  //18
//        //[99, 100, 101, 104, 101, 108, 108, 111, 13, 10, 98, 99, 100, 104, 101, 108, 13, 10, 0,
//        System.out.println("����һ���ֽ����飺"+ Arrays.toString(bys1));
//
//        byte[] bys2 = new byte[1024];
//        int n3 = bis.read(bys2,0,3);  // һ�ζ���һ���ֽ������һ����
//        System.out.println("������ֽ�����"+ n3);
//        System.out.println("����һ���ֽ������һ���֣�"+ Arrays.toString(bys2));

        // 3.ѭ����ȡ

        // ��ȡ����
        // int by = 0;
        // while ((by = bis.read()) != -1) {
        // System.out.print((char) by);
        // }
        // System.out.println("---------");

        byte[] bys = new byte[1024];
        int len = 0;
        while ((len = bis.read(bys)) != -1) {
            System.out.print(new String(bys, 0, len));
        }

        // �ͷ���Դ
        bis.close();
    }

}
