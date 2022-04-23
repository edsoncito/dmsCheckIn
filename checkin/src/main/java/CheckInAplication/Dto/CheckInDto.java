package CheckInAplication.Dto;

import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
public class CheckInDto {
    
    private UUID Key;
    private String CodigoSeguridad;
    private Date HoraCheckIn;
    private Boolean EstadoPaciente;
    private String descripcion;
    private int Asiento;
    private String PesoEquipaje;
    private int NumeroEtiqueta;
    private String Vuelo;
    private String Abordaje;
    private String Desde;
    private String Hasta;
    private Date Despeje;
    private Date Aterrisaje;
    private String Puerta;

}
