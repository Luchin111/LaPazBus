package domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "movilidad_ruta", schema = "dbtest_lpbus", catalog = "")
public class MovilidadRutaEntity {
    private int idMovilidadRuta;
    private Integer status;
    private String textUser;
    private String textHost;

    @Id
    @Column(name = "id_movilidad_ruta")
    public int getIdMovilidadRuta() {
        return idMovilidadRuta;
    }

    public void setIdMovilidadRuta(int idMovilidadRuta) {
        this.idMovilidadRuta = idMovilidadRuta;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MovilidadRutaEntity that = (MovilidadRutaEntity) o;
        return idMovilidadRuta == that.idMovilidadRuta &&
                Objects.equals(status, that.status) &&
                Objects.equals(textUser, that.textUser) &&
                Objects.equals(textHost, that.textHost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idMovilidadRuta, status, textUser, textHost);
    }
}
