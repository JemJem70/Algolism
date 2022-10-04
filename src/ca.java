import java.util.Scanner;

public class ca {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int money = sc.nextInt();

        int m50000 = (int) (money / 50000);//5만원권
        int m10000 = (int) (money % 50000) / 10000;//1만원권
        int m5000 = (money % 10000) / 5000;//5천원권
        int m1000 = (money % 5000) / 1000;//1천원권
        int m500 = (money % 1000) / 500;//5백원권
        int m100 = (money % 500) / 100;//1백원권
        int m50 = (money % 100) / 50;//50원권
        int m10 = (money % 50) / 10;//백원권

        System.out.println("머니:"+money+" 입니다");
        System.out.println("5만원권: "+m50000+"만원권: "+m10000+", 오천원권: "+m5000+", 천원권: "+
                m1000+", 오백원권: "+m500+", 백원권: "+m100 + "50원권: "+m50+"10원권: "+m10);
    }




}
