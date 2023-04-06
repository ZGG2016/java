package org.zgg.io.chars;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) throws IOException {

        //FileWriter fw = new FileWriter(new File("fw.txt"));
        FileWriter fw = new FileWriter("fw.txt");

        // ֻ����д��һ���ַ���
        // �ļ����ݣ�fw-demo1 fw-demo2 append
        fw.write("fw-demo1");  //д��
        fw.write(" fw-demo2");
        fw.append(" append");   //׷��

        fw.close();
    }
}
