package dto;

public class ParadaModel {
    private int idParada;
    private Integer statuss;
    private String textUser;
    private String textHost;
    private String nombreParada;
    private Double latitud;
    private Double longitud;

    public ParadaModel(int idParada, Integer statuss, String nombreParada, Double latitud, Double longitud) {
        this.idParada = idParada;
        this.statuss = statuss;
        this.nombreParada = nombreParada;
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public int getIdParada() {
        return idParada;
    }

    public void setIdParada(int idParada) {
        this.idParada = idParada;
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

    public String getNombreParada() {
        return nombreParada;
    }

    public void setNombreParada(String nombreParada) {
        this.nombreParada = nombreParada;
    }

    public Double getLatitud() {
        return latitud;
    }

    public void setLatitud(Double latitud) {
        this.latitud = latitud;
    }

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }
}


