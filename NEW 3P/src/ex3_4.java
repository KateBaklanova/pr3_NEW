import java.util.Scanner;

public class ex3_4 {

    public static void main(String[] args) {
        int N = 10;
        System.out.print("ведите размер массива меньше или равный 10 ");
        int n = 0;
        Scanner console = new Scanner(System.in);
        n = console.nextInt();
        while (n>10)
        {
            System.out.print("Неверное число ");
            n = console.nextInt();
        }
        int[] a = new int[n];
        int count = 0;
        for (int i =0; i<n; i++)
        {
            a[i] =(int)(Math.random()*(n+1));
            System.out.println(" "+a[i]);
            if (a[i]%2==0)
            {
                count++;
            }
        }
        int[] b = new int [count];
        count = -1;
        for (int i =0; i<n; i++)
        {
            if (a[i]%2==0)
            {
                count++;
                b[count] = a[i];
            }
        }

        for (int i =0; i<b.length; i++)
        {
            System.out.print(b[i]+" ");
        }
    }
}
