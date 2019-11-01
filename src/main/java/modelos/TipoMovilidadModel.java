package modelos;

public class TipoMovilidadModel {
    private int idTipoMovilidad;
    private Integer statuss;
    private String textUser;
    private String textHost;
    private String descripcion;

    public TipoMovilidadModel(int idTipoMovilidad, Integer statuss, String descripcion) {
        this.idTipoMovilidad = idTipoMovilidad;
        this.statuss = statuss;
        this.descripcion = descripcion;
    }

    public int getIdTipoMovilidad() {
        return idTipoMovilidad;
    }

    public void setIdTipoMovilidad(int idTipoMovilidad) {
        this.idTipoMovilidad = idTipoMovilidad;
    }

    public Integer getStatuss() {
        return statuss;
    }

    public void setStatuss(Integer statuss) {
        this.statuss = statuss;
    }

    public String getTextUser() {
        return textUser;
    }

    public void setTextUser(String textUser) {
        this.textUser = textUser;
    }

    public String getTextHost() {
        return textHost;
    }

    public void setTextHost(String textHost) {
        this.textHost = textHost;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
