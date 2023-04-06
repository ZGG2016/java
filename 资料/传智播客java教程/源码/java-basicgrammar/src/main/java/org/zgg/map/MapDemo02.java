package org.zgg.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * Map:��ȡ������������
 * */
public class MapDemo02 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("�˳�", "��ٳ");
        map.put("������", "��ӱ");
        map.put("�ܽ���", "������");
        map.put("������", "����");

        // V get(Object key):����ָ������ӳ���ֵ�������ӳ�䲻�����ü���ӳ���ϵ���򷵻� null��
        //�����ӳ������ null ֵ���򷵻� null ֵ����һ�� ��ʾ��ӳ�䲻�����ü���ӳ���ϵ��
        // Ҳ���ܸ�ӳ�佫�ü���ʾ��ӳ�䵽 null��ʹ�� containsKey ���������������������
        System.out.println("get:" + map.get("�ܽ���"));
        System.out.println("get:" + map.get("�ܽ�")); // ����null
        System.out.println("----------------------");

        // Collection<V> values():��ȡ����������ֵ�ļ���
        Collection<String> con = map.values();
        for (String value : con) {
            System.out.println(value);
        }
        System.out.println("----------------------");

        /*
        * ������
        *   1.Set<K> keySet()����ȡ���������м��ļ���
        *   2.Set<Map.Entry<K,V>> entrySet()�����ص��Ǽ�ֵ�Զ���ļ���
        * */

        // Set<K> keySet()
        Set<String> set = map.keySet();
        for (String key : set) {
            System.out.println(key+":"+map.get(key));
        }

        System.out.println("----------------------");

        //Set<Map.Entry<K,V>> entrySet()
        Set<Map.Entry<String, String>> setm = map.entrySet();
        for (Map.Entry<String, String> me : setm) {
            // ���ݼ�ֵ�Զ����ȡ����ֵ
            String key = me.getKey();
            String value = me.getValue();
            if(key.equals("�˳�")){
                me.setValue("aaa");
            }

            System.out.println(key + "---" + me.getValue());  //�˳�---aaa
        }
    }
}
