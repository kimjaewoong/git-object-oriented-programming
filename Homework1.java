import java.util.Scanner;

public class Homework1 {
    public static void main(String[] arfs) {
        int sum = 0;
        System.out.println("첫번째 정수를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        sum += s1;
        System.out.println("현재까지 입력된 숫자의 합은 " + sum);
        System.out.println("두번째 정수를 입력하세요 : ");
        int s2 = sc.nextInt();
        sum += s2;
        System.out.println("현재까지 입력된 숫자의 합은 " + sum);
        System.out.println("세번째 정수를 입력하세요 : ");
        int s3 = sc.nextInt();
        sum += s3;
        System.out.println("현재까지 입력된 숫자의 합은 " + sum);
        System.out.println("네번째 정수를 입력하세요 : ");
        int s4 = sc.nextInt();
        sum += s4;
        System.out.println("현재까지 입력된 숫자의 합은 " + sum);
        System.out.println("다섯번째 정수를 입력하세요 : ");
        int s5 = sc.nextInt();
        sum += s5;
        System.out.println("현재까지 입력된 숫자의 합은 " + sum);
    }
}
