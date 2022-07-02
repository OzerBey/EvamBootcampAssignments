package business.concretes;

import entity.Student;

import java.util.List;

public class StudentList {

    //show method for student list
    public void showStudentList(List<Student> students) {
        String name, surname;
        int age;
        for (Student student : students) {
            name = student.getName();
            surname = student.getSurname();
            age = student.getAge();
            System.out.println("///---Students informations---///");
            System.out.println("  Name : " + name + " - " + " Surname : " + surname + "Age : " + age);

        }

    }
}
