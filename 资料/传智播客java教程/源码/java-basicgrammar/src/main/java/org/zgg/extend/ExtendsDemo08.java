package org.zgg.extend;

public class ExtendsDemo08 {
    public static void main(String[] args) {
        NewPhone np = new NewPhone();
        np.call("����ϼ");
    }

    static class Phone {
        public void call(String name) {
            System.out.println("��"+name+"��绰");
        }
    }

    static class NewPhone extends Phone {
        public void call(String name) {
            //System.out.println("��"+name+"��绰");
            super.call(name);
            System.out.println("����������Ԥ����");
        }
    }

}
