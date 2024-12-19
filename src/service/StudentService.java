package service;

import model.Course;
import model.Student;

import java.util.HashMap;
import java.util.Map;

public class StudentService {

    private final Map<String, Student> students = new HashMap<>();

    // subscribeStudent
    public void subscribeStudent(Student student){                             // subscribeStudent (How do we store the student to students)
        students.put(student.getId(), student);
    }

    public Student findStudent(String studentId){                               //findStudent
        if(students.containsKey(studentId)){
            return students.get(studentId);
        }
        return null;
    }

    public void enrollStudentToCourse(String studentId, Course course){         //enrollStudentToCourse
        // Check that the student exists before enrolling him/her to a course
        if(students.containsKey(studentId))                                     // check that the student exist
            students.get(studentId).enrollToCourse(course);                     // enroll student to course
    }

    public boolean isSubscribed(String studentId){                              // Check if the student is subscribed
        // TODO
        return students.containsKey(studentId);
    }

    public void showSummary(){                                                  // Show summary of all the subscribed students
        // TODO

    }

}
