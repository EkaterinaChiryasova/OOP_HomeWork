package HomeTask5.service;

import HomeTask5.model.Student;
import HomeTask5.model.StudentGroup;
import HomeTask5.model.Teacher;

import java.util.List;

public class StudentGroupService {
        public StudentGroup createStudentGroup(Teacher teacher, List<Student> students) {
            return new StudentGroup(teacher, students);
        }
    }
    

