package com.codegym;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("Bach","C1121G1");
        Student student2 = new Student("Tinh","C1121G1");
        student1.setName("Quan");
        student2.getClasses();
        student2.setClasses("C0821G1");
        System.out.println(student1.name);
        System.out.println(student2.classes);
    }
}
