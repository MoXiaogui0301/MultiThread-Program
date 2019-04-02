package multithread.chapter3.demo20AlternateBackup;

public class DBTools {
    volatile private boolean prevIsA = false;

    synchronized public void backupA()  {
        try {
            while (prevIsA == true)
                wait();
            for (int i=0; i<2; i++)
                System.out.println("#####");
            prevIsA = true;
            notifyAll();
        } catch (InterruptedException e)    {
            e.printStackTrace();
        }
    }

    synchronized public void backupB()  {
        try {
            while (prevIsA == false)
                wait();
            for (int i=0; i<2; i++)
                System.out.println("*****");
            prevIsA = false;
            notifyAll();
        } catch (InterruptedException e)    {
            e.printStackTrace();
        }
    }
}
