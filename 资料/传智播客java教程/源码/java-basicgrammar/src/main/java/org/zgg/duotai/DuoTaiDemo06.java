package org.zgg.duotai;

public class DuoTaiDemo06 {
    public static void main(String[] args) {
        A a = new B();
        a.show();  //��

        B b = new C();
        b.show();  //��
    }

    static class A {
        public void show() {
            show2();
        }
        public void show2() {
            System.out.println("��");
        }
    }
    static class B extends A {
	/*
	public void show() {
		show2();
	}
	*/

        public void show2() {
            System.out.println("��");
        }
    }
    static class C extends B {
        public void show() {
            super.show();
        }
        public void show2() {
            System.out.println("��");
        }
    }
}
