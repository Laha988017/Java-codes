class Shape {
  double height;
  double width;
  double redious;
  Shape(double a, double b) {
    height = a;
    width = b;
  }
Shape(double r)
{
	redious=r;
}
  double area() {
    System.out.println("Area for Figure is undefined.");
    return 0;
  }
}
class Rectangle extends Shape {
  Rectangle(double a, double b) {
    super(a, b);
  }
  // override area for rectangle
  double area() {
    System.out.println("Inside Area for Rectangle.");
    return height * width;
  }
}
class Circle extends Shape {
  Circle(double r) {
    super(r);
  }
  // override area for right circle
  double area() {
    System.out.println("Inside Area for Circle");
    return 3.21*redious*redious ;
  }
}
public class Test {
  public static void main(String args[]) {
    Shape f = new Shape(10,10);
    Rectangle r = new Rectangle(9,5);
    Circle c = new Circle(10);

    Shape figref;

    figref = f;
    System.out.println("Area is " + figref.area());

    figref = r;
    System.out.println("Area is " + figref.area());

    figref = c;
    System.out.println("Area is " + figref.area());
  }
}

