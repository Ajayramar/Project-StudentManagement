package com.zoho;

import java.util.Collections;
import java.util.*;

class UpdateStudentsDetails extends ActivitiesOfStudent
{

    StudentComparator arrangeStudent=new StudentComparator();

    static Queue<Student> studentList=new LinkedList<Student>();

    protected void choose()
    {
        option();

        boolean stopProgress=false;

        while (stopProgress==false)
        {
            System.out.print("Please Enter The Key :");
            Scanner input = new Scanner(System.in);
            int key = input.nextInt();
            ActivitiesOfStudent studentActivity = new ActivitiesOfStudent();
            switch (key)
            {
                case 1:
                    System.out.println("Please Add The Student Details................");
                    studentActivity.addStudent();
                    System.out.println();
                    break;

                case 2:
                    studentActivity.printList();
                    System.out.println();
                    break;

                case 3:
                    System.out.print("Give The Index Of The Student To Add :");
                    int indexToStudent = input.nextInt();
                    studentActivity.addStudent(indexToStudent);
                    System.out.println();
                    break;

                case 4:
                    System.out.print("Give The RollNo Of Student To UpdateName :");
                    int indexToUpdateName = input.nextInt();
                    System.out.print("Give The Name Of Student To Update :");
                    input.nextLine();
                    String updateName = input.nextLine();
                    updateName(indexToUpdateName, updateName);
                    System.out.println("Updated Successfully..........................");
                    System.out.println();
                    break;

                case 5:
                    System.out.print("Give The RollNo Of Student To UpdateAge :");
                    int indexToUpdateAge = input.nextInt();
                    System.out.print("Give The Age Of Student To Update :");
                    byte updateAge = input.nextByte();
                    updateAge(indexToUpdateAge, updateAge);
                    System.out.println("Updated Successfully..........................");
                    System.out.println();
                    break;

                case 6:
                    System.out.print("Give The RollNumber To Be Removed :");
                    int rollNo = input.nextInt();
                    removeStudent(rollNo);
                    System.out.println();
                    break;

                case 7:
                    arrangeStudentByName();
                    System.out.println("Students Are Arranged By Name Successfully................... ");
                    System.out.println();
                    break;

                case 8:
                    studentActivity.copyListOfStudentIntoAnotherList();
                    System.out.println("The Second List Of Student is Created..........................");
                    System.out.println();
                    break;

                case 9:
                    studentActivity.printSecondList();
                    System.out.println();
                    break;

                case 10:
                    shuffleTheStudentList();
                    System.out.println("Student List Has Been Shuffled......................");
                    System.out.println();
                    break;

                case 11:
                    reverseSecondListOfStudents();

                    System.out.println("List Arranged By Reverse Order........................");
                    System.out.println();
                    break;

                case 12:
                    compareTwoArrayList();
                    System.out.println("Student List Compared By Their Name...................");
                    System.out.println();
                    break;

                case 13:
                    joinTwoArrayList(listOfStudents,secondListOfStudents);
                    System.out.println("Joined Two ArrayList...................");
                    System.out.println();
                    break;

                case 14:
                    printThirdListOfStudent();
                    System.out.println();
                    break;

                case 15:
                    emptyTheList(thirdListOfStudents);
                    System.out.println("All Student Data is deleted...................");
                    System.out.println();
                    break;

                case 16:
                    checkTheListEmptyOrNot(thirdListOfStudents);
                    System.out.println();
                    break;

                case 17:
                    trimArrayListSize(listOfStudents);
                    System.out.println();
                    break;

                case 18:
                    option();
                    System.out.println();
                    break;

                case 19:
                    getQueue();
                    break;

                case 20:
                    stopProgress=true;
                    System.out.println();
                    break;

                default:
                    System.out.println("Type Mis-match Please Choose Appropriate Option");
                    System.out.println();
                    break;
            }
        }
    }

