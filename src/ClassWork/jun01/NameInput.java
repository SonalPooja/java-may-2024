package ClassWork.jun01;

public class NameInput {

    public String input(String name){
        return "Hello " + name;
    }

    public String input(String name, String email){
        return "Hello " + name + ". Your email is " + email;
    }

    public String input(String name, String email, String password){
        return "Hello " + name + ". Your email is " + email + " and password is " + password;
    }
}
