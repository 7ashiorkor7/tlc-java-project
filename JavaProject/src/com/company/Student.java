package com.company;

import java.util.List;

public class Student {
    private List<Double> grades;

    public Student(List<Double> studentGrades) {
        this.grades = studentGrades;
    }

    public double getAverageGrade() {
        double sum = 0;
        double average = 0;

        if (grades != null && !grades.isEmpty()) {
            for (Double mark : grades) {
                sum += mark;
            }
            average = sum / grades.size();
        }
        return average;
    }

}

