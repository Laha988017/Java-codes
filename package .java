package MyPackage;
public class pack{
    private int x;
    public pack(int x){
        this.x=x;
    }
	public void display(){
		System.out.println("Imported MyPackage x="+x);
	}
}
package MyPack2;
import MyPackage.*;
public class Pack2{
	public static void main(String args[]){
		pack p=new pack(10);
		p.display();
	}
}

package MyPackage;
public class A{
    public int x;
    private int y;
    protected int z;
    int w;
    public A(int a,int b,int c,int d){
        x=a;
        y=b;
        z=c;
        w=d;
    }
    public static void main(String args[]){
        A ob=new A(1,2,3,4);
        System.out.println(ob.x+" "+ob.y+" "+ob.z+" "+ob.w);
    }
}


package MyPackage;
class B{
    public static void main(String args[]){
        A ob=new A(1,2,3,4);
        System.out.println(ob.x+" "+ob.y+" "+ob.z+" "+ob.w);
    }
}




package MyPack2;
import MyPackage.*;
class C extends A{
    public C(){
        super(1,2,3,4);
    }
    public static void main(String args[]){
        A ob=new A(1,2,3,4);
        C ob1=new C();
        System.out.println(ob.x+" "+ob.y+" "+ob1.z+" "+ob.w);
    }
}


package MyPack2;
import MyPackage.*;
class D{
    public static void main(String args[]){
        A ob=new A(1,2,3,4);
        System.out.println(ob.x+" "+ob.y+" "+ob.z+" "+ob.w);
    }
}
