import java.util.Scanner;

class Student{
    int num;
    String name;
    String major;
    int phone;


}

public class Homework2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Student stu1 = new Student();
        Student stu2 = new Student();
        Student stu3 = new Student();
        System.out.println("학생의 학번, 이름 전공 전화번호를 입력하세요");
        stu1.num = sc.nextInt();
        stu1.name = sc.next();
        stu1.major = sc.next();
        stu1.phone = sc.nextInt();
        int fph1 = stu1.phone%100000000;
        fph1 /= 10000;
        int rph1 = stu1.phone%10000;
        System.out.println("학생의 학번, 이름 전공 전화번호를 입력하세요");
        stu2.num = sc.nextInt();
        stu2.name = sc.next();
        stu2.major = sc.next();
        stu2.phone = sc.nextInt();
        int fph2 = stu2.phone%100000000;
        fph2 /= 10000;
        int rph2 = stu2.phone%10000;
        System.out.println("학생의 학번, 이름 전공 전화번호를 입력하세요");
        stu3.num = sc.nextInt();
        stu3.name = sc.next();
        stu3.major = sc.next();
        stu3.phone = sc.nextInt();
        int fph3 = stu3.phone%100000000;
        fph3 /= 10000;
        int rph3 = stu3.phone%10000;
        System.out.println("첫번째 학생 : "+stu1.num+" "+stu1.name+" "+stu1.major+" "+"010-"+fph1+"-"+rph1);
        System.out.println("두번째 학생 : "+stu2.num+" "+stu2.name+" "+stu2.major+" "+"010-"+fph2+"-"+rph2);
        System.out.println("세번째 학생 : "+stu3.num+" "+stu3.name+" "+stu3.major+" "+"010-"+fph3+"-"+rph3);

    }
}
