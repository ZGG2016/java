package org.zgg.list;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> s = new Stack<>();

        //public E push(E item)把项压入堆栈顶部。其作用与下面的方法完全相同：addElement(item)【添加到此向量的末尾】
        s.push("aaa");
        s.push("bbb");
        s.push("ccc");
        System.out.println(s);
        //public E pop()移除堆栈顶部的对象，并作为此函数的值返回该对象。
        //EmptyStackException - 如果堆栈为空。
//        s.pop();
//        System.out.println(s);

//        s.pop();
//        s.pop();
//        s.pop();
//        s.pop();

        //public E peek()查看堆栈顶部的对象，但不从堆栈中移除它。
        System.out.println(s.peek());  //ccc

        //public boolean empty()测试堆栈是否为空。
        System.out.println(s.empty()); //false

        //public int search(Object o)返回对象在堆栈中的位置，以 1 为基数。
        // 如果对象 o 是堆栈中的一个项，此方法返回距堆栈顶部最近的出现位置到堆栈顶部的距离；
        // 堆栈中最顶部项的距离为 1。使用 equals 方法比较 o 与堆栈中的项。

        System.out.println(s.search("bbb"));  //2
    }
}
