public class User {
    private int id;
    private String firstName;
    private String lastName;
    private String accountName;

    public User(int id, String firstName, String lastName, String accountName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountName = accountName;
    }

    public User(){

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
}
