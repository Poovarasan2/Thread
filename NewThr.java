class NewThr implements Runnable
{
    public void run()
    {
        System.out.println("Hiiii");
    }
    public static void main(String[] args) {
        NewThr t=new NewThr();
        Thread t1= new Thread(t);
        //t.runn();
        t1.start();       
    }
}