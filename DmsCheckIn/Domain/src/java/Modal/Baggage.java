package Modal;

import core.Entity;

import java.util.UUID;

public class Baggage extends Entity<UUID> {

    private Double PesoEquipaje;
    private String NumeroEtiqueta;
    private String Descripcion;

    public Baggage() {
    }

    public Baggage(Double pesoEquipaje, String numeroEtiquta, String descripcion) {
        key = UUID.randomUUID();
        PesoEquipaje = pesoEquipaje;
        NumeroEtiqueta = numeroEtiquta;
        Descripcion = descripcion;
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
