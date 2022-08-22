package school.mjc.stage0.loops.task3;

public class FibonacciSeries {

    public static void main(String[] args) {
        FibonacciSeries fibonacciSeries=new FibonacciSeries();
        fibonacciSeries.printFibonacci(5);
    }

    public void printFibonacci(int lastFibonacci) {


        int i = 0 , j = 1 , next;

        for(int c=0;c<lastFibonacci;c++)
        {
            if(c<=1)
                next=c;
            else
            {
                next=i+j;
                i=j;
                j=next;
            }
            System.out.println(next);
        }
    }

}
