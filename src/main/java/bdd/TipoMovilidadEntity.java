package bdd;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "tipo_movilidad", schema = "dbtest_lpbus", catalog = "")
public class TipoMovilidadEntity {
    private int idTipoMovilidad;
    private Integer statuss;
    private String textUser;
    private String textHost;
    private String descripcion;
    private Collection<MovilidadEntity> movilidadsByIdTipoMovilidad;

    @Id
    @Column(name = "id_tipo_movilidad", nullable = false)
    public int getIdTipoMovilidad() {
        return idTipoMovilidad;
    }

    public void setIdTipoMovilidad(int idTipoMovilidad) {
        this.idTipoMovilidad = idTipoMovilidad;
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
        return idTipoMovilidad == that.idTipoMovilidad &&
                Objects.equals(statuss, that.statuss) &&
                Objects.equals(textUser, that.textUser) &&
                Objects.equals(textHost, that.textHost) &&
                Objects.equals(descripcion, that.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTipoMovilidad, statuss, textUser, textHost, descripcion);
    }

    @OneToMany(mappedBy = "tipoMovilidadByIdTipoMovilidad")
    public Collection<MovilidadEntity> getMovilidadsByIdTipoMovilidad() {
        return movilidadsByIdTipoMovilidad;
    }

    public void setMovilidadsByIdTipoMovilidad(Collection<MovilidadEntity> movilidadsByIdTipoMovilidad) {
        this.movilidadsByIdTipoMovilidad = movilidadsByIdTipoMovilidad;
    }
}
