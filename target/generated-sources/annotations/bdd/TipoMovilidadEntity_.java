package bdd;

import bdd.MovilidadEntity;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-04T19:03:14")
@StaticMetamodel(TipoMovilidadEntity.class)
public class TipoMovilidadEntity_ { 

    public static volatile SingularAttribute<TipoMovilidadEntity, String> descripcion;
    public static volatile SingularAttribute<TipoMovilidadEntity, String> textUser;
    public static volatile SingularAttribute<TipoMovilidadEntity, Integer> statuss;
    public static volatile SingularAttribute<TipoMovilidadEntity, String> textHost;
    public static volatile SingularAttribute<TipoMovilidadEntity, Integer> status;
    public static volatile SingularAttribute<TipoMovilidadEntity, Integer> idTipoMovilidad;
    public static volatile CollectionAttribute<TipoMovilidadEntity, MovilidadEntity> movilidadsByIdTipoMovilidad;

}