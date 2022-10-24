package com.ProyectoFinalClemenzi.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the comprobante database table.
 * 
 */
@Entity
@Table(name = "comprobante")
@NamedQuery(name = "Comprobante.findAll", query = "SELECT c FROM Comprobante c")
public class ComprobanteModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer comprobante_id;

    private Integer cantidad;

    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;

    private BigDecimal total;

    // bi-directional many-to-one association to Cliente
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private ClienteModel cliente;

    public ComprobanteModel() {
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public Integer getComprobante_id() {
        return comprobante_id;
    }

    public void setComprobante_id(Integer comprobante_id) {
        this.comprobante_id = comprobante_id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public ClienteModel getCliente() {
        return cliente;
    }

    public void setCliente(ClienteModel cliente) {
        this.cliente = cliente;
    }

}