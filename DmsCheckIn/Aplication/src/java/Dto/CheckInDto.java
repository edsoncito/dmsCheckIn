package Dto;

import Modal.Equipaje;

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

    private String Vuelo;
    private String Abordaje;
    private String Desde;
    private String Hasta;
    private Date Despeje;
    private Date Aterrisaje;
    private String Puerta;

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

    public String getVuelo() {
        return this.Vuelo;
    }

    public void setVuelo(String Vuelo) {
        this.Vuelo = Vuelo;
    }

    public String getAbordaje() {
        return this.Abordaje;
    }

    public void setAbordaje(String Abordaje) {
        this.Abordaje = Abordaje;
    }

    public String getDesde() {
        return this.Desde;
    }

    public void setDesde(String Desde) {
        this.Desde = Desde;
    }

    public String getHasta() {
        return this.Hasta;
    }

    public void setHasta(String Hasta) {
        this.Hasta = Hasta;
    }

    public Date getDespeje() {
        return this.Despeje;
    }

    public void setDespeje(Date Despeje) {
        this.Despeje = Despeje;
    }

    public Date getAterrisaje() {
        return this.Aterrisaje;
    }

    public void setAterrisaje(Date Aterrisaje) {
        this.Aterrisaje = Aterrisaje;
    }

    public String getPuerta() {
        return this.Puerta;
    }

    public void setPuerta(String Puerta) {
        this.Puerta = Puerta;
    }

}
