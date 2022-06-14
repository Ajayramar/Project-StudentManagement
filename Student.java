package com.zoho;

class Student
{
    int rollNo;
    String name;
    int age;
    String gender;

    Student(int rollNo,String name,int age)
    {
        this.rollNo=rollNo;
        this.name=name;
        this.age=age;
    }
    Student(int rollNo,int age,String gender,String name)
    {
        this(rollNo,name,age);
        this.gender=gender;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
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
