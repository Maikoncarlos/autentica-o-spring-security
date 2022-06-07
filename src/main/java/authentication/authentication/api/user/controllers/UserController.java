package authentication.authentication.api.user.controllers;

import authentication.authentication.api.user.dto.CreateUserRoleDTO;
import authentication.authentication.api.user.entities.User;
import authentication.authentication.api.user.services.CreateRoleUserService;
import authentication.authentication.api.user.services.CreateUserService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
@NoArgsConstructor
public class UserController {

    CreateUserService userService;
    CreateRoleUserService roleUserService;

    @PostMapping("/create")
    @ApiResponses(value = {
            @ApiResponse(code = 545, message = "inclui um erro especifico de tiver na sua aplicação")
    })
    @ApiOperation(value = "Criar Usuarios")
    public User create(@RequestBody User user) {
        return userService.execute(user);
    }

    @ApiOperation(value = "Criar Permissões")
    @PostMapping("/role")
    public User create(@RequestBody CreateUserRoleDTO userRoleDTO) {
        return roleUserService.execute(userRoleDTO);
    }

}
