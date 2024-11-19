package com.web.taller1.dto;

import java.sql.Date;

import com.web.taller1.model.Contrato;

import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContratoDTO {
    @Id
    private Long id;
    private String identificador;
    private Double valor;
    private String nombreContratante;
    private String documentoContratante;
    private String nombreContratantista;
    private String documentoContratantista;
    private java.sql.Date fechaInicial;
    private java.sql.Date fechaFinal;

    public ContratoDTO() {}

    public ContratoDTO(Contrato contrato) {
        this.id = contrato.getId();
        this.identificador = contrato.getIdentificador();
        this.valor = contrato.getValor();
        this.nombreContratante = contrato.getNombreContratante();
        this.documentoContratante = contrato.getDocumentoContratante();
        this.nombreContratantista = contrato.getNombreContratantista();
        this.documentoContratantista = contrato.getDocumentoContratantista();
        this.fechaInicial = contrato.getFechaInicial();
        this.fechaFinal = contrato.getFechaFinal();
    }

        // Getters and Setters
        public Long getId() {
            return id;
        }
    
        public void setId(Long id) {
            this.id = id;
        }
    
        public String getIdentificador() {
            return identificador;
        }
    
        public void setIdentificador(String identificador) {
            this.identificador = identificador;
        }
    
        public Double getValor() {
            return valor;
        }
    
        public void setValor(Double valor) {
            this.valor = valor;
        }
    
        public String getNombreContratante() {
            return nombreContratante;
        }
    
        public void setNombreContratante(String nombreContratante) {
            this.nombreContratante = nombreContratante;
        }
    
        public String getDocumentoContratante() {
            return documentoContratante;
        }
    
        public void setDocumentoContratante(String documentoContratante) {
            this.documentoContratante = documentoContratante;
        }
    
        public String getNombreContratantista() {
            return nombreContratantista;
        }
    
        public void setNombreContratantista(String nombreContratantista) {
            this.nombreContratantista = nombreContratantista;
        }
    
        public String getDocumentoContratantista() {
            return documentoContratantista;
        }
    
        public void setDocumentoContratantista(String documentoContratantista) {
            this.documentoContratantista = documentoContratantista;
        }
    
        public Date getFechaInicial() {
            return fechaInicial;
        }
    
        public void setFechaInicial(Date fechaInicial) {
            this.fechaInicial = fechaInicial;
        }
    
        public Date getFechaFinal() {
            return fechaFinal;
        }
    
        public void setFechaFinal(Date fechaFinal) {
            this.fechaFinal = fechaFinal;
        }
}
