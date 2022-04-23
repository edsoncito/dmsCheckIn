package CheckInAplication.UseCases.Queries;

import CheckInAplication.Dto.CheckInDto;
import ShareKernel.mediator.Request;

import java.util.UUID;

public class GetCheckInByIdQuery implements Request<CheckInDto> {

    public UUID Key;

    public UUID getKey() {
        return Key;
    }

    public void setKey(UUID key) {
        Key = key;
    }

    public GetCheckInByIdQuery(UUID key)
    {
        Key = key;
    }

    public GetCheckInByIdQuery() { }
}
