package GroupProject.PJ02;

public class Task02 {
    /*	2.We have to calculate the average of marks obtained in three subjects
        by student A and by student B.
        Create   class   'Marks'   with   an   abstract   method 'getPercentage'
        that will be returning the average percentage   of   marks.
        Provide   implementation   of abstract   method   in   classes   'A'   and   'B'.   The
        constructor of student A takes the marks in three subjects as its parameters and the marks
        in four subjects as its parameters for student B. Test your Code
    */
    public static void main(String[] args) {
        A a = new A(80, 85, 90);
        System.out.println("Percentage of student A is " + a.getPercentage());

        B b = new B(80, 85, 90, 99);
        System.out.println("Percentage of student D is " + b.getPercentage());
    }
}

abstract class Marks {
    abstract double getPercentage();
}

class A extends Marks {
    private double sub1, sub2, sub3;
    static double totalScore = 300;

    A(double sub1, double sub2, double sub3) {
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }

    @Override
    double getPercentage() {
        return (sub1 + sub2 + sub3) * 100 / totalScore;
    }
}

class B extends Marks {
    private double sub1, sub2, sub3, sub4;
    static double totalScore = 400;

    B(double sub1, double sub2, double sub3, double sub4) {
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
        this.sub4 = sub4;
    }

    @Override
    double getPercentage() {
        return (sub1 + sub2 + sub3 + sub4) * 100 / totalScore;
    }
}