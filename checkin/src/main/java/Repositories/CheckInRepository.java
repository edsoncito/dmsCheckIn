package Repositories;

import modal.CheckIn;
import org.springframework.scheduling.config.Task;
import util.Repository;

import java.util.UUID;

public interface CheckInRepository extends Repository<CheckIn, UUID> {

    Task UpdateAsync(CheckIn obj);

}
