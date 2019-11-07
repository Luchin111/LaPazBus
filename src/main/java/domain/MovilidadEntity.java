package domain;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;

import javax.persistence.*;

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

        if (idMovilidad != that.idMovilidad) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (textUser != null ? !textUser.equals(that.textUser) : that.textUser != null) return false;
        if (textHost != null ? !textHost.equals(that.textHost) : that.textHost != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idMovilidad;
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (textUser != null ? textUser.hashCode() : 0);
        result = 31 * result + (textHost != null ? textHost.hashCode() : 0);
        return result;
    }
}
