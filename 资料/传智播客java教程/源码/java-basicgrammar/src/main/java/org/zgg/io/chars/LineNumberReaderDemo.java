package org.zgg.io.chars;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class LineNumberReaderDemo {
    public static void main(String[] args) throws IOException {
        LineNumberReader lnr = new LineNumberReader(new FileReader("bos.txt"));
        // �丸��BufferReader�����п���ʹ���丸�����з���
        //����ֻ����readLine()

        String line = null;
        while((line=lnr.readLine())!=null){
            int n = lnr.getLineNumber();
            if(n==10){
                lnr.setLineNumber(11);
            }
            System.out.println("���ǵ� "+lnr.getLineNumber()+" �е����ݣ�");
            System.out.println(line);
            //���ǵ� 8 �е����ݣ�
            //ahel
            //���ǵ� 9 �е����ݣ�
            //ahel
            //���ǵ� 11 �е����ݣ�
            //ahel
        }
    }
}
