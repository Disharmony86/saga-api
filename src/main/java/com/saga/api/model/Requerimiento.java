package com.saga.api.model;

public class Requerimiento {
    //Atributos

    private int idReq;
    private String descripcion;
    private String empleado;
    private String autorizador;
    private String estado;

    // Constructor

    public Requerimiento(int idReq, String descripcion, String empleado, String autorizador, String estado) {
        this.idReq = idReq;
        this.descripcion = descripcion;
        this.empleado = empleado;
        this.autorizador = autorizador;
        this.estado = estado;
    }

    public int getIdReq() {
        return idReq;
    }

    public void setIdReq(int idReq) {
        this.idReq = idReq;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    public String getAutorizador() {
        return autorizador;
    }

    public void setAutorizador(String autorizador) {
        this.autorizador = autorizador;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }


}
