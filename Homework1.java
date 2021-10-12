import java.util.Scanner;

public class Homework1 {
    public static void main(String[] arfs) {
        int sum = 0;
        System.out.printf("첫번째 정수를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        sum += s1;
        System.out.println("현재까지 입력된 숫자의 합은 " + sum);
        System.out.printf("두번째 정수를 입력하세요 : ");
        int s2 = sc.nextInt();
        sum += s2;
        System.out.println("현재까지 입력된 숫자의 합은 " + sum);
        System.out.printf("세번째 정수를 입력하세요 : ");
        int s3 = sc.nextInt();
        sum += s3;
        System.out.println("현재까지 입력된 숫자의 합은 " + sum);
        System.out.printf("네번째 정수를 입력하세요 : ");
        int s4 = sc.nextInt();
        sum += s4;
        System.out.println("현재까지 입력된 숫자의 합은 " + sum);
        System.out.printf("다섯번째 정수를 입력하세요 : ");
        int s5 = sc.nextInt();
        sum += s5;
        System.out.println("현재까지 입력된 숫자의 합은 " + sum);
    }
}
