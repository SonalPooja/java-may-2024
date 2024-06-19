package ClassWork.jun18;

public class LoginApp {

    private String userName;
    private String password;

    public LoginApp(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // sets the logic to login into app
    public void login(String userName, String password){
        if(this.userName.equals(userName) && this.password.equals(password)){
            System.out.println("Login successful");
        }
        else{
            System.out.println("Login failed");
        }
    }

    @Override
    public String toString() {
        return "LoginApp{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
