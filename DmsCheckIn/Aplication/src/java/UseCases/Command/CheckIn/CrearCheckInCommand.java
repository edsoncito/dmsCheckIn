package UseCases.Command.CheckIn;

import Dto.CheckInDto;
import Dto.EquipajeDto;
import Modal.CheckIn;
import SharedKernel.mediator.Request;

import java.util.List;
import java.util.UUID;

public class CrearCheckInCommand implements Request<CheckIn> {

    public CheckInDto checkInDto;
    public List<EquipajeDto> Equipaje;

    public CrearCheckInCommand(CheckInDto obj) {
        checkInDto = obj;
        Equipaje = obj.getEquipajeDto();
    }

    public List<EquipajeDto> getDetalle() {
        return Equipaje;
    }

    public void setDetalle(List<EquipajeDto> detalle) {
        Equipaje = detalle;
    }

    public CheckInDto getCodigoSeguridad() {
        return this.checkInDto;
    }

    public void setCodigoSeguridad(CheckInDto CodigoSeguridad) {
        this.checkInDto = CodigoSeguridad;
    }


}
