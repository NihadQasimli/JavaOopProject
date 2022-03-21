public class InstructorManager extends UserManager {

    @Override
    public void addToDatabase(User user) {
        System.out.println("Instructor added to Datebase!!"+" : "+user.getAccountName());
    }

    @Override
    public void removeFromdatabase(User user) {
        System.out.println("Instructor removed from Database!!"+" : "+user.getAccountName());
    }

    @Override
    public void update(User user) {
        System.out.println("Instructor updated!!"+" : "+user.getAccountName());
        System.out.println(user.getAccountName()+" is a instructor!!");

    }


    public  void startNewCourse(Instructor instructor){
        System.out.println(instructor.getLastName()+" "+instructor.getFirstName()+" started new course");
    }


}
