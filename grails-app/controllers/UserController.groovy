import org.springframework.security.access.annotation.Secured
import acp.pennapps.User

@Secured(["ROLE_ADMIN"])
class UserController {
    def springSecurityService
    def index() {
        render "Your name is" + springSecurityService.getPrincipal().username + "."
    }
}