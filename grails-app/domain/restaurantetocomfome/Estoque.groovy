package restaurantetocomfome

import javax.persistence.Column;

class Estoque {
	
	Integer quantidade;
	Integer quantidadeMinima;
	
	Produto produto;
	
	//Pertence a produto
	static belongsTo = [Produto];

    static constraints = {
		quantidade min: 0;
		quantidadeMinima min: 0;
		produto nullable:false;
    }
	
	static mapping = {
		produto column: "id_produto";
	}
}
