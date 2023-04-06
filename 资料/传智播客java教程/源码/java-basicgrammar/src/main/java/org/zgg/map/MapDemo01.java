package org.zgg.map;

import java.util.HashMap;
import java.util.Map;
/*
* Map:������������
* */
public class MapDemo01 {
    public static void main(String[] args) {
        // �������϶���
        Map<String, String> map = new HashMap<String, String>();

        // ���Ԫ��
        // V put(K key,V value):���Ԫ�ء������ӳ����ǰ����һ���ü���ӳ���ϵ������ָ��ֵ�滻��ֵ
        //������ǰ�� key ������ֵ�����û����� key ��ӳ���ϵ���򷵻� null��
        System.out.println("put:" + map.put("����", "������"));  //put:null
        System.out.println("put:" + map.put("����", "Ҧ��")); //put:������

        map.put("�˳�", "��ٳ");
        map.put("������", "��ӱ");
        map.put("�ܽ���", "������");
        map.put("������", "����");

        // void clear():�Ƴ����еļ�ֵ��Ԫ��
        // map.clear();

        // V remove(Object key)�����ݼ�ɾ����ֵ��Ԫ�أ�����ֵ����
        //���ش�ӳ������ǰ�����ü���ֵ�������ӳ�䲻�����ü���ӳ���ϵ���򷵻� null��
         System.out.println("remove:" + map.remove("������"));  //remove:��ӱ
         System.out.println("remove:" + map.remove("������"));  //remove:null

        // boolean containsKey(Object key)���жϼ����Ƿ����ָ���ļ�
         System.out.println("containsKey:" + map.containsKey("������")); //containsKey:false
         System.out.println("containsKey:" + map.containsKey("������")); //containsKey:false

        // boolean isEmpty()���жϼ����Ƿ�Ϊ��
         System.out.println("isEmpty:"+map.isEmpty()); //isEmpty:false

        //int size()�����ؼ����еļ�ֵ�ԵĶ���
        System.out.println("size:"+map.size()); //size:4

        // �����������
        System.out.println("map:" + map); //map:{�˳�=��ٳ, ����=Ҧ��, �ܽ���=������, ������=����}

    }
}
