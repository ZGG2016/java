package org.zgg.extend;

public class ExtendsDemo03 {
    public static void main(String[] args) {

        Son s = new Son();
        System.out.println("----------------");
        Son ss = new Son("����ϼ");
        /*
          Father�Ĵ��ι��췽��
          Son���޲ι��췽��
          ----------------
          Father�Ĵ��ι��췽��
          Son���޲ι��췽��
          Son�Ĵ��ι��췽��
         */
    }

     static class Father {
        /*
         ����3���ø����ṩ�޲ι��졣
        public Father() {
            System.out.println("Father���޲ι��췽��");
        }
        */

        public Father(String name) {
            System.out.println("Father�Ĵ��ι��췽��");
        }
    }

     static class Son extends Father {
        public Son() {
            super("����"); //����1������ͨ��superȥ��ȷ���ô��ι��졣
            System.out.println("Son���޲ι��췽��");
        }

        public Son(String name) {
            //super("����");
            this(); //����2������ͨ��this���ñ������������(�������Son���޲ι���)
            System.out.println("Son�Ĵ��ι��췽��");
        }
    }
}
