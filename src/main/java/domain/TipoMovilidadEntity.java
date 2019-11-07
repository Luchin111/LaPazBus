package domain;

import javax.persistence.*;

@Entity
@Table(name = "tipo_movilidad", schema = "dbtest_lpbus", catalog = "")
public class TipoMovilidadEntity {
    private int idTipoMovilidad;
    private Integer status;
    private String textUser;
    private String textHost;
    private String descripcion;

    @Id
    @Column(name = "id_tipo_movilidad", nullable = false)
    public int getIdTipoMovilidad() {
        return idTipoMovilidad;
    }

    public void setIdTipoMovilidad(int idTipoMovilidad) {
        this.idTipoMovilidad = idTipoMovilidad;
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
    @Column(name = "descripcion", nullable = true, length = 200)
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

        if (idTipoMovilidad != that.idTipoMovilidad) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (textUser != null ? !textUser.equals(that.textUser) : that.textUser != null) return false;
        if (textHost != null ? !textHost.equals(that.textHost) : that.textHost != null) return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTipoMovilidad;
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (textUser != null ? textUser.hashCode() : 0);
        result = 31 * result + (textHost != null ? textHost.hashCode() : 0);
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        return result;
    }
}