    private static void option(){
        System.out.println("1.ADD STUDENT DETAILS");
        System.out.println("2.TO PRINT THE STUDENT LIST");
        System.out.println("3.TO ADD STUDENT AT SPECIFIC INDEX");
        System.out.println("4.TO UPDATE NAME OF STUDENT BY ROLL NO");
        System.out.println("5.TO UPDATE AGE OF STUDENT BY ROLL NO ");
        System.out.println("6.TO REMOVE STUDENT FROM LIST");
        System.out.println("7.TO SORT THE STUDENT BY NAME");
        System.out.println("8.TO CREATE SECOND LIST OF STUDENT");
        System.out.println("9.TO PRINT SECOND LIST OF STUDENTS");
        System.out.println("10.TO SHUFFLE THE STUDENT LIST ON SECOND LIST");
        System.out.println("11.TO REVERSE THE SECOND LIST OF STUDENT");
        System.out.println("12.TO COMPARE TWO LIST");
        System.out.println("13.TO JOIN TWO LIST");
        System.out.println("14.TO PRINT THIRD LIST OF STUDENTS");
        System.out.println("15.TO EMPTY THE LIST");
        System.out.println("16.TO CHECK THE LIST EMPTY OR NOT");
        System.out.println("17.TO TRIM LIST OF STUDENTS");
        System.out.println("18.TO OPTION");
        System.out.println("19.TO SERVE LAPTOP TO STUDENT");
        System.out.println("20.TO EXIT");
        System.out.println();
    }

    // update Student Name by rollNo
    private static void updateName(int RollNo, String updatedName)
    {
        int index=0;

        for(Student student:listOfStudents)
        {
            if(student.rollNo==RollNo)
            {
                Student newStudent=new Student(student.rollNo,updatedName, student.age);
                listOfStudents.set(index,newStudent);
                break;
            }
            index++;
        }
    }

    //update Student Age by rollNo
    private void updateAge(int rollNo, byte updatedAge)
    {
        int index=0;
        for(Student student:listOfStudents)
        {
            if(student.rollNo==rollNo){
                Student newStudent=new Student(student.rollNo,student.name, updatedAge);
                listOfStudents.set(index,newStudent);
                break;
            }
            index++;
        }
    }

    private void getQueue(){
        System.out.println(UpdateStudentsDetails.studentList);
        System.out.println();
    }

    //remove student by rollName
    private void removeStudent(int RollNo)
    {
       for(Student student:listOfStudents){
           if(student.rollNo==RollNo){
               listOfStudents.remove(student);
               System.out.println("Student removed..................");
           }
       }
    }

    //arrange student by their name on second list
    private void arrangeStudentByName(){
        Collections.sort(listOfStudents,arrangeStudent);
    }

    //arrange student by their name on second list
    private void arrangeStudentByNameOnSecondList(){
        Collections.sort(secondListOfStudents,arrangeStudent);
    }

    //shuffle student list
    private void shuffleTheStudentList(){
        Collections.shuffle(secondListOfStudents);
    }

    //reverse the second list of student
    private void reverseSecondListOfStudents(){
        Collections.reverse(secondListOfStudents);
    }

    //compare two Arraylist by
    private void compareTwoArrayList(){
        for(int i=0; i<listOfStudents.size(); i++){
            if(listOfStudents.get(i).name.equals(secondListOfStudents.get(i).name)){
                System.out.println("The same name of student in both arraylist "+listOfStudents.get(i).name);
            }
        }
    }

    private void updateNameUsingGetSet(int rollNo){
        for(Student student:listOfStudents){
            if(student.getRollNo()==rollNo){
                student.setName("srinivasan");
            }
        }
    }

    private void emptyTheList(List list){
        list.clear();
    }

    private void checkTheListEmptyOrNot(List list){
        boolean result=list.isEmpty();
        if(result==true){
            System.out.println("List Is Empty");
        }else{
            System.out.println("List Is Not Empty");
        }
    }

    private void joinTwoArrayList(List list1,List list2){
        thirdListOfStudents.addAll(list1);
        thirdListOfStudents.addAll(list2);
    }

    private  void printThirdListOfStudent(){
        if(thirdListOfStudents.size()>0) {
            for (Student student : thirdListOfStudents) {
                System.out.println("Roll No :" + student.rollNo);
                System.out.println("Name :" + student.name);
                System.out.println("Age :" + student.age);
                System.out.println("--------------------------------");
            }
        }else{
            System.out.println("Student List Is Empty.................");
        }
    }

    private void trimArrayListSize(ArrayList list){
        System.out.println("Size Of The List before Trim :"+listOfStudents.size());
        list.trimToSize();
        System.out.println("Size Of The List After Trim :"+listOfStudents.size());
    }
}

