public class Instructor extends User {
    private String instructorCode;

    public Instructor(int id, String firstName, String lastName, String accountName,String instructorCode) {
        super(id, firstName, lastName, accountName);
        this.instructorCode=instructorCode;
    }

    public  Instructor(){

    }

    public String getInstructorCode() {
        return instructorCode;
    }

    public void setInstructorCode(String instructorCode) {
        this.instructorCode = instructorCode;
    }
}
