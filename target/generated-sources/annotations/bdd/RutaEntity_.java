package bdd;

import bdd.MovilidadRutaEntity;
import bdd.ParadaEntity;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-04T19:03:14")
@StaticMetamodel(RutaEntity.class)
public class RutaEntity_ { 

    public static volatile SingularAttribute<RutaEntity, Integer> idOrigen;
    public static volatile SingularAttribute<RutaEntity, ParadaEntity> paradaByIdOrigen;
    public static volatile SingularAttribute<RutaEntity, Integer> idDllegada;
    public static volatile SingularAttribute<RutaEntity, String> textUser;
    public static volatile CollectionAttribute<RutaEntity, MovilidadRutaEntity> movilidadRutasByIdRuta;
    public static volatile SingularAttribute<RutaEntity, ParadaEntity> paradaByIdDllegada;
    public static volatile SingularAttribute<RutaEntity, Integer> statuss;
    public static volatile SingularAttribute<RutaEntity, String> textHost;
    public static volatile SingularAttribute<RutaEntity, Integer> idRuta;
    public static volatile SingularAttribute<RutaEntity, Integer> status;

}