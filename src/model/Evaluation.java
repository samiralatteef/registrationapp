package model;

import java.util.List;

/**
 * An interface is an abstract class
 * that provides method signatures of
 * what a class must implement
 */
public interface Evaluation {

    // How would you describe this method signature?
    // getApprovedCourses is a method that returns a list of Courses
    // we need to perform the action of implementing ourselves in Student Class
    List<Course> getApprovedCourses();
}
