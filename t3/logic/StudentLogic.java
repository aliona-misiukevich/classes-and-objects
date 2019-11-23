package com.company.task5.logic;

import com.company.task5.entity.Student;

public class StudentLogic {
    public static boolean isExcellentStudent(Student students) {
        int[] x = students.getMarks();
        for (int j = 0; j < students.getMarks().length; j++)
            if (x[j] < Student.getMinAcceptableMark()) {
                return false;
            }
        return true;
    }
}
