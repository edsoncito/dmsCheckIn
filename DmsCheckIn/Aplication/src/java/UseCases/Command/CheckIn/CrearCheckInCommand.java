package UseCases.Command.CheckIn;

import Dto.CheckInDto;
import Dto.BaggageDto;
import Modal.CheckIn;
import mediator.Request;

import java.util.List;

public class CrearCheckInCommand implements Request<CheckIn> {

    public CheckInDto checkInDto;
    public List<BaggageDto> Equipaje;

    public CrearCheckInCommand(CheckInDto obj) {
        checkInDto = obj;
        Equipaje = obj.getEquipajeDto();
    }

    public List<BaggageDto> getDetalle() {
        return Equipaje;
    }

    public void setDetalle(List<BaggageDto> detalle) {
        Equipaje = detalle;
    }

    public CheckInDto getCodigoSeguridad() {
        return this.checkInDto;
    }

    public void setCodigoSeguridad(CheckInDto CodigoSeguridad) {
        this.checkInDto = CodigoSeguridad;
    }


}
