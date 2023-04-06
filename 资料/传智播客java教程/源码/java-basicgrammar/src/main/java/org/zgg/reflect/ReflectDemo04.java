package org.zgg.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
/*
* ͨ�������ȡ��Ա������ʹ��
*
* */
public class ReflectDemo04 {
    public static void main(String[] args) throws Exception {
        // ��ȡ�ֽ����ļ�����
        Class c = Class.forName("javabase.reflect.Person");

        // ��ȡ���еĳ�Ա����
        // Field[] fields = c.getFields();  //����
        // Field[] fields = c.getDeclaredFields();  //����
        // for (Field field : fields) {
        // System.out.println(field);
        // }


        // ͨ���޲ι��췽����������
        Constructor con = c.getConstructor();
        Object obj = con.newInstance();
        System.out.println(obj); //Person [name=null, age=11, address=beijing]


        // ��ȡ�����ĳ�Ա����
        // ��ȡaddress�����丳ֵ
        Field addressField = c.getField("address");
        // public void set(Object obj,Object value)
        // ��ָ����������ϴ� Field �����ʾ���ֶ�����Ϊָ������ֵ��
        //Person [name=null, age=11, address=����]
        addressField.set(obj, "����"); // ��obj�����addressField�ֶ�����ֵΪ"����"
        System.out.println(obj);

        // ��ȡname�����丳ֵ (˽��private�ֶ�)
        // NoSuchFieldException
        Field nameField = c.getDeclaredField("name");
        // IllegalAccessException
        nameField.setAccessible(true);
        nameField.set(obj, "����ϼ");
        System.out.println(obj); //Person [name=����ϼ, age=11, address=����]

        // ��ȡage�����丳ֵ
        Field ageField = c.getDeclaredField("age");
        ageField.setAccessible(true);
        ageField.set(obj, 27);
        System.out.println(obj); //Person [name=����ϼ, age=27, address=����]
    }
}
