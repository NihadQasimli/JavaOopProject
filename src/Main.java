public class Main {

    public static void main(String[] args) {

        Student student = new Student(1, "Nihad", "Qasimli", "Pero", "2af3");
        Instructor instructor = new Instructor(2, "Aysel", "Temrazova", "Lavinia", "87d4t");
        InstructorManager instructorManager = new InstructorManager();
        StudentManager studentManager = new StudentManager();
        studentManager.addToDatabase(student);

        System.out.println("--------------");
        instructorManager.addToDatabase(instructor);
        System.out.println("--------------");

        studentManager.removeFromdatabase(student);
        System.out.println("--------------");

        instructorManager.removeFromdatabase(instructor);
        System.out.println("--------------");

        studentManager.update(student);
        System.out.println("--------------");

        instructorManager.update(instructor);
        System.out.println("--------------");

        instructorManager.startNewCourse(instructor);
        System.out.println("--------------");
        studentManager.loginCourse(student);
        System.out.println("--------------");


    }
}
