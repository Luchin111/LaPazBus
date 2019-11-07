package domain;

import javax.persistence.*;

@Entity
@Table(name = "ruta", schema = "dbtest_lpbus", catalog = "")
public class RutaEntity {
    private int idRuta;
    private Integer status;
    private String textUser;
    private String textHost;
    private int idOrigen;
    private int idDllegada;
    private ParadaEntity paradaByIdOrigen;
    private ParadaEntity paradaByIdDllegada;

    @Id
    @Column(name = "id_ruta", nullable = false)
    public int getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(int idRuta) {
        this.idRuta = idRuta;
    }

    @Basic
    @Column(name = "status", nullable = true)
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Basic
    @Column(name = "text_user", nullable = true, length = 200)
    public String getTextUser() {
        return textUser;
    }

    public void setTextUser(String textUser) {
        this.textUser = textUser;
    }

    @Basic
    @Column(name = "text_host", nullable = true, length = 200)
    public String getTextHost() {
        return textHost;
    }

    public void setTextHost(String textHost) {
        this.textHost = textHost;
    }

    @Basic
    @Column(name = "id_origen", nullable = false)
    public int getIdOrigen() {
        return idOrigen;
    }

    public void setIdOrigen(int idOrigen) {
        this.idOrigen = idOrigen;
    }

    @Basic
    @Column(name = "id_dllegada", nullable = false)
    public int getIdDllegada() {
        return idDllegada;
    }

    public void setIdDllegada(int idDllegada) {
        this.idDllegada = idDllegada;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RutaEntity that = (RutaEntity) o;

        if (idRuta != that.idRuta) return false;
        if (idOrigen != that.idOrigen) return false;
        if (idDllegada != that.idDllegada) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (textUser != null ? !textUser.equals(that.textUser) : that.textUser != null) return false;
        if (textHost != null ? !textHost.equals(that.textHost) : that.textHost != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idRuta;
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (textUser != null ? textUser.hashCode() : 0);
        result = 31 * result + (textHost != null ? textHost.hashCode() : 0);
        result = 31 * result + idOrigen;
        result = 31 * result + idDllegada;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "id_origen", referencedColumnName = "id_parada", nullable = false)
    public ParadaEntity getParadaByIdOrigen() {
        return paradaByIdOrigen;
    }

    public void setParadaByIdOrigen(ParadaEntity paradaByIdOrigen) {
        this.paradaByIdOrigen = paradaByIdOrigen;
    }

    @ManyToOne
    @JoinColumn(name = "id_dllegada", referencedColumnName = "id_parada", nullable = false)
    public ParadaEntity getParadaByIdDllegada() {
        return paradaByIdDllegada;
    }

    public void setParadaByIdDllegada(ParadaEntity paradaByIdDllegada) {
        this.paradaByIdDllegada = paradaByIdDllegada;
    }
}
