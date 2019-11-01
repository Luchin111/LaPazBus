package bdd;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "parada", schema = "dbtest_lpbus", catalog = "")
public class ParadaEntity {
    private int idParada;
    private Integer statuss;
    private String textUser;
    private String textHost;
    private String nombreParada;
    private Double latitud;
    private Double longitud;
    private Collection<RutaEntity> rutasByIdParada;
    private Collection<RutaEntity> rutasByIdParada_0;

    @Id
    @Column(name = "id_parada", nullable = false)
    public int getIdParada() {
        return idParada;
    }

    public void setIdParada(int idParada) {
        this.idParada = idParada;
    }

    @Basic
    @Column(name = "statuss", nullable = true)
    public Integer getStatuss() {
        return statuss;
    }

    public void setStatuss(Integer statuss) {
        this.statuss = statuss;
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
    @Column(name = "Nombre_Parada", nullable = true, length = 200)
    public String getNombreParada() {
        return nombreParada;
    }

    public void setNombreParada(String nombreParada) {
        this.nombreParada = nombreParada;
    }

    @Basic
    @Column(name = "latitud", nullable = true, precision = 0)
    public Double getLatitud() {
        return latitud;
    }

    public void setLatitud(Double latitud) {
        this.latitud = latitud;
    }

    @Basic
    @Column(name = "longitud", nullable = true, precision = 0)
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
                Objects.equals(statuss, that.statuss) &&
                Objects.equals(textUser, that.textUser) &&
                Objects.equals(textHost, that.textHost) &&
                Objects.equals(nombreParada, that.nombreParada) &&
                Objects.equals(latitud, that.latitud) &&
                Objects.equals(longitud, that.longitud);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idParada, statuss, textUser, textHost, nombreParada, latitud, longitud);
    }

    @OneToMany(mappedBy = "paradaByIdOrigen")
    public Collection<RutaEntity> getRutasByIdParada() {
        return rutasByIdParada;
    }

    public void setRutasByIdParada(Collection<RutaEntity> rutasByIdParada) {
        this.rutasByIdParada = rutasByIdParada;
    }

    @OneToMany(mappedBy = "paradaByIdDllegada")
    public Collection<RutaEntity> getRutasByIdParada_0() {
        return rutasByIdParada_0;
    }

    public void setRutasByIdParada_0(Collection<RutaEntity> rutasByIdParada_0) {
        this.rutasByIdParada_0 = rutasByIdParada_0;
    }
}
