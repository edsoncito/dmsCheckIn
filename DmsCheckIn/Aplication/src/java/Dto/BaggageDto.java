package Dto;

public class BaggageDto {

    private Double PesoEquipaje;
    private String NumeroEtiqueta;
    private String Descripcion;

    public BaggageDto() {
    }

    public Double getPesoEquipaje() {
        return PesoEquipaje;
    }

    public void setPesoEquipaje(Double pesoEquipaje) {
        PesoEquipaje = pesoEquipaje;
    }

    public String getNumeroEtiquta() {
        return NumeroEtiqueta;
    }

    public void setNumeroEtiquta(String numeroEtiquta) {
        NumeroEtiqueta = numeroEtiquta;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
}
