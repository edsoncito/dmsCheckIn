package CheckInAplication.UseCases.Command.CheckIn;

import CheckInDomain.modal.CheckIn;
import ShareKernel.mediator.Request;
import java.util.UUID;

public class CrearCheckInCommand implements Request<UUID> {

    public CheckIn checkIn;

    public CrearCheckInCommand(CheckIn checkIn) {
        this.checkIn = checkIn;
    }

    public CheckIn getCheckIn() {
        return checkIn;
    }

    private void setCheckIn(CheckIn checkIn) {
        this.checkIn = checkIn;
    }
}
