package integer;

public class MissingInteger {
    //Function to find missing integer
    static int getMissingInteger(int[] a)
    {
        int i, sum;
        sum = (4 + 1) * (4 + 2) / 2;
        for (i = 0; i < 4; i++)
            sum = sum - a[i];
        return sum;
    }
    public static void main(String[] args)
    {
        int[] a = { 3, 5, 4, 1 };
        int miss = getMissingInteger(a);
        System.out.println(miss);
    }
}