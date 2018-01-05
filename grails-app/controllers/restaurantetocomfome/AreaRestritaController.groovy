package restaurantetocomfome

class AreaRestritaController {
	
	def springSecurityService;
	
    def index() {
		
	}
	
	def logar(){
		
		render(view: "/areaRestrita/logar");
	}
	
	def admin(){
		
		String usuario = springSecurityService.principal.username;
		
		render(view: "/arearestrita/admin", model: [usuario: usuario]);
	}
	
	def logout(){
		redirect(action: "logar");
	}
	
	
}
