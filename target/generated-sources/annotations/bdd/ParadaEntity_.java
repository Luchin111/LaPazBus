package bdd;

import bdd.RutaEntity;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-04T19:03:14")
@StaticMetamodel(ParadaEntity.class)
public class ParadaEntity_ { 

    public static volatile SingularAttribute<ParadaEntity, Float> latitud;
    public static volatile SingularAttribute<ParadaEntity, Float> longitud;
    public static volatile SingularAttribute<ParadaEntity, Integer> idParada;
    public static volatile SingularAttribute<ParadaEntity, String> textUser;
    public static volatile SingularAttribute<ParadaEntity, String> nombreParada;
    public static volatile CollectionAttribute<ParadaEntity, RutaEntity> rutasByIdParada_0;
    public static volatile CollectionAttribute<ParadaEntity, RutaEntity> rutasByIdParada;
    public static volatile SingularAttribute<ParadaEntity, Integer> statuss;
    public static volatile SingularAttribute<ParadaEntity, String> textHost;
    public static volatile SingularAttribute<ParadaEntity, Integer> status;

}