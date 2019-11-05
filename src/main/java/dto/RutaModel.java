package dto;

public class RutaModel {
    private int idRuta;
    private Integer statuss;
    private String textUser;
    private String textHost;
    private int idOrigen;
    private int idDllegada;

    public RutaModel(int idRuta, Integer statuss, int idOrigen, int idDllegada) {
        this.idRuta = idRuta;
        this.statuss = statuss;
        this.idOrigen = idOrigen;
        this.idDllegada = idDllegada;
    }

    public int getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(int idRuta) {
        this.idRuta = idRuta;
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
