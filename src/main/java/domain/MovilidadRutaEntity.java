package domain;

import javax.persistence.*;

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

        if (idMovilidadRuta != that.idMovilidadRuta) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (textUser != null ? !textUser.equals(that.textUser) : that.textUser != null) return false;
        if (textHost != null ? !textHost.equals(that.textHost) : that.textHost != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idMovilidadRuta;
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (textUser != null ? textUser.hashCode() : 0);
        result = 31 * result + (textHost != null ? textHost.hashCode() : 0);
        return result;
    }
}
