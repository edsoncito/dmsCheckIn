package Modal;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import Events.CheckInCreado;
import SharedKernel.core.AggregateRoot;

public class CheckIn extends AggregateRoot<UUID> {

    private String CodigoSeguridad;
    private Date HoraCheckIn;
    private Boolean EstadoPaciente;
    private String Descripcion;
    private List<Equipaje> equipaje;
    private int Asiento;

    private String Vuelo;
    private String Abordaje;
    private String Desde;
    private String Hasta;
    private Date Despeje;
    private Date Aterrisaje;
    private String Puerta;

    public CheckIn() {
    }

    public CheckIn(String codigoSeguridad,Boolean estadoPaciente,String descripcion, int asiento) {
        key = UUID.randomUUID();
        CodigoSeguridad = codigoSeguridad;
        EstadoPaciente = estadoPaciente;
        Descripcion = descripcion;
        Asiento = asiento;
        equipaje = new ArrayList<Equipaje>();
    }

    public void AgregarItem(Double PesoEquipaje, String NumeroEtiqueta, String descripcion) {

        //var detalleEquipaje = Equipaje.First(x => x.ProductoId == productoId);
        //Equipaje equipaje;
//        if (equipaje is null)
//        {
//            detallePedido = new DetallePedido(productoId, instrucciones, cantidad, precio);
//            _detalle.Add(detallePedido);
//        }
//            else
//        {
//            detallePedido.ModificarPedido(cantidad, precio);
//        }

        Equipaje equipajes = new Equipaje(PesoEquipaje, NumeroEtiqueta, descripcion);
        equipaje.add(equipajes);
        //AddDomainEvent(new ItemPedidoAgregado(productoId, precio, cantidad));
    }

    public void checkInCompletado() {
        var event = new CheckInCreado(key, CodigoSeguridad);
        addDomainEvent(event);
    }

    public List<Equipaje> getEquipaje() {
        return equipaje;
    }

    public void setEquipaje(List<Equipaje> equipaje1) {
        equipaje = equipaje1;
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

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
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
