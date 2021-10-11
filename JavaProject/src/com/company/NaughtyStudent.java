package com.company;

import java.util.List;

public class NaughtyStudent extends Student {
    double studntAvgGrd;

    public NaughtyStudent(List<Double> studentGrades, double avgGrade) {
        super(studentGrades);

        this.studntAvgGrd = avgGrade;
    }

    public boolean averageGradeIncreased() {
        boolean naughtyStud = false;

        if((studntAvgGrd/100) * getAverageGrade() == 10) {
            naughtyStud = true;
        }
        return naughtyStud;
    }
}
