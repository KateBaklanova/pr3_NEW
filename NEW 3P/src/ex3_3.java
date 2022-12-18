public class ex3_3 {

    public static void main(String[] args)
    {
       int[] a = new int[4];
       for (int i = 0; i<a.length; i++)
       {
            a[i] = (int) (10+Math.random()*90);
       }

        boolean flag = true;
        for (int i = 0; i<a.length; i++)
        {
            System.out.println(a[i]);
        }

        for (int i = 0; i<a.length-1; i++)
        {
            if (a[i]>a[i+1])
            {
                flag = false;
            }
        }


        if (flag)
        {
            System.out.println("Строго возрастащая роследовательность  ");
        }
        else
        {

            System.out.println("Не строго возрастащая роследовательность  ");
        }
    }
}
