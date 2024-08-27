public class Main {
    public static void main(String[] args) {
        // Create instances of Student, Professor, and Staff
        Student student1 = new Student(1, "Mohammed", "mohummed@gmail.com", "Fttt2", new String[] {"Math", "English"});
        Professor professor1 = new Professor(2, "Wael Samer", "waelsamer162@gmail.com", "Fttp3", "Computer Science", new String[] {"Programming", "CyberSecurity"});
        Staff staff1 = new Staff(3, "Raghd Dwedar", "raghdwael2@gamil.com", "Fts1", "Admin");

        // Create instances of ProgrammingCourse
        ProgrammingCourse course1 = new ProgrammingCourse("language Programming", "corr2");
        ProgrammingCourse course2 = new ProgrammingCourse("Network","Corr3");

        // Assign professor and enroll students
        course1.assignProfessor(professor1);
        course1.enrollStudent(student1);
        course2.assignProfessor(professor1);
        course2.enrollStudent(student1);


        Department department = new Department("Eng Computer Science");
        department.addCourse(course1);
        department.addCourse(course2);
        department.addUser(student1);
        department.addUser(professor1);
        department.addUser(staff1);


        University university = new University("Cairo University");
        university.addDepartment(department);


        university.displayUniversityDetails();
    }
}
