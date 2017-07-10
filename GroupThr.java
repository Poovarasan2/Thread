class GroupThr implements Runnable
{
    public void run()
    {
        System.out.println(Thread.currentThread().getName());  
    }
    public static void main(String[] args) {
        GroupThr group = new GroupThr();  
        ThreadGroup tg=new ThreadGroup("Name");
        Thread gt1=new Thread(tg,group,"Hello");
        Thread gt2=new Thread(tg,group,"Hi");
        Thread gt3=new Thread(tg,group,"Namaskar");
        gt1.start();
        gt2.start();
        gt3.start();
        System.out.println(gt1);
        //tg.list();
    }
}