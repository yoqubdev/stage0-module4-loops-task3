package school.mjc.stage0.loops.task3;

import java.math.BigInteger;

public class GreatestCommonDivisor {

    public static void main(String[] args) {
        GreatestCommonDivisor greatestCommonDivisor=new GreatestCommonDivisor();
        greatestCommonDivisor.printGCD(30,30);
    }

    public void printGCD(int first, int second) {

        int gcd = 0;

        for (int i = 1; i <= first && i <= second ; i++) {
            if (first % i == 0 && second % i == 0){
                gcd = i;
            }
        }
        System.out.println(gcd);

    }
}
