package org.zgg.extend;
/*
	ѧ����������ʦ��������

	ѧ����
		��Ա����������������
		���췽�����޲Σ�����
		��Ա������getXxx()/setXxx()
	��ʦ��
		��Ա����������������
		���췽�����޲Σ�����
		��Ա������getXxx()/setXxx()

	������������ĳ�Ա�������˺ܶ���ͬ�Ķ������������ǾͿ��ǳ�ȡһ�����Ե��ࣺ
	�ˣ�
		��Ա����������������
		���췽�����޲Σ�����
		��Ա������getXxx()/setXxx()

		ѧ�� �̳� ��
		��ʦ �̳� ��
*/
public class ExtendsTest01 {
    public static void main(String[] args) {
        //����ѧ�����󲢲���
        //��ʽ1
        Student s1 = new Student();
        s1.setName("����ϼ");
        s1.setAge(27);
        System.out.println(s1.getName()+"---"+s1.getAge());

        //��ʽ2
        Student s2 = new Student("����ϼ",27);
        System.out.println(s2.getName()+"---"+s2.getAge());

    }

    //��������
    static class Person {
        //����
        private String name;
        //����
        private int age;

        public Person() {
        }

        public Person(String name,int age) { //"����ϼ",27
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    //����ѧ����
    static class Student extends Person {
        public Student() {}

        public Student(String name,int age) { //"����ϼ",27
            //this.name = name;
            //this.age = age;
            super(name,age);
        }
    }

    //������ʦ��
    static class Teacher extends Person {

    }
}
