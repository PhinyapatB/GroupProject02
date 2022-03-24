package GroupProject.PJ02;


class Registrationn {
    /* 4.Create Registration Class in which you would have variables as email,
       userName and password that have an access scope only within its own class.
       After creating an object of the class user should be able to call methods
       and in each method separately pass values to set users email, username and password.
       Requirements:
       A. Valid email consider to be only yahoo
       B. Valid userName and password cannot be empty and should be of length larger than 6
       characters. Also, valid password cannot contain userName.


    private String Email;
    private String Username;
    private String Password;

    Registrationn(String Email, String Username, String Password) {
        this.Email = Email;
        this.Username = Username;
        this.Password = Password;

    }

    void Email() {
        if (Email.contains("yahoo")) {
            System.out.println("Correct Email Type");

        } else {
            System.out.println("Incorrect Email Type");
        }


    }

    void Username() {
        if (!Username.isEmpty()) {
            System.out.println("Username not Empty");
        } else {
            System.out.println("Username Empty");
        }
        if (Username.length() > 6) {
            System.out.println("Username is Larger than 6 characters");
        } else {
            System.out.println("Username is less than 6 characters");
        }
    }

    void Password() {
        if (!Password.isEmpty()) {
            System.out.println("Password not empty");
        } else {
            System.out.println("Password empty");
        }
        if (Password.length() > 6) {
            System.out.println("password is greater than 6 characters");
        } else {
            System.out.println("password is less than 6 characters");
        }
    }

    public static void main(String[] args) {
        Registrationn registration = new Registrationn("yahoo", "mraa2345", "abcd456@");
        registration.Email();
        registration.Username();
        registration.Password();
    }
*/
}