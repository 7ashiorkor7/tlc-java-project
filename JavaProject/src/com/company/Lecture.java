package com.company;

import java.util.ArrayList;
import java.util.List;

public class Lecture {
    List<Student> studentList;

    public Lecture(List<Student> stdLst) {
        this.studentList = stdLst;
    }

    public double getHighestAverageGrade() {
        double highestAverage = 0;

        for (Student s : studentList) {
            double studAvg = s.getAverageGrade();

            if (studAvg > highestAverage) {
                highestAverage = studAvg;
            }
        }

        return highestAverage;
    }
}
