package school.mjc.stage0.loops.task3;


public class DigitsSum {

    public void printDigitsSum(int t){
            int remainder;
            int total = 0;
        for (int i = 0; t > 0 ; t = t/10) {
            remainder = t % 10;
            total += remainder;
        }
        System.out.println(total);
    }
}
