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
@Table(name = "TblQueja")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name="Quejas.getAll",query="SELECT e FROM TblQueja e"),
    @NamedQuery(name = "TblQueja.findAll", query = "SELECT t FROM TblQueja t")
    , @NamedQuery(name = "TblQueja.findById", query = "SELECT t FROM TblQueja t WHERE t.id = :id")
    , @NamedQuery(name = "TblQueja.findByFechaQueja", query = "SELECT t FROM TblQueja t WHERE t.fechaQueja = :fechaQueja")
    , @NamedQuery(name = "TblQueja.findByTextoQueja", query = "SELECT t FROM TblQueja t WHERE t.textoQueja = :textoQueja")
    , @NamedQuery(name = "TblQueja.findByResponsable", query = "SELECT t FROM TblQueja t WHERE t.responsable = :responsable")})
public class TblQueja implements Serializable {

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
    @Column(name = "fechaQueja")
    private String fechaQueja;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "textoQueja")
    private String textoQueja;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "responsable")
    private String responsable;

    public TblQueja() {
    }

    public TblQueja(String id) {
        this.id = id;
    }

    public TblQueja(String id, String fechaQueja, String textoQueja, String responsable) {
        this.id = id;
        this.fechaQueja = fechaQueja;
        this.textoQueja = textoQueja;
        this.responsable = responsable;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFechaQueja() {
        return fechaQueja;
    }

    public void setFechaQueja(String fechaQueja) {
        this.fechaQueja = fechaQueja;
    }

    public String getTextoQueja() {
        return textoQueja;
    }

    public void setTextoQueja(String textoQueja) {
        this.textoQueja = textoQueja;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
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
        if (!(object instanceof TblQueja)) {
            return false;
        }
        TblQueja other = (TblQueja) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.TblQueja[ id=" + id + " ]";
    }
    
}
