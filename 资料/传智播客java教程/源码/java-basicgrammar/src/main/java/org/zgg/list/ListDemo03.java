package org.zgg.list;

import javabase.collection.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
* List��List���б������ܣ�
*      1.size()��get()�������ʹ��
*      2.ListIterator������
* */
public class ListDemo03 {
    public static void main(String[] args) {
        // �������϶���
        List<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("world");
        list.add("java");

        //ListIterator������
        ListIterator lit = list.listIterator();
        while (lit.hasNext()) {
            String s = (String) lit.next();
            System.out.println(s);
        }

        //size()��get()�������
        for (int x = 0; x < list.size(); x++) {
            String s = (String) list.get(x);
            System.out.println(s);
        }

//---------------------------------------------------------------------------

        //�洢�Զ�����󲢱���
        // �������϶���
        List<javabase.collection.Student> list2 = new ArrayList<javabase.collection.Student>();
        javabase.collection.Student s1 = new javabase.collection.Student("������", 18);
        javabase.collection.Student s2 = new javabase.collection.Student("������", 88);
        javabase.collection.Student s3 = new javabase.collection.Student("������", 38);
        list2.add(s1);
        list2.add(s2);
        list2.add(s3);

        // ����������
        ListIterator lit2 = list2.listIterator();
        while (lit2.hasNext()) {
            javabase.collection.Student s = (javabase.collection.Student) lit2.next();
            System.out.println(s.getName() + "---" + s.getAge());
        }
        System.out.println("--------");

        // ��ͨforѭ��
        for (int x = 0; x < list2.size(); x++) {
            javabase.collection.Student s = (Student) list2.get(x);
            System.out.println(s.getName() + "---" + s.getAge());
        }
    }
}
