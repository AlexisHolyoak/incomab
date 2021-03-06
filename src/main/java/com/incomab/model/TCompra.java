package com.incomab.model;
// Generated 08/09/2017 01:42:44 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * TCompra generated by hbm2java
 */
public class TCompra  implements java.io.Serializable {


     private int codigoCompra;
     private TEntidad TEntidad;
     private Date fechaEmisionCompra;
     private Date fechaVencimientoCompra;
     private String tipoCompra;
     private String serieCompra;
     private int numeroCompra;
     private String denominacionCompra;
     private String monedaCompra;
     private BigDecimal tcCompra;
     private BigDecimal gravadaCompra;
     private BigDecimal exoneradaCompra;
     private BigDecimal inafectaCompra;
     private BigDecimal iscCompra;
     private BigDecimal igvCompra;
     private BigDecimal otrosCompra;
     private BigDecimal totalCompra;
     private boolean detraccionBoolCompra;
     private boolean importeDetraccionCompra;
     private String detalleCompra;
     private boolean anuladoBool;
     private Date fechaDocModificadoCompra;
     private String tipoDocModificadoCompra;
     private String serieDocModificadoCompra;
     private String numeroDocModificadoCompra;
     private String observacionesCompra;

    public TCompra() {
    }

	
    public TCompra(int codigoCompra, TEntidad TEntidad, Date fechaEmisionCompra, Date fechaVencimientoCompra, String serieCompra, int numeroCompra, String denominacionCompra, String monedaCompra, BigDecimal tcCompra, BigDecimal igvCompra, BigDecimal totalCompra, boolean detraccionBoolCompra, boolean importeDetraccionCompra, boolean anuladoBool) {
        this.codigoCompra = codigoCompra;
        this.TEntidad = TEntidad;
        this.fechaEmisionCompra = fechaEmisionCompra;
        this.fechaVencimientoCompra = fechaVencimientoCompra;
        this.serieCompra = serieCompra;
        this.numeroCompra = numeroCompra;
        this.denominacionCompra = denominacionCompra;
        this.monedaCompra = monedaCompra;
        this.tcCompra = tcCompra;
        this.igvCompra = igvCompra;
        this.totalCompra = totalCompra;
        this.detraccionBoolCompra = detraccionBoolCompra;
        this.importeDetraccionCompra = importeDetraccionCompra;
        this.anuladoBool = anuladoBool;
    }
    public TCompra(int codigoCompra, TEntidad TEntidad, Date fechaEmisionCompra, Date fechaVencimientoCompra, String tipoCompra, String serieCompra, int numeroCompra, String denominacionCompra, String monedaCompra, BigDecimal tcCompra, BigDecimal gravadaCompra, BigDecimal exoneradaCompra, BigDecimal inafectaCompra, BigDecimal iscCompra, BigDecimal igvCompra, BigDecimal otrosCompra, BigDecimal totalCompra, boolean detraccionBoolCompra, boolean importeDetraccionCompra, String detalleCompra, boolean anuladoBool, Date fechaDocModificadoCompra, String tipoDocModificadoCompra, String serieDocModificadoCompra, String numeroDocModificadoCompra, String observacionesCompra) {
       this.codigoCompra = codigoCompra;
       this.TEntidad = TEntidad;
       this.fechaEmisionCompra = fechaEmisionCompra;
       this.fechaVencimientoCompra = fechaVencimientoCompra;
       this.tipoCompra = tipoCompra;
       this.serieCompra = serieCompra;
       this.numeroCompra = numeroCompra;
       this.denominacionCompra = denominacionCompra;
       this.monedaCompra = monedaCompra;
       this.tcCompra = tcCompra;
       this.gravadaCompra = gravadaCompra;
       this.exoneradaCompra = exoneradaCompra;
       this.inafectaCompra = inafectaCompra;
       this.iscCompra = iscCompra;
       this.igvCompra = igvCompra;
       this.otrosCompra = otrosCompra;
       this.totalCompra = totalCompra;
       this.detraccionBoolCompra = detraccionBoolCompra;
       this.importeDetraccionCompra = importeDetraccionCompra;
       this.detalleCompra = detalleCompra;
       this.anuladoBool = anuladoBool;
       this.fechaDocModificadoCompra = fechaDocModificadoCompra;
       this.tipoDocModificadoCompra = tipoDocModificadoCompra;
       this.serieDocModificadoCompra = serieDocModificadoCompra;
       this.numeroDocModificadoCompra = numeroDocModificadoCompra;
       this.observacionesCompra = observacionesCompra;
    }
   
    public int getCodigoCompra() {
        return this.codigoCompra;
    }
    
    public void setCodigoCompra(int codigoCompra) {
        this.codigoCompra = codigoCompra;
    }
    public TEntidad getTEntidad() {
        return this.TEntidad;
    }
    
    public void setTEntidad(TEntidad TEntidad) {
        this.TEntidad = TEntidad;
    }
    public Date getFechaEmisionCompra() {
        return this.fechaEmisionCompra;
    }
    
