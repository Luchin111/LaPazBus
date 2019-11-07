package domain;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "movilidad", schema = "dbtest_lpbus", catalog = "")
public class MovilidadEntity {
    private int idMovilidad;
    private Integer status;
    private String textUser;
    private String textHost;

    @Id
    @Column(name = "id_movilidad")
    public int getIdMovilidad() {
        return idMovilidad;
    }

    public void setIdMovilidad(int idMovilidad) {
        this.idMovilidad = idMovilidad;
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
        MovilidadEntity that = (MovilidadEntity) o;
        return idMovilidad == that.idMovilidad &&
                Objects.equals(status, that.status) &&
                Objects.equals(textUser, that.textUser) &&
                Objects.equals(textHost, that.textHost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idMovilidad, status, textUser, textHost);
    }
}
