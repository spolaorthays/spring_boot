package io.redspark.thot.controller;

import io.redspark.thot.controller.dto.CreateLeadDTO;
import io.redspark.thot.controller.dto.LeadDTO;
import io.redspark.thot.controller.dto.UserDTO;
import io.redspark.thot.service.LeadService;
import io.redspark.thot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {

    private final UserService userService;

    @Autowired //ele linka automaticamente com o dependencia
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public UserDTO create(@RequestBody UserDTO userDTO){
        return userService.create(userDTO);
    }

    @GetMapping
    public List<UserDTO> findAll(){
        return userService.findAll();
    }

}
