package org.zgg.io.chars;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
    public static void main(String[] args) throws IOException{

        //1�����췽��

        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
        // new FileOutputStream("bw.txt")));
        BufferedWriter bw = new BufferedWriter(new FileWriter("bw.txt"));

        //2����Ա����

        bw.write('a'); //дһ���ַ�

        char[] chs = {'a','b','c','d','e'};
        bw.write(chs); //дһ���ַ�����  �� ���෽��
        bw.write(chs,1,3); //дһ���ַ������һ����

        bw.write("�Ұ�����ϼ"); // дһ���ַ���  �� ���෽��
        bw.write("�Ұ�����ϼ", 2, 3); // дһ���ַ�����һ����

        bw.append('z'); //׷��һ���ַ� �� ���෽��
        bw.append("׷��ʾ��"); //׷��һ���ַ����� �� ���෽��
        bw.append("׷��ʾ��",0,2); //׷��һ���ַ����е�һ���� �� ���෽��

        for (int x = 0; x < 10; x++) {
            bw.write("hello" + x);
            // bw.write("\r\n");
            bw.newLine();
            //bw.flush();
        }

        bw.close();
    }
}
