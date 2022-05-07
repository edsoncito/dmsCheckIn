package EF.Repository;

import java.util.UUID;
import Modal.CheckIn;
import Repositories.IcheckInRepository;

public class CheckInRepository implements IcheckInRepository {

    @Override
    public CheckIn FindByKey(UUID uuid) {
        return null;
    }

    @Override
    public void Create(CheckIn checkIn) {
    }

}