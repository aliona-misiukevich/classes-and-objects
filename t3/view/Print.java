package com.company.task5.view;

import com.company.task5.entity.Student;
import com.company.task5.logic.StudentLogic;

public class Print {
    public static void printExcellentStudents(Student[] students) {
        for (Student student : students) {
            if (StudentLogic.isExcellentStudent(student)) {
                System.out.println(student.getSurname() + " " + student.getGroupNumber());
            }
        }
    }
}
