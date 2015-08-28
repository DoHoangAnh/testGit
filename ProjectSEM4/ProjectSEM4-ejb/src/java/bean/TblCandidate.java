/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

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
 * @author anhdh_a05370
 */
@Entity
@Table(name = "tblCandidate")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblCandidate.findAll", query = "SELECT t FROM TblCandidate t"),
    @NamedQuery(name = "TblCandidate.findByName", query = "SELECT t FROM TblCandidate t WHERE t.name = :name"),
    @NamedQuery(name = "TblCandidate.findByAddress", query = "SELECT t FROM TblCandidate t WHERE t.address = :address"),
    @NamedQuery(name = "TblCandidate.findByDate", query = "SELECT t FROM TblCandidate t WHERE t.date = :date")})
public class TblCandidate implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "_name")
    private String name;
    @Size(max = 100)
    @Column(name = "_address")
    private String address;
    @Size(max = 100)
    @Column(name = "_date")
    private String date;

    public TblCandidate() {
    }

    public TblCandidate(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (name != null ? name.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblCandidate)) {
            return false;
        }
        TblCandidate other = (TblCandidate) object;
        if ((this.name == null && other.name != null) || (this.name != null && !this.name.equals(other.name))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.TblCandidate[ name=" + name + " ]";
    }
    
}
