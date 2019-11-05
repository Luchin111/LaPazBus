package domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "parada", schema = "dbtest_lpbus", catalog = "")
public class ParadaEntity {
    private int idParada;
    private Integer status;
    private String textUser;
    private String textHost;
    private String nombreParada;
    private Double latitud;
    private Double longitud;

    @Id
    @Column(name = "id_parada")
    public int getIdParada() {
        return idParada;
    }

    public void setIdParada(int idParada) {
        this.idParada = idParada;
    }

    @Basic
    @Column(name = "status")
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Basic
    @Column(name = "text_user")
    public String getTextUser() {
        return textUser;
    }

    public void setTextUser(String textUser) {
        this.textUser = textUser;
    }

    @Basic
    @Column(name = "text_host")
    public String getTextHost() {
        return textHost;
    }

    public void setTextHost(String textHost) {
        this.textHost = textHost;
    }

    @Basic
    @Column(name = "Nombre_Parada")
    public String getNombreParada() {
        return nombreParada;
    }

    public void setNombreParada(String nombreParada) {
        this.nombreParada = nombreParada;
    }

    @Basic
    @Column(name = "latitud")
    public Double getLatitud() {
        return latitud;
    }

    public void setLatitud(Double latitud) {
        this.latitud = latitud;
    }

    @Basic
    @Column(name = "longitud")
    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ParadaEntity that = (ParadaEntity) o;
        return idParada == that.idParada &&
                Objects.equals(status, that.status) &&
                Objects.equals(textUser, that.textUser) &&
                Objects.equals(textHost, that.textHost) &&
                Objects.equals(nombreParada, that.nombreParada) &&
                Objects.equals(latitud, that.latitud) &&
                Objects.equals(longitud, that.longitud);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idParada, status, textUser, textHost, nombreParada, latitud, longitud);
    }
}
