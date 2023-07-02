//Student-Result
import java.util.*;

class Student
{
    Scanner sc = new Scanner(System.in);
    int rollNo;
    void getRollNo()
    {
        System.out.print("Please enter the roll no: ");
        rollNo = sc.nextInt();
    }
    void putRollNo()
    {
        System.out.println("Roll no: " + rollNo);
    }
}

class Test extends Student
{
    double m1, m2;
    void getMarks()
    {
        System.out.print("Enter marks obtained in subject 1: ");
        m1 = sc.nextDouble();
        System.out.print("Enter marks obtained in subject 2: ");
        m2 = sc.nextDouble();
    }
    void putMarks()
    {
        System.out.println("Marks obtained in subject 1: " + m1);
        System.out.println("Marks obtained in subject 2: " + m2);
    }
}

interface Sports
{
    double sportWt = 6.0;
    public void putWt();
}

class Result extends Test implements Sports
{
    double total;
    public void putWt()
    {
        System.out.println("Sport weight: " + sportWt);
    }
    void display()
    {
        total = m1 + m2 + sportWt;
        System.out.println("The final score obtained is: " + total);
    }
}

class P10
{
    public static void main(String[] args)
    {
        Result R1 = new Result();
        R1.getRollNo();
        R1.putRollNo();
        R1.getMarks();
        R1.putMarks();
        R1.putWt();
        R1.display();
    }
}