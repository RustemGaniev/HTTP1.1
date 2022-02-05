
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Server {

    public ServerSocket serverStart() throws ExecutionException, InterruptedException {
        int poolsNumber = 64;
      
        final ExecutorService threadPool = Executors.newFixedThreadPool(poolsNumber);


            Callable<ServerSocket> myCallable = new MyCallable();
            Future<ServerSocket> task = threadPool.submit(myCallable);
            return task.get();

    }
}