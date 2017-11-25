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
 * @author dalejandro.higuita
 */
@Entity
@Table(name = "TblDevoluciones")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name="Devoluciones.getAll",query="SELECT e FROM TblDevoluciones e"),
    @NamedQuery(name = "TblDevoluciones.findAll", query = "SELECT t FROM TblDevoluciones t")
    , @NamedQuery(name = "TblDevoluciones.findById", query = "SELECT t FROM TblDevoluciones t WHERE t.id = :id")
    , @NamedQuery(name = "TblDevoluciones.findByPlaca", query = "SELECT t FROM TblDevoluciones t WHERE t.placa = :placa")
    , @NamedQuery(name = "TblDevoluciones.findByFecha", query = "SELECT t FROM TblDevoluciones t WHERE t.fecha = :fecha")
    , @NamedQuery(name = "TblDevoluciones.findByMotivo", query = "SELECT t FROM TblDevoluciones t WHERE t.motivo = :motivo")})
public class TblDevoluciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "Id")
    private String id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "Placa")
    private String placa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "Fecha")
    private String fecha;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "Motivo")
    private String motivo;

    public TblDevoluciones() {
    }

    public TblDevoluciones(String id) {
        this.id = id;
    }

    public TblDevoluciones(String id, String placa, String fecha, String motivo) {
        this.id = id;
        this.placa = placa;
        this.fecha = fecha;
        this.motivo = motivo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblDevoluciones)) {
            return false;
        }
        TblDevoluciones other = (TblDevoluciones) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.TblDevoluciones[ id=" + id + " ]";
    }
    
}
