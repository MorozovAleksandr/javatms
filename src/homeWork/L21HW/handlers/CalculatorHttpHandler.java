package homeWork.L21HW.handlers;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import homeWork.L21HW.model.Operation;
import homeWork.L21HW.service.OperationService;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CalculatorHttpHandler implements HttpHandler {

    private final OperationService operationService = new OperationService();

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        String query = exchange.getRequestURI().getQuery();
        Map<String, String> stringStringMap = parseQuery(query);
        int num1 = Integer.parseInt(stringStringMap.get("num1"));
        int num2 = Integer.parseInt(stringStringMap.get("num2"));
        String type = stringStringMap.get("type");

        Operation operation = new Operation(num1, num2, type);

        Operation execute = operationService.execute(operation);

        String resultStr = "Result = %s".formatted(execute.getResult());

        exchange.sendResponseHeaders(200, resultStr.length());

        exchange.getResponseBody().write(resultStr.getBytes());

        exchange.close();
    }

    private Map<String, String> parseQuery(String query) {
        Map<String, String> result = new HashMap<>();
        String[] split = query.split("&");
        for (String s : split) {
            String[] keyValue = s.split("=");
            result.put(keyValue[0], keyValue[1]);
        }
        return result;
    }
}
