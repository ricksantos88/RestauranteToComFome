package restaurantetocomfome

import javax.persistence.JoinTable;

class Cliente {
	
	String nome;
	String email;
	String senha;
	
	static hasMany = [pedidos: Pedido, produtosPreferidos: Produto];
	
	static constraints = {
		nome  nullable:false, blank:false;
		email email:true, unique:true;
		//nesse caso a criptografia da senha deve ser realizada depois da validação da classe
		senha size: 6..10;
    }
	
	static mapping ={
		produtosPreferidos joinTable:[name:"preferencias_clientes", key:"id_cliente", column:"id_produto"];
	}
}
