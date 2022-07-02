package business.concretes;

import entity.Student;

import java.util.ArrayList;
import java.util.List;

public class ReadThread implements Runnable {

    static List<Student> students = new ArrayList<>();
    static String path = "";


    public ReadThread(String path) {
        this.path = path;
    }

    @Override
    public void run() {

        try {
            // waiting time for thread process
            Thread.sleep(300);

            // instance of StudentJsonParse
            JSONParser sjp = new JSONParser();
            // parsing process with json parser
            StudentList studentList = (StudentList) sjp.jsonParser();

        } catch (Exception e) {
            System.err.println("Reading Error");
        }
    }

    // student List method
    public List<Student> writeStudentList() {
        return students;
    }
}
