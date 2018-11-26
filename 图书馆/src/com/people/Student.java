package com.people;

import java.util.Scanner;

public class Student extends person {
    private String classroom;
    private Student students[];
     static int maxsize=10;
    public Student(){}
    public Student(String name,String id,String classroom){
        this.classroom=classroom;
    }
    public Student(Student student){
        this.classroom=student.classroom;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public void setStudents(Student[] students) {
        for (int i=0;i<maxsize;i++){
            students[i]=new Student(students[i]);
        }
    }

    public Student[] getStudents() {
        return students;
    }

    public Student getAstudent(){
        Student studenti;
        Scanner s1=new Scanner(System.in);
        System.out.println("请输入个人信息");
        System.out.print("请输入学号");
        String id=s1.nextLine();
        System.out.print("请输入姓名");
        String name=s1.nextLine();
        System.out.print("请输入班级");
        String classroom=s1.nextLine();
        studenti=new Student(name,id,classroom);
        return studenti;

    }
    @Override
    public void login() {

    }
}
