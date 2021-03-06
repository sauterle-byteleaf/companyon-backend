package de.byteleaf.companyon.user.boundary

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import de.byteleaf.companyon.user.control.UserService
import de.byteleaf.companyon.user.dto.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller


@Controller
class UserQueryResolver : GraphQLQueryResolver {

    @Autowired
    private lateinit var userService: UserService;

    fun getCurrentUser(): User = userService.getCurrentUser()

    fun getUser(id: String): User = userService.get(id)

    fun getUsers(): List<User> = userService.findAll()
}
