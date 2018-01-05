package restaurantetocomfome

import java.sql.Date;

class Pedido {
	
	Date dataHota;	
	Double valorTotal;
	
	Cliente cliente;
	
	static hasMany = [itens:ItemPedido];
	
    static constraints = {
		valorTotal min: new Double(0);
		cliente nullable: false;
    }
	
	static mapping = {
		cliente column: "id_cliente";
	}
}
