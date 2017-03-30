package se.spoon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import se.spoon.dao.StudentDao;
import se.spoon.entity.Student;

import java.util.Collection;





@Service
public class StudentService {

    @Autowired
    @Qualifier("fakeData") // Alternatives: "fakeData" or "mysql"
    private StudentDao studentDao;

    public Collection<Student> getAllStudents(){
        return studentDao.getAllStudents();
    }

    public Student getStudentById(int id){
        return this.studentDao.getStudentById(id);
    }

    public void removeStudentById(int id) {
        this.studentDao.removeStudentById(id);
    }

    public void updateStudent(Student student){
        this.studentDao.updateStudent(student);
    }

    public void insertStudent(Student student) {
        this.studentDao.insertStudentToDb(student);
    }


}
