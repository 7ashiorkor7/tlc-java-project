package com.company;

import java.util.ArrayList;
import java.util.List;

public class JavaProject {

    public static void main(String[] args) {
        List<Double> studGrades = new ArrayList<>();
        List<Student> studentLst = new ArrayList<>();
        double hackedGrade = 0;

        NaughtyStudent naughtyStudent = new NaughtyStudent(studGrades, hackedGrade);
        studentLst.add(naughtyStudent);

        Lecture lecture = new Lecture(studentLst);

    }
}
