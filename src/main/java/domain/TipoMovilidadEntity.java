package domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tipo_movilidad", schema = "dbtest_lpbus", catalog = "")
public class TipoMovilidadEntity {
    private int idTipoMovilidad;
    private Integer status;
    private String textUser;
    private String textHost;
    private String descripcion;

    @Id
    @Column(name = "id_tipo_movilidad")
    public int getIdTipoMovilidad() {
        return idTipoMovilidad;
    }

    public void setIdTipoMovilidad(int idTipoMovilidad) {
        this.idTipoMovilidad = idTipoMovilidad;
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
    @Column(name = "descripcion")
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TipoMovilidadEntity that = (TipoMovilidadEntity) o;
        return idTipoMovilidad == that.idTipoMovilidad &&
                Objects.equals(status, that.status) &&
                Objects.equals(textUser, that.textUser) &&
                Objects.equals(textHost, that.textHost) &&
                Objects.equals(descripcion, that.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTipoMovilidad, status, textUser, textHost, descripcion);
    }
}
