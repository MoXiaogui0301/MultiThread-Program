package multithread.chapter3.demo19PipeStreamByChar;

import java.io.PipedWriter;

public class ThreadWrite extends Thread {
    private WriteData write;
    private PipedWriter out;

    public ThreadWrite(WriteData write,PipedWriter out) {
        this.write = write;
        this.out = out;
    }

    @Override
    public void run() {
        write.writeMethod(out);
    }
}
