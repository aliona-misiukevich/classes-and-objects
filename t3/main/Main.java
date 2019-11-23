package com.company.task5.main;
// 3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив из пяти элементов).
// Создайте массив из десяти элементов такого типа.
// Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.

import com.company.task5.entity.Student;
import com.company.task5.view.Print;

public class Main {

    public static void main(String[] args) {

        Student[] students = new Student[]{
                new Student("Andreev", "AAA", 123, new int[]{6, 7, 8, 9, 10}),
                new Student("Zgolich", "ZAY", 345, new int[]{7, 7, 9, 9, 10}),
                new Student("Ivanov", "IAS", 678, new int[]{9, 9, 9, 9, 10}),
                new Student("Zayac", "ZAS", 123, new int[]{10, 9, 9, 9, 10}),
                new Student("Volk", "VAY", 345, new int[]{6, 7, 8, 9, 10}),
                new Student("mnhgf", "AAA", 123, new int[]{6, 7, 8, 9, 10}),
                new Student("hhhy7", "ZAY", 345, new int[]{7, 7, 9, 9, 10}),
                new Student("petuhov", "IAS", 678, new int[]{9, 9, 9, 9, 10}),
                new Student("lkjhgf", "ZAS", 123, new int[]{10, 9, 9, 9, 10}),
                new Student("mnbvc", "VAY", 345, new int[]{6, 7, 8, 9, 10})
        };

        Print.printExcellentStudents(students);
    }


}
