package ClassWork.jun18;

public class LoginMain {
    public static void main(String[] args) {

        LoginApp loginApp = new LoginApp("pragra", "12345");

        loginApp.login("pragra", "12345");

        // hacker -> making field private restricts the change to the password
//        loginApp.password = "mypassword";

        // to change the private field password, we have to use setPassword method
        loginApp.setPassword("mypassword");

        System.out.println(loginApp.getUserName());
        System.out.println(loginApp.getPassword());

        loginApp.login("pragra", "mypassword");
    }
}
