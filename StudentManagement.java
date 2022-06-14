package com.zoho;

import java.sql.Connection;
import java.util.Scanner;

public class StudentManagement extends ActivitiesOfStudent {


    public static void main(String[] args)
    {
        UpdateStudentsDetails updateStudentsDetails=new UpdateStudentsDetails();
        updateStudentsDetails.choose();
    }

}
