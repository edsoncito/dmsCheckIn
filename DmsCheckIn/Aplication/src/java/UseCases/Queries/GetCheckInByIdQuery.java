package UseCases.Queries;

import java.util.UUID;
import Dto.CheckInDto;
import mediator.Request;

public class GetCheckInByIdQuery implements Request<CheckInDto> {

    public UUID Key;
    public GetCheckInByIdQuery(UUID key)
    {
        Key = key;
    }

}
