package co.edu.uniquindio.poo;

import java.util.Date;

public class Compras {
    private Cliente cliente;
    private Evento evento;
    private Localidad localidad;
    private Cupon cupon;
    private Factura factura;
    private Date fechaCompra;
    public Compras(Cliente cliente, Evento evento, Localidad localidad, Cupon cupon, Factura factura,
            Date fechaCompra) {
        this.cliente = cliente;
        this.evento = evento;
        this.localidad = localidad;
        this.cupon = cupon;
        this.factura = factura;
        this.fechaCompra = fechaCompra;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Evento getEvento() {
        return evento;
    }
    public void setEvento(Evento evento) {
        this.evento = evento;
    }
    public Localidad getLocalidad() {
        return localidad;
    }
    public void setLocalidad(Localidad localidad) {
        this.localidad = localidad;
    }
    public Cupon getCupon() {
        return cupon;
    }
    public void setCupon(Cupon cupon) {
        this.cupon = cupon;
    }
    public Factura getFactura() {
        return factura;
    }
    public void setFactura(Factura factura) {
        this.factura = factura;
    }
    public Date getFechaCompra() {
        return fechaCompra;
    }
    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }
    


}
