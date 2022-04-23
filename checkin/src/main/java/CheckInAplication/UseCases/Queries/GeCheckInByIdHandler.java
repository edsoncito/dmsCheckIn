package CheckInAplication.UseCases.Queries;

import CheckInAplication.Dto.CheckInDto;
import ShareKernel.mediator.RequestHandler;

public class GeCheckInByIdHandler implements RequestHandler<GetCheckInByIdQuery, CheckInDto> {

    public GeCheckInByIdHandler() {
    }

    @Override
    public CheckInDto handle(GetCheckInByIdQuery request) {
        System.out.println("Entro al handler");
        return new CheckInDto();
    }
}
