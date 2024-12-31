public class Swapper {
    public void swap_inplace(int a, int b)
    {
        System.out.println("before swapping : a :"+a+" b: "+b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("after swapping : a : "+a+" b : "+b);
    }
    public void swap(int a, int b)
    {
        System.out.println("before swapping : a :"+a+" b: "+b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("after swapping : a : "+a+" b : "+b);
    }
    public static void main(String args[])
    {
        int a = 5;
        int b = 3;
        Swapper swap_obj = new Swapper();
        swap_obj.swap_inplace(a,b);
        swap_obj.swap(a,b);
        for(int i = 0; i < 10; i++)
        {
            swap_obj.swap(i, 10-i);
            swap_obj.swap_inplace(i, 10-i);
        }


    }
    
}
