package Lab9;

class thread extends Thread //Example of thread by extending the Threadclass
{
    public void run()
    {
        System.out.println("Thread is running...!");
        for(int i=0;i<5;i++)
        {
            System.out.println(i);
        }
    }
    public static void main(String[] args)
    {
        thread t1 = new thread();
        t1.start();  //thread 1 starts

        thread t2 = new thread();
        t2.start();   //thread 2 starts executing 
    }
}
