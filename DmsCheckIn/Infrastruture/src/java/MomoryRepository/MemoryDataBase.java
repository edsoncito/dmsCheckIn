package MomoryRepository;

import Modal.CheckIn;
import java.util.ArrayList;
import java.util.List;

public class MemoryDataBase {

    private static MemoryDataBase _instace;

    public static MemoryDataBase getInstance() {
        if (_instace == null) {
            _instace = new MemoryDataBase();
        }
        return _instace;
    }

    private List<CheckIn> checkIns;

    public List<CheckIn> getCheckIns() {
        return checkIns;
    }

    public MemoryDataBase() {
        checkIns = new ArrayList<>();
    }
}
