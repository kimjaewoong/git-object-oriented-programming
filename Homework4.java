import java.util.Scanner;

class Homework4 {

    static class NUM {
        int f;
        public NUM(int x) {this.f = x;}
        void abc() {System.out.println(f+"를 받았습니다.");
        }
    }
    static void gcd(NUM m, NUM n){
    if(m.f == 0) {
            System.out.printf("0을 입력하셨습니다.");}
    else if(m.f % n.f == 0) {
            System.out.printf("두 수의 최대공약수는 "+ n.f +"입니다");}
    else {
            m.f = m.f % n.f;
            int temp = m.f;
            m.f = n.f;
            n.f = temp;
            gcd(m, n);
        }
    }

    public static void main(String args[]){
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("두 수를 입력하세요 : ");
        a = sc.nextInt();
        NUM c = new NUM(a);
        b = sc.nextInt();
        NUM d = new NUM(b);
        gcd(c,d);
    }
}
