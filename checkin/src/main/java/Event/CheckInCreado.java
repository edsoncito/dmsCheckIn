package Event;

import modal.valueObject.CodigoSeguridad;
import ShareKernel.core.DomainEvent;
import java.time.LocalDateTime;
import java.util.UUID;

public class CheckInCreado extends DomainEvent {

    public UUID Key;
    public String CodigoSeguridad;

    public CheckInCreado(UUID key, CodigoSeguridad codigoSeguridad) {
        super(LocalDateTime.now());
        Key = key;
        CodigoSeguridad = codigoSeguridad.toString();
    }
}
