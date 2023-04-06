package org.zgg.map;

import java.util.HashMap;
/*
* HashMap:���췽��
* */
public class HashMapDemo {
    public static void main(String[] args) {
        // 1.���췽��

        //����һ������Ĭ�ϳ�ʼ���� (16) ��Ĭ�ϼ������� (0.75) �Ŀ� HashMap��
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        //����һ����ָ����ʼ������Ĭ�ϼ������� (0.75) �Ŀ� HashMap��
        HashMap<Integer, String> hm1 = new HashMap<Integer, String>(20);
        //����һ����ָ����ʼ�����ͼ������ӵĿ� HashMap��
        HashMap<Integer, String> hm2 = new HashMap<Integer, String>(20, (float) 0.8);

        hm.put(27, "����ϼ");
        hm.put(30, "������");
        hm.put(28, "����");
        hm.put(29, "����ϼ");


        //public HashMap(Map<? extends K,? extends V> m)
        // ����һ��ӳ���ϵ��ָ�� Map ��ͬ���� HashMap��
        // �������� HashMap ����Ĭ�ϼ������� (0.75) ����������ָ�� Map ��ӳ���ϵ�ĳ�ʼ������
        HashMap<Integer, String> hm3 = new HashMap<Integer, String>(hm);

        System.out.println(hm);
        System.out.println(hm3);
    }
}
