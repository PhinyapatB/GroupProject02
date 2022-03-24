package GroupProject.PJ02;

public class Task04 {
   /* 4.Create Registration Class in which you would have
        variables as email, userName and password that
        have an access scope only within its own class. After
        creating an object of the class user should be able to
        call methods and in each method separately pass
        values to set users email, username and password.
        Requirements:
        A.Valid email consider to be only yahoo
        B.Valid userName and password cannot be empty and
        should be of length larger than 6 characters. Also
        valid password cannot contain userName.

    */

    public static void main(String[] args) {
        Registration r = new Registration("momome@yahoo.com", "Momomeow", "Mo555");
        r.Email();
        r.Username();
        r.Password();

    }
}

class Registration {
    private String email;
    private String userName;
    private String password;

    Registration(String email, String userName, String password) {
        this.email = email;
        this.userName = userName;
        this.password = password;
    }

    void Email() {
        if (email.endsWith("yahoo.com")) {
            System.out.println("Email is "+email);
        } else {
            System.out.println("Please enter email yahoo.com");
        }
    }

    void Username() {
        if (!userName.isEmpty() && userName.length() > 6) {
            System.out.println("Username is " + userName);
        } else {
            System.out.println("Username cannot be empty amd more than 6 characters");
        }
    }

    void Password() {
        if (!password.isEmpty() && password.length() > 6 && !password.equals(userName)) {
            System.out.println("Password is " + password);
        } else {
            System.out.println("Password cannot be empty, should more than 6 characters and cannot contain Username");
        }
    }
}

