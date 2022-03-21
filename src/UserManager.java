public class UserManager {
    public void addToDatabase(User user){
        System.out.println("User added to Database!!"+" : "+user.getAccountName());
    }

    public  void removeFromdatabase(User user){
        System.out.println("User removed from Database!!"+" : "+user.getAccountName());
    }

    public void update(User user){
        System.out.println("User updated!!"+" : "+user.getAccountName());
    }





}
