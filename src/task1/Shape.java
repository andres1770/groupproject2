package task1;

public interface Shape {
    void calculateArea(double radius);
    void calculatePerimiter(double diameter);
}
class Circle implements Shape {

    @Override
    public void calculateArea(double radius) {
        double area = radius * radius * Math.PI;
        System.out.println("The area of the circle [radius = " + radius + "]: " + area);
    }

    @Override
    public void calculatePerimiter(double diameter) {
        System.out.println("Perimeter of the circle is: "+ diameter*Math.PI);

    }
}
class Square implements Shape{

    @Override
    public void calculateArea(double radius) {
        double area=radius*radius;
        System.out.println("Area of Square is: "+area);

    }

    @Override
    public void calculatePerimiter(double diameter) {
        double perimiter=diameter*4;
        System.out.println("Perimiter of Square is: "+perimiter);

    }
}
class Task1Tester {
    public static void main(String[] args) {
        Shape circle= new Circle();
        circle.calculateArea(2.7);
        circle.calculatePerimiter(3.8);
        Shape square=new Square();
        square.calculateArea(3);
        square.calculatePerimiter(2.5);


    }}


