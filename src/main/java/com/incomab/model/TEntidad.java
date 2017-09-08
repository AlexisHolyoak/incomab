package com.incomab.model;
// Generated 08/09/2017 01:42:44 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * TEntidad generated by hbm2java
 */
public class TEntidad  implements java.io.Serializable {


     private String numeroEntidad;
     private String tipoDocEntidad;
     private String razonSocialEntidad;
     private String razonComercialEntidad;
     private String direccionFiscalEntidad;
     private String emailMainEntidad;
     private String emailAEntidad;
     private String emailBEntidad;
     private String movilEntidad;
     private String fijoEntidad;
     private String numCuentaDetraccionEntidad;
     private String detalleEntidad;
     private Set TComprobantes = new HashSet(0);
     private Set TCompras = new HashSet(0);

    public TEntidad() {
    }

	
    public TEntidad(String numeroEntidad, String tipoDocEntidad, String razonSocialEntidad, String razonComercialEntidad, String direccionFiscalEntidad) {
        this.numeroEntidad = numeroEntidad;
        this.tipoDocEntidad = tipoDocEntidad;
        this.razonSocialEntidad = razonSocialEntidad;
        this.razonComercialEntidad = razonComercialEntidad;
        this.direccionFiscalEntidad = direccionFiscalEntidad;
    }
    public TEntidad(String numeroEntidad, String tipoDocEntidad, String razonSocialEntidad, String razonComercialEntidad, String direccionFiscalEntidad, String emailMainEntidad, String emailAEntidad, String emailBEntidad, String movilEntidad, String fijoEntidad, String numCuentaDetraccionEntidad, String detalleEntidad, Set TComprobantes, Set TCompras) {
       this.numeroEntidad = numeroEntidad;
       this.tipoDocEntidad = tipoDocEntidad;
       this.razonSocialEntidad = razonSocialEntidad;
       this.razonComercialEntidad = razonComercialEntidad;
       this.direccionFiscalEntidad = direccionFiscalEntidad;
       this.emailMainEntidad = emailMainEntidad;
       this.emailAEntidad = emailAEntidad;
       this.emailBEntidad = emailBEntidad;
       this.movilEntidad = movilEntidad;
       this.fijoEntidad = fijoEntidad;
       this.numCuentaDetraccionEntidad = numCuentaDetraccionEntidad;
       this.detalleEntidad = detalleEntidad;
       this.TComprobantes = TComprobantes;
       this.TCompras = TCompras;
    }
   
    public String getNumeroEntidad() {
        return this.numeroEntidad;
    }
    
    public void setNumeroEntidad(String numeroEntidad) {
        this.numeroEntidad = numeroEntidad;
    }
    public String getTipoDocEntidad() {
        return this.tipoDocEntidad;
    }
    
    public void setTipoDocEntidad(String tipoDocEntidad) {
        this.tipoDocEntidad = tipoDocEntidad;
    }
    public String getRazonSocialEntidad() {
        return this.razonSocialEntidad;
    }
    
    public void setRazonSocialEntidad(String razonSocialEntidad) {
        this.razonSocialEntidad = razonSocialEntidad;
    }
    public String getRazonComercialEntidad() {
        return this.razonComercialEntidad;
    }
    
    public void setRazonComercialEntidad(String razonComercialEntidad) {
        this.razonComercialEntidad = razonComercialEntidad;
    }
    public String getDireccionFiscalEntidad() {
        return this.direccionFiscalEntidad;
    }
    
    public void setDireccionFiscalEntidad(String direccionFiscalEntidad) {
        this.direccionFiscalEntidad = direccionFiscalEntidad;
    }
    public String getEmailMainEntidad() {
        return this.emailMainEntidad;
    }
    
    public void setEmailMainEntidad(String emailMainEntidad) {
        this.emailMainEntidad = emailMainEntidad;
    }
    public String getEmailAEntidad() {
        return this.emailAEntidad;
    }
    
    public void setEmailAEntidad(String emailAEntidad) {
        this.emailAEntidad = emailAEntidad;
    }
    public String getEmailBEntidad() {
        return this.emailBEntidad;
    }
    
    public void setEmailBEntidad(String emailBEntidad) {
        this.emailBEntidad = emailBEntidad;
    }
    public String getMovilEntidad() {
        return this.movilEntidad;
    }
    
    public void setMovilEntidad(String movilEntidad) {
        this.movilEntidad = movilEntidad;
    }
    public String getFijoEntidad() {
        return this.fijoEntidad;
    }
    
    public void setFijoEntidad(String fijoEntidad) {
        this.fijoEntidad = fijoEntidad;
    }
    public String getNumCuentaDetraccionEntidad() {
        return this.numCuentaDetraccionEntidad;
    }
    
    public void setNumCuentaDetraccionEntidad(String numCuentaDetraccionEntidad) {
        this.numCuentaDetraccionEntidad = numCuentaDetraccionEntidad;
    }
    public String getDetalleEntidad() {
        return this.detalleEntidad;
    }
    
    public void setDetalleEntidad(String detalleEntidad) {
        this.detalleEntidad = detalleEntidad;
    }
    public Set getTComprobantes() {
        return this.TComprobantes;
    }
    
    public void setTComprobantes(Set TComprobantes) {
        this.TComprobantes = TComprobantes;
    }
    public Set getTCompras() {
        return this.TCompras;
    }
    
    public void setTCompras(Set TCompras) {
        this.TCompras = TCompras;
    }




}


