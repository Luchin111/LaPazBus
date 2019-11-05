package dto;

import domain.MovilidadEntity;
import domain.RutaEntity;

public class MovilidadRutaModel {
    private int idMovilidadRuta;
    private Integer statuss;
    private String textUser;
    private String textHost;
    private int idMovilidad;
    private int idRuta;

    public MovilidadRutaModel(Integer statuss, int idMovilidad, int idRuta) {
        this.statuss = statuss;
        this.idMovilidad = idMovilidad;
        this.idRuta = idRuta;
    }

    public int getIdMovilidadRuta() {
        return idMovilidadRuta;
    }

    public void setIdMovilidadRuta(int idMovilidadRuta) {
        this.idMovilidadRuta = idMovilidadRuta;
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

    public int getIdMovilidad() {
        return idMovilidad;
    }

    public void setIdMovilidad(int idMovilidad) {
        this.idMovilidad = idMovilidad;
    }

    public int getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(int idRuta) {
        this.idRuta = idRuta;
    }
}
