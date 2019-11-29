class emp
{
int salary;
int emp_id;
static int emp_count=0;
String name;
String designation;
emp(String n)
{
name=n;
salary=10000;
designation="FRESHERS";
emp_count++;
emp_id=emp_id+emp_count;
}
emp(String n, int s, String d)
{
name=n;
salary=s;
designation=d;
emp_count++;
emp_id=emp_id+emp_count;
}
emp()
{
name="ABC";
salary=2000;
designation="TEMPORARY";
emp_count++;
emp_id=emp_id+emp_count;
}
void display()
{
System.out.println("NAME=\t "+name+"\tEMPLOYEE ID=\t "+emp_id+"\tSALARY\t "+salary+"\tDESIGNATION \t"+designation+"\temp_count\t"+emp_count);
}
void salinr()
{
salary=salary+3000;
}
void salinr(int r)
{
salary=salary+(salary*r)/100;
}
static int setid()
{
int emp_id=5;
return emp_id;
}
}
class Test
{
public static void main(String args[])
{
int max ;
String na;
emp.setid();
emp e1=new emp();
e1.salinr();
emp.setid();
e1.display();
emp e2=new emp("XYZ");
e2.salinr(8);
e2.display();
emp e3=new emp("PQR",20000,"EXECUTIVE");
e3.display();
e1.display();
max=e1.salary;
na=e1.name;
//e1.salinr(e1.sal);
//e2.salinr(e2.sal,3);
if(max<e2.salary&&max<e3.salary)
{
if(e2.salary>e3.salary)
{
max=e2.salary;
na=e2.name;
}
else
{
max=e3.salary;
na=e3.name;
}
}
System.out.println("max salary is "+ max + "name of the employee" + na);
}
}
