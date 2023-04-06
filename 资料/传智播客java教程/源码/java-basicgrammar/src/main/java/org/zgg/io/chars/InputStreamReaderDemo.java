package org.zgg.io.chars;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {
    public static void main(String[] args) throws IOException {
        // 1.���췽��

        // InputStreamReader isr = new InputStreamReader(new FileInputStream(
        // "osw.txt"));
         InputStreamReader isr = new InputStreamReader(new FileInputStream(
                 "osw.txt"), "GBK");

         // 2.��Ա�����Ļ���ʹ��

//        int ch = isr.read(); // һ�ζ�ȡһ���ַ�
//        //a
//        System.out.println("�������ַ���"+(char) ch);
//        System.out.println(ch);  //97
//
//        char[] chs1 = new char[1024];
//        int n1 = isr.read(chs1,0,3); //���ַ������ַ������е�һ���֡�
//        //3
//        System.out.println("�����ַ�����"+ n1);
//        //[a, b, c,  ,  , ...]
//        System.out.println("���ַ����ַ������һ���֣�"+ Arrays.toString(chs1));
//
//        char[] chs2 = new char[1024];
//        int n2 = isr.read(chs2);  //���ַ������ַ�����   ��  ���෽��
//        //20
//        System.out.println("�����ַ�����"+ n2);
//        //�����ϸ���ȡ��[d, e, b, c, d, ��, ��, ��, ��, ϼ, ��, ��, ϼ, z, ׷, ��, ʾ, ��, ׷, ��,  ...]
//        System.out.println("���ַ����ַ����飺"+ Arrays.toString(chs2));
//
//        //�жϴ����Ƿ�֧�� mark() ������Ĭ��ʵ��ʼ�շ��� false������Ӧ��д�˷�����
//        System.out.println(isr.markSupported());  //false

        // 3.ѭ����ȡ
        // ���� һ�ζ�ȡһ���ַ�
//        int nch1 = 0;
//        while((nch1=isr.read())!=-1){
//            System.out.println((char)nch1);
//        }

        // ���� һ�ζ�ȡ��һ���ַ�����
        int nch2 = 0;
        char[] chs3 = new char[1024];
        while((nch2=isr.read(chs3))!=-1){
            System.out.println(new String(chs3, 0, nch2));
        }

        //�жϴ����Ƿ��Ѿ�׼�������ڶ�ȡ����������뻺������Ϊ�գ����߿ɴӵײ��ֽ�����ȡ�ֽڣ�
        // �� InputStreamReader �����ñ���ȡ׼����
//        System.out.println(isr.ready()); //false

        isr.close();
    }
}
