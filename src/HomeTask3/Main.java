package HomeTask3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(4, "aab", "aab", "aab");
        Student student2 = new Student(2, "aaa", "aaa", "aaa");
        Student student3 = new Student(3, "Aaa", "Aaa", "Aaa");
        Student student4 = new Student(1, "bbb", "bbb", "bbb");
        List<Student> studentList = new ArrayList<>();
        StudentGroup studentGroup = new StudentGroup(studentList);
        studentGroup.addStudent(student1);
        studentGroup.addStudent(student2);
        studentGroup.addStudent(student3);
        studentGroup.addStudent(student4);
        StudentGroupService service = new StudentGroupService(studentGroup);
        for (Student student : studentGroup) {
            System.out.println(student);
        }
        System.out.println();
        for (Student student : service.getSortedStudentGroup()) {
            System.out.println(student);
        }
        System.out.println();
        for (Student student : service.getSortedStudentGroupByFIO()) {
            System.out.println(student);
        }
        StudentGroup studyGroup1 = new StudentGroup(1, "Группа1");
        StudentGroup studyGroup2 = new StudentGroup(2, "Группа2");
        StudentGroup studyGroup3 = new StudentGroup(3, "Группа3");
        StudentGroup studyGroup4 = new StudentGroup(4, "Группа4");
        StudentGroup studyGroup5 = new StudentGroup(5, "Группа5");
        StudentGroup studyGroup6 = new StudentGroup(6, "Группа6");
        StudentGroup studyGroup7 = new StudentGroup(7, "Группа7");
        StudentGroup studyGroup8 = new StudentGroup(8, "Группа8");
        List<StudentGroup> groupAllList = new ArrayList<>();
        groupAllList.add(studyGroup1);
        groupAllList.add(studyGroup2);
        groupAllList.add(studyGroup3);
        groupAllList.add(studyGroup4);
        groupAllList.add(studyGroup5);
        groupAllList.add(studyGroup6);
        groupAllList.add(studyGroup7);
        groupAllList.add(studyGroup8);

        List<StudentGroup> groupList = new ArrayList<>();

        Stream stream1 = new Stream(1, groupList);
        stream1.addStudyGroup(studyGroup1);
        stream1.addStudyGroup(studyGroup2);
        stream1.addStudyGroup(studyGroup5);
        Stream stream2 = new Stream(2, groupList);

        stream2.addStudyGroup(studyGroup3);
        stream2.addStudyGroup(studyGroup4);
        stream2.addStudyGroup(studyGroup6);
        stream2.addStudyGroup(studyGroup7);
        Stream stream3 = new Stream(3, groupList);
        stream3.addStudyGroup(studyGroup8);

        java.util.Iterator<StudentGroup> iterator = groupAllList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }

        System.out.println();
        List<Stream> streams = List.of(stream3, stream1, stream2);

        for (Stream stream : streams) {
            System.out.println(stream);

        }
//        StudentGroupIterator iterator = new StudentGroupIterator(studentGroup);
//        while (iterator.hasNext())
//            System.out.println(iterator.next());
//        System.out.println();
//        for(Student student : studentGroup){
//            System.out.println(student);
    }
}