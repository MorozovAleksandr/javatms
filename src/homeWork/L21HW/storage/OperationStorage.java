package homeWork.L21HW.storage;

import homeWork.L21HW.model.Operation;

import java.util.List;

public interface OperationStorage {
    void save(Operation operation);

    List<Operation> findAll();
}
