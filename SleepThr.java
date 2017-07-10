class First extends SleepThr
{
    public void run()
    {
        System.out.println("First Class");
    }
}
class Second extends SleepThr
{
    public void run()
    {
        System.out.println("Second Class");
    for(int i=0;i<5;i++)
    {
        System.out.println(i);
        if(i==3)
        {
           try{
                Thread.sleep(5000);
           }
           catch(Exception e)
           {
               System.out.println(e);
           }
        }
    }
    }
}
class Third extends SleepThr
{
    public void run()
    {
        System.out.println("Third Class");
    }
}
class SleepThr extends Thread
{
 public static void main(String[] args) {
     First f=new First();
     Second s=new Second();
     Third t=new Third();
     f.run(); 
     s.start();
     t.start();
}
}