import org.springframework.security.access.annotation.Secured

@Secured(["ROLE_ADMIN"])
class HomeController {
    def springSecurityService
    def index() {
        render "Your name is" + springSecurityService.getPrincipal().username + "."
    }
    def apply() {
        if (request.post) {
            render "thank you for applying"
            return
        }
    }
    def application() {
        if (request.post) {
            System.out.println(request.body)
        } 
    }
}