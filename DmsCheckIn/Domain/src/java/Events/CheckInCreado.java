package Events;

import java.time.LocalDateTime;
import java.util.UUID;

import Modal.valueObject.CodigoSeguridad;
import core.DomainEvent;

public class CheckInCreado extends DomainEvent {

    public UUID KeyCheckIn;
    public String CodigoSeguridad;

    public CheckInCreado(UUID key, String codigoSeguridad) {
        super(LocalDateTime.now());
        KeyCheckIn = key;
        CodigoSeguridad = codigoSeguridad.toString();
    }
}
