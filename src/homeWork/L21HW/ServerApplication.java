package homeWork.L21HW;

import com.sun.net.httpserver.HttpServer;
import homeWork.L21HW.handlers.CalculatorHttpHandler;

import java.io.IOException;
import java.net.InetSocketAddress;

public class ServerApplication implements Application {
    public void run() throws IOException {
        HttpServer httpServer = HttpServer.create(new InetSocketAddress(8080), 0);
        httpServer.createContext("/calc", new CalculatorHttpHandler());
        httpServer.start();
    }
}
