package Dto;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public class CheckInDto {
    
    private UUID Key;
    private String CodigoSeguridad;
    private Date HoraCheckIn;
    private Boolean EstadoPaciente;
    private String Descripcion;
    private int Asiento;
    private List<EquipajeDto> EquipajeDto;

    public CheckInDto() {
    }

    public CheckInDto(List<EquipajeDto> equipajeDto) {
        this.EquipajeDto = equipajeDto;
    }

    public List<EquipajeDto> getEquipajeDto() {
        return EquipajeDto;
    }

    public void setEquipajeDto(List<EquipajeDto> equipajeDto) {
        EquipajeDto = equipajeDto;
    }

    public UUID getKey() {
        return this.Key;
    }

    public void setKey(UUID Key) {
        this.Key = Key;
    }

    public String getCodigoSeguridad() {
        return this.CodigoSeguridad;
    }

    public void setCodigoSeguridad(String CodigoSeguridad) {
        this.CodigoSeguridad = CodigoSeguridad;
    }

    public Date getHoraCheckIn() {
        return this.HoraCheckIn;
    }

    public void setHoraCheckIn(Date HoraCheckIn) {
        this.HoraCheckIn = HoraCheckIn;
    }

    public Boolean isEstadoPaciente() {
        return this.EstadoPaciente;
    }

    public Boolean getEstadoPaciente() {
        return this.EstadoPaciente;
    }

    public void setEstadoPaciente(Boolean EstadoPaciente) {
        this.EstadoPaciente = EstadoPaciente;
    }

    public String getDescripcion() {
        return this.Descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.Descripcion = descripcion;
    }

    public int getAsiento() {
        return this.Asiento;
    }

    public void setAsiento(int Asiento) {
        this.Asiento = Asiento;
    }

}
