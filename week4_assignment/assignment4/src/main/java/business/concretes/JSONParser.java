package business.concretes;

import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonArrayFormatVisitor;
import entity.Student;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class JSONParser {

    public List<Student> jsonParser() {
        List<Student> studentList = new ArrayList<>();
        try {
            // Read studentList.json file in local
            FileReader fr = new FileReader("studentList.json");
            // Json data parsing
            JSONParser parser1 = new JSONParser();
            // Json array formatted
            JsonArrayFormatVisitor jObj = (JsonArrayFormatVisitor) parser1.jsonParser(); //this parsing method doesn't work :( i can not it


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        // return student list to needed class (ReadThreadProcess class)
        return studentList;

    }
}
