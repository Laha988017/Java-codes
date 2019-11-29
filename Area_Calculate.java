import java.util.*;
class shape{
    double dim1,dim2;
}
class circle extends shape{
    circle(double x){
        super();
        dim1=x;
    }
    double area(){

        return (Math.PI*dim1*dim1);
    }
}
class rectangle extends shape{
    rectangle(double x,double y){
        super();
        dim1=x;
        dim2=y;
    }
    double area(){
        return (dim1*dim2);

    }
}
class Area_Calculate{
    final void display(circle c,rectangle r){

        System.out.println("Area of Circle:"+c.area());
        System.out.println("Area of Rectangle:"+r.area());
    }
    public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the radius of cicrcle");
	double ra = sc.nextDouble();
        circle c=new circle(ra);
	System.out.println("Enter the length and breadth");
	double l= sc.nextDouble();
	double b= sc.nextDouble();
        rectangle r=new rectangle(l,b);
        Area_Calculate ob=new Area_Calculate();
        ob.display(c,r);
    }
}
