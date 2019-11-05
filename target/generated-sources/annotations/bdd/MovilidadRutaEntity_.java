package bdd;

import bdd.MovilidadEntity;
import bdd.RutaEntity;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-04T19:03:14")
@StaticMetamodel(MovilidadRutaEntity.class)
public class MovilidadRutaEntity_ { 

    public static volatile SingularAttribute<MovilidadRutaEntity, RutaEntity> rutaByIdRuta;
    public static volatile SingularAttribute<MovilidadRutaEntity, String> textUser;
    public static volatile SingularAttribute<MovilidadRutaEntity, Integer> idMovilidadRuta;
    public static volatile SingularAttribute<MovilidadRutaEntity, Integer> statuss;
    public static volatile SingularAttribute<MovilidadRutaEntity, String> textHost;
    public static volatile SingularAttribute<MovilidadRutaEntity, MovilidadEntity> movilidadByIdMovilidad;
    public static volatile SingularAttribute<MovilidadRutaEntity, Integer> idMovilidad;
    public static volatile SingularAttribute<MovilidadRutaEntity, Integer> idRuta;
    public static volatile SingularAttribute<MovilidadRutaEntity, Integer> status;

}