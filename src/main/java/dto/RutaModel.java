package dto;

public class RutaModel {
    private int idRuta;
    private Integer status;
    private String textUser;
    private String textHost;
    private int idOrigen;
    private int idDllegada;

    public RutaModel(int idRuta, Integer status, int idOrigen, int idDllegada) {
        this.idRuta = idRuta;
        this.status = status;
        this.idOrigen = idOrigen;
        this.idDllegada = idDllegada;
    }

    public int getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(int idRuta) {
        this.idRuta = idRuta;
    }

    public Integer getstatus() {
        return status;
    }

    public void setstatus(Integer status) {
        this.status = status;
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

    public int getIdOrigen() {
        return idOrigen;
    }

    public void setIdOrigen(int idOrigen) {
        this.idOrigen = idOrigen;
    }

    public int getIdDllegada() {
        return idDllegada;
    }

    public void setIdDllegada(int idDllegada) {
        this.idDllegada = idDllegada;
    }
}
