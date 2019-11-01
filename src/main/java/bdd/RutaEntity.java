package bdd;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "ruta", schema = "dbtest_lpbus", catalog = "")
public class RutaEntity {
    private int idRuta;
    private Integer statuss;
    private String textUser;
    private String textHost;
    private int idOrigen;
    private int idDllegada;
    private Collection<MovilidadRutaEntity> movilidadRutasByIdRuta;
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
        return idRuta == that.idRuta &&
                idOrigen == that.idOrigen &&
                idDllegada == that.idDllegada &&
                Objects.equals(statuss, that.statuss) &&
                Objects.equals(textUser, that.textUser) &&
                Objects.equals(textHost, that.textHost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idRuta, statuss, textUser, textHost, idOrigen, idDllegada);
    }

    @OneToMany(mappedBy = "rutaByIdRuta")
    public Collection<MovilidadRutaEntity> getMovilidadRutasByIdRuta() {
        return movilidadRutasByIdRuta;
    }

    public void setMovilidadRutasByIdRuta(Collection<MovilidadRutaEntity> movilidadRutasByIdRuta) {
        this.movilidadRutasByIdRuta = movilidadRutasByIdRuta;
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