    public void setFechaEmisionCompra(Date fechaEmisionCompra) {
        this.fechaEmisionCompra = fechaEmisionCompra;
    }
    public Date getFechaVencimientoCompra() {
        return this.fechaVencimientoCompra;
    }
    
    public void setFechaVencimientoCompra(Date fechaVencimientoCompra) {
        this.fechaVencimientoCompra = fechaVencimientoCompra;
    }
    public String getTipoCompra() {
        return this.tipoCompra;
    }
    
    public void setTipoCompra(String tipoCompra) {
        this.tipoCompra = tipoCompra;
    }
    public String getSerieCompra() {
        return this.serieCompra;
    }
    
    public void setSerieCompra(String serieCompra) {
        this.serieCompra = serieCompra;
    }
    public int getNumeroCompra() {
        return this.numeroCompra;
    }
    
    public void setNumeroCompra(int numeroCompra) {
        this.numeroCompra = numeroCompra;
    }
    public String getDenominacionCompra() {
        return this.denominacionCompra;
    }
    
    public void setDenominacionCompra(String denominacionCompra) {
        this.denominacionCompra = denominacionCompra;
    }
    public String getMonedaCompra() {
        return this.monedaCompra;
    }
    
    public void setMonedaCompra(String monedaCompra) {
        this.monedaCompra = monedaCompra;
    }
    public BigDecimal getTcCompra() {
        return this.tcCompra;
    }
    
    public void setTcCompra(BigDecimal tcCompra) {
        this.tcCompra = tcCompra;
    }
    public BigDecimal getGravadaCompra() {
        return this.gravadaCompra;
    }
    
    public void setGravadaCompra(BigDecimal gravadaCompra) {
        this.gravadaCompra = gravadaCompra;
    }
    public BigDecimal getExoneradaCompra() {
        return this.exoneradaCompra;
    }
    
    public void setExoneradaCompra(BigDecimal exoneradaCompra) {
        this.exoneradaCompra = exoneradaCompra;
    }
    public BigDecimal getInafectaCompra() {
        return this.inafectaCompra;
    }
    
    public void setInafectaCompra(BigDecimal inafectaCompra) {
        this.inafectaCompra = inafectaCompra;
    }
    public BigDecimal getIscCompra() {
        return this.iscCompra;
    }
    
    public void setIscCompra(BigDecimal iscCompra) {
        this.iscCompra = iscCompra;
    }
    public BigDecimal getIgvCompra() {
        return this.igvCompra;
    }
    
    public void setIgvCompra(BigDecimal igvCompra) {
        this.igvCompra = igvCompra;
    }
    public BigDecimal getOtrosCompra() {
        return this.otrosCompra;
    }
    
    public void setOtrosCompra(BigDecimal otrosCompra) {
        this.otrosCompra = otrosCompra;
    }
    public BigDecimal getTotalCompra() {
        return this.totalCompra;
    }
    
    public void setTotalCompra(BigDecimal totalCompra) {
        this.totalCompra = totalCompra;
    }
    public boolean isDetraccionBoolCompra() {
        return this.detraccionBoolCompra;
    }
    
    public void setDetraccionBoolCompra(boolean detraccionBoolCompra) {
        this.detraccionBoolCompra = detraccionBoolCompra;
    }
    public boolean isImporteDetraccionCompra() {
        return this.importeDetraccionCompra;
    }
    
    public void setImporteDetraccionCompra(boolean importeDetraccionCompra) {
        this.importeDetraccionCompra = importeDetraccionCompra;
    }
    public String getDetalleCompra() {
        return this.detalleCompra;
    }
    
    public void setDetalleCompra(String detalleCompra) {
        this.detalleCompra = detalleCompra;
    }
    public boolean isAnuladoBool() {
        return this.anuladoBool;
    }
    
    public void setAnuladoBool(boolean anuladoBool) {
        this.anuladoBool = anuladoBool;
    }
    public Date getFechaDocModificadoCompra() {
        return this.fechaDocModificadoCompra;
    }
    
    public void setFechaDocModificadoCompra(Date fechaDocModificadoCompra) {
        this.fechaDocModificadoCompra = fechaDocModificadoCompra;
    }
    public String getTipoDocModificadoCompra() {
        return this.tipoDocModificadoCompra;
    }
    
    public void setTipoDocModificadoCompra(String tipoDocModificadoCompra) {
        this.tipoDocModificadoCompra = tipoDocModificadoCompra;
    }
    public String getSerieDocModificadoCompra() {
        return this.serieDocModificadoCompra;
    }
    
    public void setSerieDocModificadoCompra(String serieDocModificadoCompra) {
        this.serieDocModificadoCompra = serieDocModificadoCompra;
    }
    public String getNumeroDocModificadoCompra() {
        return this.numeroDocModificadoCompra;
    }
    
    public void setNumeroDocModificadoCompra(String numeroDocModificadoCompra) {
        this.numeroDocModificadoCompra = numeroDocModificadoCompra;
    }
    public String getObservacionesCompra() {
        return this.observacionesCompra;
    }
    
    public void setObservacionesCompra(String observacionesCompra) {
        this.observacionesCompra = observacionesCompra;
    }




}


