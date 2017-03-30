package se.spoon.dao;

import se.spoon.entity.Student;

import java.util.Collection;



// Data Access Object
public interface StudentDao {
    Collection<Student> getAllStudents();

    Student getStudentById(int id);

    void removeStudentById(int id);

    void updateStudent(Student student);

    void insertStudentToDb(Student student);
}
