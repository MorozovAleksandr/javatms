package homeWork.L15HW.task3;

import java.util.HashMap;
import java.util.Map;

public class Student {
    private final String name;
    private final String group;
    private final int course;
    private final HashMap<String, Integer> subjectGrades = new HashMap<>();

    public Student(String name, String group, int course) {
        this.name = name;
        this.group = group;
        this.course = course;
    }

    public void addSubjectGrade(String subject, int grade) {
        this.subjectGrades.put(subject, grade);
    }

    public double getAverageGrade() {
        double averageGrade = 0;
        for (Map.Entry<String, Integer> subjectGrade : subjectGrades.entrySet()) {
            averageGrade += subjectGrade.getValue();
        }

        return averageGrade / subjectGrades.size();
    }

    public int getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", subjectGrades=" + subjectGrades +
                '}';
    }
}
