import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1,max,min;
        System.out.print("몇 개의 수를 입력할 예정인가요?");
        n1 = sc.nextInt();
        int arr[] = new int[n1];
        System.out.print("수를 입력하세요 : ");
        for(int i=0;i<n1;i++){
            arr[i] = sc.nextInt();
        }
        max = arr[0];
        min = arr[0];
        for(int i=0;i<n1;i++){
            if(arr[i]>max) max = arr[i];
        }
        System.out.println("최대값 : "+max);
        for(int i=0;i<n1;i++){
            if(arr[i]<min) min = arr[i];
        }
        System.out.println("최소값 : "+min);
    }
}
