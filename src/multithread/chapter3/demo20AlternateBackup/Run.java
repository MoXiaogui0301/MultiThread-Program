package multithread.chapter3.demo20AlternateBackup;

/**
 * P177
 * 线程间通信实战案例：交替备份
 * 10个线程backupA将数据备份到数据库A，10个线程backupB将数据备份到数据库B
 * 两种线程交替执行，通过 volatile private boolean prevIsA 这个变量控制
 *
 * Result:
 * #####
 * #####
 * *****
 * *****
 * #####
 * #####
 * *****
 * *****
 * ...
 *
 */
public class Run {
    public static void main(String[] args) {
        DBTools dbTools = new DBTools();
        for (int i=0; i<20; i++)    {
            BackupB backupB = new BackupB(dbTools);
            backupB.start();
            BackupA backupA = new BackupA(dbTools);
            backupA.start();
        }
    }
}
