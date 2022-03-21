public class StudentManager extends UserManager{
    @Override
    public void addToDatabase(User user) {
        System.out.println("Student added to Database!!"+" : "+user.getAccountName());
    }

    @Override
    public void removeFromdatabase(User user) {
        System.out.println("Student removed from Database!!"+" : "+user.getAccountName());
    }

    @Override
    public void update(User user) {
        System.out.println("Student updated!!"+" : "+user.getAccountName());

    }


    public void loginCourse(User user){
        System.out.println(user.getLastName()+" "+user.getFirstName()+" logined the course!!");
    }
}
