
import java.net.ServerSocket;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Server {

    public ServerSocket serverStart() {


        ExecutorService threadPool = Executors.newFixedThreadPool(64);
        for(int i = 0; i < 64; i++){
            Callable<Integer> myCallable[i] = new MyCallable();
            final Future<Integer> task[i] = threadPool.submit(myCallable[i]);
        }
    }
    }
