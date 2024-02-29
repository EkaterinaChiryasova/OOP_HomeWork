package HomeTask5;


import HomeTask5.controller.Controller;
import HomeTask5.model.StudentGroup;
import HomeTask5.service.DataService;

public class Main {
    public static void main(String[] args) {
        DataService dataService = new DataService();
        Controller controller = new Controller(dataService);

        controller.createStudent("Alice", "Smith", "1", "01-01-2000");

        controller.createStudent("Bob", "Johnson", "2", "02-02-2000");
        controller.getAllStudents();

        controller.createTeacher("John", "Doe", "T1", "03-03-1980");
        controller.createTeacher("Jane", "Doe", "T2", "04-04-1980");
        controller.getAllTeachers();

        controller.aggregateData();
    }
}
