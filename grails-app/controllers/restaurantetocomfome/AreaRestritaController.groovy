package restaurantetocomfome



class AreaRestritaController {
	
	def springSecurityService;
	
    def index() {
		
		render(view: "/areaRestrita/logar");
	}
	
	def logar(){
		
		render(view: "/areaRestrita/logar");
	}
	
	def admin(){
		
		String usuario = springSecurityService.principal.username;
		//println usuario;
		
		render(view:"/areaRestrita/admin", model:[usuario: usuario]);
	}
	
	def logout(){
		redirect(action: "logar");
	}
	
	
}
