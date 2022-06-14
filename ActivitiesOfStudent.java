package com.zoho;

import java.util.*;

class ActivitiesOfStudent
{
    static ArrayList<Student> listOfStudents=new ArrayList<Student>();

    static int rollNo;
    static String name;
    static int age;

    static ArrayList<Student> secondListOfStudents=new ArrayList<Student>();

    static ArrayList<Student> thirdListOfStudents=new ArrayList<Student>();

    static Scanner input=new Scanner(System.in);

    //one parameter method
    protected List<Student> addStudent()
    {
            System.out.print("Enter rollNo :");
            rollNo = input.nextInt();

            int flag=0;
            for(Student student:listOfStudents)
            {
                if(student.rollNo==rollNo)
                {
                    System.out.println("The Given Roll Number Already Exist Please Give Unique RollNumber........................... ");
                    flag=1;
                    addStudent();
                }
            }
            if(flag==0)
            {
                input.nextLine();
                System.out.print("Enter Name :");
                name = input.nextLine();

                System.out.print("Enter Age :");
                age = input.nextInt();

                listOfStudents.add(new Student(rollNo, name, age));

                UpdateStudentsDetails.studentList.add(new Student(rollNo, name, age));

                System.out.println("Student Details Added Successfully................................");

                flag=0;
            }

            return listOfStudents;
    }

    //method overLoaded with two parameters
    protected  List<Student> addStudent(int index)
    {

        if(listOfStudents.size()>=index)
        {
            System.out.print("Enter rollNo :");
            rollNo = input.nextInt();

            int flag = 0;
            for (Student student : listOfStudents)
            {
                if (student.rollNo == rollNo)
                {
                    System.out.println("The Given Roll Number Already Exist Please Give Unique RollNumber........................... ");
                    flag = 1;
                    addStudent();
                }
            }
            if (flag == 0) {
                input.nextLine();
                System.out.print("Enter Name :");
                name = input.nextLine();

                System.out.print("Enter Age :");
                age = input.nextInt();

                listOfStudents.add(index, new Student(rollNo, name, age));

                UpdateStudentsDetails.studentList.add(new Student(rollNo, name, age));

                System.out.println("Student Details Added Successfully................................");

                flag = 0;
            }
        }else
        {
            System.err.println("Size Of The Student List Is Short Please Check The List By Key 2");
        }

        return listOfStudents;
    }

    //copy list of students into another list
    protected void copyListOfStudentIntoAnotherList(){
        secondListOfStudents.addAll(listOfStudents);
    }

    //for printing the StudentsList
    protected void printList()
    {
        if(listOfStudents.size()>0) {
            for (Student student : listOfStudents) {
                System.out.println("RollNo :" + student.rollNo);
                System.out.println("Name :" + student.name);
                System.out.println("Age :" + student.age);
                System.out.println("----------------------------");
            }
        }else{
            System.out.println("Student List Is Empty............");
        }
    }

    //for printing the secondListOfStudents
    protected void printSecondList()
    {
        if(secondListOfStudents.size()>0) {
            for (Student student : secondListOfStudents) {
                System.out.println("RollNo :" + student.rollNo);
                System.out.println("Name :" + student.name);
                System.out.println("Age :" + student.age);
                System.out.println("----------------------------");
            }
        }else{
            System.out.println("Student List Is Empty............");
        }
    }

}

