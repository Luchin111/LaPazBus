package modelos;

public class MovilidadModel {
    private int idMovilidad;
    private Integer statuss;
    private String textUser;
    private String textHost;
    private int idTipoMovilidad;


    public MovilidadModel(int idMovilidad, Integer statuss, int idTipoMovilidad ) {
        this.idMovilidad = idMovilidad;
        this.statuss = statuss;
        this.idTipoMovilidad=idTipoMovilidad;
    }

    public int getIdMovilidad() {
        return idMovilidad;
    }

    public void setIdMovilidad(int idMovilidad) {
        this.idMovilidad = idMovilidad;
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

    public int getidTipoMovilidad() {
        return idTipoMovilidad;
    }

    public void setidTipoMovilidad(int idTipoMovilidad) {
        this.idTipoMovilidad = idTipoMovilidad;
    }
}
