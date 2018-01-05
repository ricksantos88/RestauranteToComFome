package restaurantetocomfome

//import org.grails.datastore.gorm.finders.MethodExpression.InList;

class Bebida extends Produto {
	
	Double liquido;
	String unidade;

    static constraints = {
		//new Double(0) usado para tipos double apenas o '0' não funciona.
		liquido min: new Double(0);
		unidade nullable:false, blank:false, InList:["L", "ml"]
    }
	static mapping = {
		discriminator value: "BEBIDA";
	}
	
}
