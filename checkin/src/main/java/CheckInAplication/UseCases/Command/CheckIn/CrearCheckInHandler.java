package CheckInAplication.UseCases.Command.CheckIn;

import ShareKernel.mediator.RequestHandler;

import java.util.UUID;

public class CrearCheckInHandler implements RequestHandler<CrearCheckInCommand , UUID> {

    @Override
    public UUID handle(CrearCheckInCommand request) {
        System.out.println("Entro al handler");
        return UUID.randomUUID();
    }

}
