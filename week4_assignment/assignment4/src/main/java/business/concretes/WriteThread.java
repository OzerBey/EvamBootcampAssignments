package business.concretes;

import entity.Student;

import java.util.ArrayList;
import java.util.List;

public class WriteThread implements Runnable {


    public List<Student> studentList = new ArrayList<>();

    @Override
    public void run() {
        try {

            Thread.sleep(1000);//// system waiting time

            // instance of ReadThreadProcess
            ReadThread readThread = new ReadThread("studentList.json");

            // put in a list to show on screen
            studentList = readThread.writeStudentList();

            // student list to show
            StudentList studentListClass = new StudentList();
            studentListClass.showStudentList(studentList);

        } catch (Exception e) {
            // if there is an error
            System.err.println("Write Error");
        }
    }
}
