package org.zgg.io.chars;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo {
    public static void main(String[] args) throws IOException {

        // 1�����췽��

        //OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("osw.txt"));
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(
         "osw.txt"), "GBK");
//        osw.write("�й�");

        //2����Ա����

        //��ȡĬ�ϵ��ַ����롾��������ʱû��ָ����
//        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("osw.txt"));
//        System.out.println(osw.getEncoding());  //UTF8 �����ڱ༭�����õı��뷽ʽ

        osw.write('a'); //дһ���ַ�

        char[] chs = {'a','b','c','d','e'};
        osw.write(chs); //дһ���ַ�����  �� ���෽��
        osw.write(chs,1,3); //дһ���ַ������һ����

        osw.write("�Ұ�����ϼ"); // дһ���ַ���  �� ���෽��
        osw.write("�Ұ�����ϼ", 2, 3); // дһ���ַ�����һ����

        osw.append('z'); //׷��һ���ַ� �� ���෽��
        osw.append("׷��ʾ��"); //׷��һ���ַ����� �� ���෽��
        osw.append("׷��ʾ��",0,2); //׷��һ���ַ����е�һ���� �� ���෽��

        // ˢ�»�����
        //osw.flush();
        // osw.write("�Ұ�����ϼ", 2, 3);  //����д�ɹ�

        // �ͷ���Դ
        osw.close();
        // java.io.IOException: Stream closed
        // osw.write("�Ұ�����ϼ", 2, 3);  //����

        //3��flush()��close()������

        // ִ��������䣬���ݲ�����д�뵽�ļ�����Ϊ�����ݲ�����ֱ��д�뵽�ļ��������Ƚ��뻺������
        // ����flush()��close()�󣬲�д�뵽�ļ���
//        osw.write('a');
    }
}
