package com.incomab.model;
// Generated 08/09/2017 01:42:44 PM by Hibernate Tools 4.3.1



/**
 * TTipoUnidad generated by hbm2java
 */
public class TTipoUnidad  implements java.io.Serializable {


     private String codigoTipo;
     private String nombreTipo;
     private TUnidadMedida TUnidadMedida;

    public TTipoUnidad() {
    }

	
    public TTipoUnidad(String codigoTipo, String nombreTipo) {
        this.codigoTipo = codigoTipo;
        this.nombreTipo = nombreTipo;
    }
    public TTipoUnidad(String codigoTipo, String nombreTipo, TUnidadMedida TUnidadMedida) {
       this.codigoTipo = codigoTipo;
       this.nombreTipo = nombreTipo;
       this.TUnidadMedida = TUnidadMedida;
    }
   
    public String getCodigoTipo() {
        return this.codigoTipo;
    }
    
    public void setCodigoTipo(String codigoTipo) {
        this.codigoTipo = codigoTipo;
    }
    public String getNombreTipo() {
        return this.nombreTipo;
    }
    
    public void setNombreTipo(String nombreTipo) {
        this.nombreTipo = nombreTipo;
    }
    public TUnidadMedida getTUnidadMedida() {
        return this.TUnidadMedida;
    }
    
    public void setTUnidadMedida(TUnidadMedida TUnidadMedida) {
        this.TUnidadMedida = TUnidadMedida;
    }




}


