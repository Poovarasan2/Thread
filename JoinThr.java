class Classname extends JoinThr
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
                Thread.sleep(500);
           }
           catch(Exception e)
           {
               System.out.println(e);
           }
        }
    }
    }
}
class JoinThr extends Thread
{
 public static void main(String[] args) throws Exception{
     Classname f=new Classname();
     Classname f1=new Classname();
     Classname f2=new Classname();
     f.start();
     f1.start();
     f1.join();
     f2.start();
}
}