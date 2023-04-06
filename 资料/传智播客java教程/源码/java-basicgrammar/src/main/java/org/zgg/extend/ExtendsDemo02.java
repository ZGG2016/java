package org.zgg.extend;

public class ExtendsDemo02 {
    public static void main(String[] args) {
        //��������
        Son s = new Son();
        System.out.println("------------");
        Son s2 = new Son("����ϼ");
    }

     static class Father {
        int age;

        public Father() {
            System.out.println("Father���޲ι��췽��");
        }

        public Father(String name) {
            System.out.println("Father�Ĵ��ι��췽��");
        }
    }

     static class Son extends Father {
        public Son() {
            //super();
            System.out.println("Son���޲ι��췽��");
        }

        public Son(String name) {
            //super();
            System.out.println("Son�Ĵ��ι��췽��");
        }
    }
}
