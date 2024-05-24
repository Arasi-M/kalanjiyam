package arasi.learn;

public class fibonacci {

    public void generateFibSeries()
    {
        int[] output = new int[10];
        output[0] = 0;
        output[1] = 1;
        for(int i = 2; i < output.length; i++)
        {
            output[i] = output[i-1] + output[i-2];
        }
        for(int x : output)
            System.out.print("\t"+x);
    }
}
