package org.assignment12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.stream.Collectors;

public class JavaAssignment12 {
    public static void main(String args[]) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8));
        students.add(new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2));
        students.add(new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3));
        students.add(new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80));
        students.add(new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70));
        students.add(new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70));
        students.add(new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70));
        students.add(new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80));
        students.add(new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85));
        students.add(new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82));
        students.add(new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83));
        students.add(new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4));
        students.add(new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6));
        students.add(new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8));
        students.add(new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4));
        students.add(new Student(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4));
        students.add(new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5));

        //Print the name of all departments in the college?
        Set<String> departments = students.stream().map(student -> student.getEngDepartment()).collect(Collectors.toSet());
        System.out.println("all departments=" + departments);
        System.out.println("----------------------------------------------------");
        //Get the names of all students who have enrolled after 2018?
        List<String> names = students.stream().filter(student -> student.getEnrollmentYear() > 2018).map(Student::getName).collect(Collectors.toList());
        System.out.println("students who have enrolled after 2018=" + names);
        System.out.println("----------------------------------------------------");
        //Get the details of all male student in the computer sci department?
        List<Student> maleAndCSstudents = students.stream().filter(student -> student.getGender().equals("Male") && student.getEngDepartment().equals("Computer Science")).collect(Collectors.toList());
        System.out.println("all male student in the computer sci department=" + maleAndCSstudents);
        System.out.println("----------------------------------------------------");
        //How many male and female student are there ? (HINT:use Collectors.groupingBy() for grouping based on gender)
        Map<String, List<Student>> studentsGroupByGender = students.stream().collect(Collectors.groupingBy(Student::getGender));
        System.out.println("male students count=" + studentsGroupByGender.get("Male").size());
        System.out.println("female students count=" + studentsGroupByGender.get("Female").size());
        System.out.println("----------------------------------------------------");
        // .What is the average age of male and female students?
        OptionalDouble avgMaleAge = studentsGroupByGender.get("Male").stream().mapToDouble(Student::getAge).average();
        System.out.println("avgMaleAge=" + avgMaleAge.getAsDouble());
        OptionalDouble avgFemaleAge = studentsGroupByGender.get("Female").stream().mapToDouble(Student::getAge).average();
        System.out.println("avgFemaleAge=" + avgFemaleAge.getAsDouble());
        System.out.println("----------------------------------------------------");
        //Get the details of highest student having highest percentage ?
        Optional<Student> hightstPercentStudent = students.stream().max(Comparator.comparing(Student::getPerTillDate));
        System.out.println("hightest percentage student=" + hightstPercentStudent.get());
        System.out.println("----------------------------------------------------");
        //Count the number of students in each department? (Hint :use Collectors.groupingBy())
        Map<String, List<Student>> studentsGroupByDept = students.stream().collect(Collectors.groupingBy(Student::getEngDepartment));
        studentsGroupByDept.forEach((k, v) -> System.out.println("Dept Name:" + k + " Count:" + v.size()));
        System.out.println("----------------------------------------------------");
        //What is the average percentage achieved in each department?
        studentsGroupByDept.forEach((k, v) -> {
            OptionalDouble avgPercent = studentsGroupByDept.get(k).stream().mapToDouble(Student::getPerTillDate).average();
            System.out.println("Dept:" + k + " Avg Percentage=" + avgPercent);

        });
        System.out.println("----------------------------------------------------");
        // . Get the details of youngest male student in the Electronic department?(Hint :Use Collectors.minBy)
        Optional<Student> student = students.stream().filter(s -> s.getEngDepartment().equals("Electronic")).collect(Collectors.minBy(Comparator.comparing(Student::getAge)));
        System.out.println("Youngest Electronic Student:" + student);
        System.out.println("----------------------------------------------------");
        //.How many male and female students are there in the computer science department?
        Map<String, List<Student>> computerScienceStudentsGroupByGender = students.stream().filter(student1 -> student1.getEngDepartment().equals("Computer Science")).collect(Collectors.groupingBy(Student::getGender));
        computerScienceStudentsGroupByGender.forEach((k, v) -> {
            System.out.println("Gener:" + k + " count:" + v.size());
        });
    }
}

