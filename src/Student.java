public class Student extends User {

    private String studentCode;

    public Student(int id, String firstName, String lastName, String accountName, String studentCode) {
        super(id, firstName, lastName, accountName);
        this.studentCode = studentCode;
    }

    public Student(){

    }


    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }
}
