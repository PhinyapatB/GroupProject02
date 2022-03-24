package GroupProject.PJ02;

public class Task01 {
    /*1.Create an Interface 'Shape' with undefined methods
    as calculateArea and calculate Perimeter. Create 2
    classes Circle & Square that implements functionality
    defined in the Shape Interface. Test your code
    */

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.radius = 20;
        circle.calculateArea();
        circle.calculatePerimiter();

        Square square = new Square();
        square.side = 10;
        square.calculateArea();
        square.calculatePerimiter();
    }
}

interface Shape {
    void calculateArea();
    void calculatePerimiter();
}

class Circle implements Shape {
    double radius = 0;

    @Override
    public void calculateArea() {

        double area = Math.PI * radius * radius;
        System.out.println("Area of circle is " + area);
    }

    @Override
    public void calculatePerimiter() {
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Perimeter of circle is " + perimeter);
    }
}

class Square implements Shape {
    double side = 0;

    @Override
    public void calculateArea() {
        double area = side * side;
        System.out.println("Area of square is " + area);
    }

    @Override
    public void calculatePerimiter() {
        double perimeter = 4 * side;
        System.out.println("Perimeter of square is " + perimeter);
    }
}



