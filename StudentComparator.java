package com.zoho;
import java.util.Comparator;

class StudentComparator implements Comparator
{
    @Override
    public int compare(Object o1, Object o2)
    {
        Student firstStudent=(Student)o1;
        Student secondStudent=(Student)o2;

        int firstStudentName=firstStudent.name.compareToIgnoreCase(secondStudent.name);
        int secondStudentName=secondStudent.name.compareToIgnoreCase(firstStudent.name);

        if(firstStudentName>secondStudentName)
        {
            return +1;

        }else if(firstStudentName<secondStudentName)
        {
            return -1;

        }else {
            return 0;
        }
    }

}