package com.test1;

public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";
    //constructor to initialize the variable
    public Student(int r, String n) {
        rollno = r;
        name = n;
    }
    //static method to change the value of static variable
    //de public static void change() thi khong chay duoc
    //bỏ static thì không gọi được
    //sử dụng xử lý các phương thức được sử dụng chung cho tất cả các lớp
        static void change() {
        college = "CODEGYM";
    }
    //method to display values
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }

}
