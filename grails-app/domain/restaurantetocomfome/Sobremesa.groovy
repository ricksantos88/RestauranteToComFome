package restaurantetocomfome

//import java.awt.geom.Arc2D.Double;

class Sobremesa extends Produto {
	
	Integer calorias;
	
    static constraints = {
		calorias min: 0;
    }
	static mapping = {
		discriminator value: "SOBREMESA";
	}
}
