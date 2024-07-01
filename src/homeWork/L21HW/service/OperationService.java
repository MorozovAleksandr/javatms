package homeWork.L21HW.service;

import homeWork.L21HW.model.Operation;
import homeWork.L21HW.storage.FileOperationStorage;
import homeWork.L21HW.storage.OperationStorage;

import java.util.List;

public class OperationService {

    private final OperationStorage operationStorage = new FileOperationStorage();

    public Operation execute(Operation operation) {
        switch (operation.getType()) {
            case "sum":
                operation.setResult(operation.getNum1() + operation.getNum2());
                operationStorage.save(operation);
                return operation;
            case "sub":
                operation.setResult(operation.getNum1() - operation.getNum2());
                operationStorage.save(operation);
                return operation;
            case "mul":
                operation.setResult(operation.getNum1() * operation.getNum2());
                operationStorage.save(operation);
                return operation;
            case "div":
                operation.setResult(operation.getNum1() / operation.getNum2());
                operationStorage.save(operation);
                return operation;
        }
        throw new IllegalArgumentException("Operation type not supported");
    }

    public List<Operation> getAllOperations() {
        return operationStorage.findAll();
    }
}
