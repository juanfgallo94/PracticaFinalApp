/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author user
 */
@Entity
@Table(name = "tblAutomoviles")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name="Auto.getAll",query="SELECT e FROM TblAutomoviles e"),
    @NamedQuery(name = "TblAutomoviles.findAll", query = "SELECT t FROM TblAutomoviles t"),
    @NamedQuery(name = "TblAutomoviles.findByPlaca", query = "SELECT t FROM TblAutomoviles t WHERE t.placa = :placa"),
    @NamedQuery(name = "TblAutomoviles.findByMarca", query = "SELECT t FROM TblAutomoviles t WHERE t.marca = :marca"),
    @NamedQuery(name = "TblAutomoviles.findByColor", query = "SELECT t FROM TblAutomoviles t WHERE t.color = :color"),
    @NamedQuery(name = "TblAutomoviles.findByModelo", query = "SELECT t FROM TblAutomoviles t WHERE t.modelo = :modelo"),
    @NamedQuery(name = "TblAutomoviles.findByTipo", query = "SELECT t FROM TblAutomoviles t WHERE t.tipo = :tipo"),
    @NamedQuery(name = "TblAutomoviles.findByDisponibilidad", query = "SELECT t FROM TblAutomoviles t WHERE t.disponibilidad = :disponibilidad"),
    @NamedQuery(name = "TblAutomoviles.findByPropietario", query = "SELECT t FROM TblAutomoviles t WHERE t.propietario = :propietario"),
    @NamedQuery(name = "TblAutomoviles.findByFechaRegistro", query = "SELECT t FROM TblAutomoviles t WHERE t.fechaRegistro = :fechaRegistro")})
public class TblAutomoviles implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "placa")
    private String placa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "marca")
    private String marca;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "color")
    private String color;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "modelo")
    private String modelo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "tipo")
    private String tipo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "disponibilidad")
    private String disponibilidad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "propietario")
    private String propietario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "fechaRegistro")
    private String fechaRegistro;

    public TblAutomoviles() {
    }

    public TblAutomoviles(String placa) {
        this.placa = placa;
    }

    public TblAutomoviles(String placa, String marca, String color, String modelo, String tipo, String disponibilidad, String propietario, String fechaRegistro) {
        this.placa = placa;
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
        this.tipo = tipo;
        this.disponibilidad = disponibilidad;
        this.propietario = propietario;
        this.fechaRegistro = fechaRegistro;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (placa != null ? placa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblAutomoviles)) {
            return false;
        }
        TblAutomoviles other = (TblAutomoviles) object;
        if ((this.placa == null && other.placa != null) || (this.placa != null && !this.placa.equals(other.placa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.TblAutomoviles[ placa=" + placa + " ]";
    }
    
}
