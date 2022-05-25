package MomoryRepository;

import Modal.CheckIn;
import Repositories.IcheckInRepository;

import java.util.List;
import java.util.UUID;

public class MemoryCheckInRepository implements IcheckInRepository {

    private MemoryDataBase _database;

    public MemoryCheckInRepository() {
        _database = MemoryDataBase.getInstance(); //Se remplazo esto por el singleton, ya que no se puede instanciar una clase estatica
        //DIFERENTE AL INGE
    }

    @Override
    public CheckIn FindByKey(UUID uuid) {
        return _database.getCheckIns().stream().filter(x -> x.getKey().equals(uuid)).findFirst().orElse(null);
    }

    @Override
    public void Create(CheckIn checkIn) {
        _database.getCheckIns().add(checkIn);
    }

    @Override
    public List<CheckIn> GetAll() {
        return null;
    }

    @Override
    public CheckIn Delete(CheckIn checkIn) {
        return null;
    }

    @Override
    public CheckIn Update(CheckIn checkIn) {
        return null;
    }
}
