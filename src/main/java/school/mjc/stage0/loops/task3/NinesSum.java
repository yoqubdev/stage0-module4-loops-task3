package school.mjc.stage0.loops.task3;

public class   NinesSum {
    public static void main(String[] args) {
        NinesSum ninesSum=new NinesSum();
        ninesSum.calculateSum(-6);
    }
    public void calculateSum(int lengthOfLastNumber) {
        int n ,i ,t=9;
        int sum = 0;
        for (int j = 1; j <= lengthOfLastNumber; j++) {
            sum += t;
            t=t*10+9;
        }
        System.out.println(sum);
    }
}
