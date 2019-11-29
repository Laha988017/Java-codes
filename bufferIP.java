import java.io.*;
import java.util.Scanner;
public class bufferIP{
public static void main(String args[])throws Exception{
FileReader fr=new FileReader("anick.txt");
BufferedReader br=new BufferedReader(fr);
int i;

while((i=br.read())!=-1){
System.out.print((char)i);
}
System.out.println();
br.close();
fr.close();
System.out.println("\nenter anything to write in the file");
String str;
Scanner sc=new Scanner(System.in);
str=sc.nextLine();

FileWriter w=new FileWriter("anick.txt");
BufferedWriter buffer=new BufferedWriter(w);
buffer.write(str);
buffer.close();

System.out.println("After writing");

FileReader ffr=new FileReader("anick.txt");
BufferedReader bbr=new BufferedReader(ffr);
while((i=bbr.read())!=-1){
System.out.print((char)i);
}
bbr.close();
ffr.close();
System.out.println();
}
}
