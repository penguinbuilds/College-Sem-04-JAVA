//Educational Institute Database
import java.util.*;

class Staff
{
    Scanner sc = new Scanner(System.in);
    String codeName;
    void getCodeName()
    {
        System.out.print("Please enter the code name: ");
        codeName = sc.nextLine();
    }
    void putCodeName()
    {
        System.out.println("Code name: " + codeName);
    }
}

class Teacher extends Staff
{
    String subject;
    String publication;

    void getSubject()
    {
        System.out.print("Please enter the teacher's subject: ");
        subject = sc.nextLine();
    }
    void putSubject()
    {
        System.out.println("Teacher's subject: " + subject);
    }
    void getPublication()
    {
        System.out.print("Please enter the teacher's publication: ");
        publication = sc.nextLine();
    }
    void putPublication()
    {
        System.out.println("Teacher's publication: " + publication);
    }
}

class Typist extends Staff
{
    int wpm;

    void getWPM()
    {
        System.out.println("Please enter the typing speed of the typist in words per minute: ");
        wpm = sc.nextInt();
    }
    void putWPM()
    {
        System.out.println("Words typed per minute: " + wpm);
    }
}

class Officer extends Staff
{
    String grade;

    void getGrade()
    {
        System.out.println("Please enter the officer's grade: ");
        grade = sc.nextLine();
    }
    void putGrade()
    {
        System.out.println("Officer's grade: " + grade);
    }
}

class Regular extends Typist
{
    int salary;

    void getSalary()
    {
        System.out.println("Please enter the typist's salary: ");
        salary = sc.nextInt();
    }
    void putSalary()
    {
        System.out.println("Typist's salary: " + salary);
    }
}

class Casual extends Typist
{
    int dailyWage;

    void getDailyWage()
    {
        System.out.println("Please enter the typist's daily wage: ");
        dailyWage = sc.nextInt();
    }
    void putDailyWage()
    {
        System.out.println("Typist's daily wage: " + dailyWage);
    }
}

class P09
{
    public static void main(String[] args)
    {
        Teacher A = new Teacher();
        A.getCodeName();
        A.putCodeName();
        A.getSubject();
        A.putSubject();
        A.getPublication();
        A.putPublication();

        Regular B = new Regular();
        B.getCodeName();
        B.putCodeName();
        B.getWPM();
        B.putWPM();
        B.getSalary();
        B.putSalary();

        Casual C = new Casual();
        C.getCodeName();
        C.putCodeName();
        C.getWPM();
        C.putWPM();
        C.getDailyWage();
        C.putDailyWage();

        Officer D = new Officer();
        D.getCodeName();
        D.putCodeName();
        D.getGrade();
        D.putGrade();
    }
}
