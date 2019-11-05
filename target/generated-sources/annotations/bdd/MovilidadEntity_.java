package bdd;

import bdd.MovilidadRutaEntity;
import bdd.TipoMovilidadEntity;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-04T19:03:14")
@StaticMetamodel(MovilidadEntity.class)
public class MovilidadEntity_ { 

    public static volatile CollectionAttribute<MovilidadEntity, MovilidadRutaEntity> movilidadRutasByIdMovilidad;
    public static volatile SingularAttribute<MovilidadEntity, TipoMovilidadEntity> tipoMovilidadByIdTipoMovilidad;
    public static volatile SingularAttribute<MovilidadEntity, String> textUser;
    public static volatile SingularAttribute<MovilidadEntity, String> textHost;
    public static volatile SingularAttribute<MovilidadEntity, Integer> statuss;
    public static volatile SingularAttribute<MovilidadEntity, Integer> idMovilidad;
    public static volatile SingularAttribute<MovilidadEntity, Integer> idTipoMovilidad;

}