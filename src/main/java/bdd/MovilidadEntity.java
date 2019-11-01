package bdd;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "movilidad", schema = "dbtest_lpbus", catalog = "")
public class MovilidadEntity {
    private int idMovilidad;
    private Integer statuss;
    private String textUser;
    private String textHost;
    private int idTipoMovilidad;
    private TipoMovilidadEntity tipoMovilidadByIdTipoMovilidad;
    private Collection<MovilidadRutaEntity> movilidadRutasByIdMovilidad;

    @Id
    @Column(name = "id_movilidad", nullable = false)
    public int getIdMovilidad() {
        return idMovilidad;
    }

    public void setIdMovilidad(int idMovilidad) {
        this.idMovilidad = idMovilidad;
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
    @Column(name = "id_tipo_movilidad", nullable = false)
    public int getIdTipoMovilidad() {
        return idTipoMovilidad;
    }

    public void setIdTipoMovilidad(int idTipoMovilidad) {
        this.idTipoMovilidad = idTipoMovilidad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MovilidadEntity that = (MovilidadEntity) o;
        return idMovilidad == that.idMovilidad &&
                idTipoMovilidad == that.idTipoMovilidad &&
                Objects.equals(statuss, that.statuss) &&
                Objects.equals(textUser, that.textUser) &&
                Objects.equals(textHost, that.textHost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idMovilidad, statuss, textUser, textHost, idTipoMovilidad);
    }

    @ManyToOne
    @JoinColumn(name = "id_tipo_movilidad", referencedColumnName = "id_tipo_movilidad", nullable = false)
    public TipoMovilidadEntity getTipoMovilidadByIdTipoMovilidad() {
        return tipoMovilidadByIdTipoMovilidad;
    }

    public void setTipoMovilidadByIdTipoMovilidad(TipoMovilidadEntity tipoMovilidadByIdTipoMovilidad) {
        this.tipoMovilidadByIdTipoMovilidad = tipoMovilidadByIdTipoMovilidad;
    }

    @OneToMany(mappedBy = "movilidadByIdMovilidad")
    public Collection<MovilidadRutaEntity> getMovilidadRutasByIdMovilidad() {
        return movilidadRutasByIdMovilidad;
    }

    public void setMovilidadRutasByIdMovilidad(Collection<MovilidadRutaEntity> movilidadRutasByIdMovilidad) {
        this.movilidadRutasByIdMovilidad = movilidadRutasByIdMovilidad;
    }
}
