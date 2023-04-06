package org.zgg.map;

import java.util.Comparator;
import java.util.TreeMap;
/*
* TreeMap:���췽��
* */
public class TreeMapDemo01 {
    public static void main(String[] args) {
        // 1.���췽��������������api

        //��1��public TreeMap()ʹ�ü�����Ȼ˳����һ���µġ��յ���ӳ�䡣
        TreeMap<String, String> tm1 = new TreeMap<String, String>();
/*
  ��2��public TreeMap(Map<? extends K,? extends V> m)
      ����һ�������ӳ�������ͬӳ���ϵ���µ���ӳ�䣬��ӳ������������Ȼ˳�� ��������
  ��3��public TreeMap(SortedMap<K,? extends V> m)
      ����һ����ָ������ӳ�������ͬӳ���ϵ����ͬ����˳����µ���ӳ�䡣
 */

    //public TreeMap(Comparator<? super K> comparator)
    // ����һ���µġ��յ���ӳ�䣬��ӳ����ݸ����Ƚ�����������

        TreeMap<String, String> tm2 = new TreeMap<String, String>(
                new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        return o1.length()-o2.length();
                    }
                }
        );

        // ����Ԫ�ز����Ԫ��
        tm1.put("c", "���");
        tm1.put("bbb", "����");
        tm1.put("aa", "צ��");
        tm1.put("ddd", "צ��EE");

        tm2.put("aaaa", "���");
        tm2.put("b", "����");
        tm2.put("ccc", "צ��");
        tm2.put("dd", "צ��EE");

        System.out.println(tm1); //{aa=צ��, bbb=����, c=���, ddd=צ��EE}
        System.out.println("----------------");
        System.out.println(tm2); //{b=����, dd=צ��EE, ccc=צ��, aaaa=���}

    }
}
