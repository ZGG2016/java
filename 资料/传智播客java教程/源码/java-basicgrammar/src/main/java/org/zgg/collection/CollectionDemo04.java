package org.zgg.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
/*
* Collection:����
* */
public class CollectionDemo04 {
    public static void main(String[] args) {
        // �������϶���
        Collection<Student> c = new ArrayList<Student>();

        // ����ѧ������
        Student s1 = new Student("����ϼ", 27);
        Student s2 = new Student("������", 30);
        Student s3 = new Student("�����", 33);
        Student s4 = new Student("����", 25);
        Student s5 = new Student("������", 22);

        // ��ѧ����ӵ�������
        c.add(s1);
        c.add(s2);
        c.add(s3);
        c.add(s4);
        c.add(s5);

        // 2.����������
        Iterator it = c.iterator();
        while (it.hasNext()) {
            // System.out.println(it.next());
            Student s = (Student) it.next();
            System.out.println(s.getName() + "---" + s.getAge());
            //����ϼ---27
            //������---30
            //�����---33
            //����---25
            //������---22
        }
        //�ӵ�����ָ��� collection ���Ƴ����������ص����һ��Ԫ�أ���ѡ��������
        // ÿ�ε��� next ֻ�ܵ���һ�δ˷�����
        it.remove();

        // 1.�Ѽ���ת������
        Object[] objs = c.toArray();
        // ��������
        for (int x = 0; x < objs.length; x++) {
            // System.out.println(objs[x]);

            Student s = (Student) objs[x];
            System.out.println(s.getName() + "---" + s.getAge());
            //����ϼ---27
            //������---30
            //�����---33
            //����---25
        }

        // forѭ����д
        // for(Iterator it = c.iterator();it.hasNext();){
        // Student s = (Student) it.next();
        // System.out.println(s.getName() + "---" + s.getAge());
        // }
    }
}
