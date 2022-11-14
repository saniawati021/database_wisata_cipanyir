/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cipanyir;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author dell
 */
@Entity
@Table(name = "cipanyir_wisata", catalog = "db_cipanyir", schema = "")
@NamedQueries({
    @NamedQuery(name = "CipanyirWisata.findAll", query = "SELECT c FROM CipanyirWisata c")
    , @NamedQuery(name = "CipanyirWisata.findByIdTempatWisata", query = "SELECT c FROM CipanyirWisata c WHERE c.idTempatWisata = :idTempatWisata")
    , @NamedQuery(name = "CipanyirWisata.findByNamaTempatWisata", query = "SELECT c FROM CipanyirWisata c WHERE c.namaTempatWisata = :namaTempatWisata")
    , @NamedQuery(name = "CipanyirWisata.findByAlamat", query = "SELECT c FROM CipanyirWisata c WHERE c.alamat = :alamat")
    , @NamedQuery(name = "CipanyirWisata.findByNoTelepon", query = "SELECT c FROM CipanyirWisata c WHERE c.noTelepon = :noTelepon")
    , @NamedQuery(name = "CipanyirWisata.findByKeterangan", query = "SELECT c FROM CipanyirWisata c WHERE c.keterangan = :keterangan")})
public class CipanyirWisata implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_tempat_wisata")
    private Integer idTempatWisata;
    @Basic(optional = false)
    @Column(name = "nama_tempat_wisata")
    private String namaTempatWisata;
    @Basic(optional = false)
    @Column(name = "alamat")
    private String alamat;
    @Basic(optional = false)
    @Column(name = "no_telepon")
    private String noTelepon;
    @Basic(optional = false)
    @Column(name = "keterangan")
    private String keterangan;

    public CipanyirWisata() {
    }

    public CipanyirWisata(Integer idTempatWisata) {
        this.idTempatWisata = idTempatWisata;
    }

    public CipanyirWisata(Integer idTempatWisata, String namaTempatWisata, String alamat, String noTelepon, String keterangan) {
        this.idTempatWisata = idTempatWisata;
        this.namaTempatWisata = namaTempatWisata;
        this.alamat = alamat;
        this.noTelepon = noTelepon;
        this.keterangan = keterangan;
    }

    public Integer getIdTempatWisata() {
        return idTempatWisata;
    }

    public void setIdTempatWisata(Integer idTempatWisata) {
        Integer oldIdTempatWisata = this.idTempatWisata;
        this.idTempatWisata = idTempatWisata;
        changeSupport.firePropertyChange("idTempatWisata", oldIdTempatWisata, idTempatWisata);
    }

    public String getNamaTempatWisata() {
        return namaTempatWisata;
    }

    public void setNamaTempatWisata(String namaTempatWisata) {
        String oldNamaTempatWisata = this.namaTempatWisata;
        this.namaTempatWisata = namaTempatWisata;
        changeSupport.firePropertyChange("namaTempatWisata", oldNamaTempatWisata, namaTempatWisata);
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        String oldAlamat = this.alamat;
        this.alamat = alamat;
        changeSupport.firePropertyChange("alamat", oldAlamat, alamat);
    }

    public String getNoTelepon() {
        return noTelepon;
    }

    public void setNoTelepon(String noTelepon) {
        String oldNoTelepon = this.noTelepon;
        this.noTelepon = noTelepon;
        changeSupport.firePropertyChange("noTelepon", oldNoTelepon, noTelepon);
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        String oldKeterangan = this.keterangan;
        this.keterangan = keterangan;
        changeSupport.firePropertyChange("keterangan", oldKeterangan, keterangan);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTempatWisata != null ? idTempatWisata.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CipanyirWisata)) {
            return false;
        }
        CipanyirWisata other = (CipanyirWisata) object;
        if ((this.idTempatWisata == null && other.idTempatWisata != null) || (this.idTempatWisata != null && !this.idTempatWisata.equals(other.idTempatWisata))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cipanyir.CipanyirWisata[ idTempatWisata=" + idTempatWisata + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
