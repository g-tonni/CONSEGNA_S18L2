package giadatonni.CONSEGNA_S18L2.controllers;

import giadatonni.CONSEGNA_S18L2.entities.User;
import giadatonni.CONSEGNA_S18L2.payload.UserPayload;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {

    @GetMapping
    public List<User> findAll(){}

    @PostMapping
    public User addUser(@RequestBody UserPayload body){}

    @GetMapping("/{userId}")
    public User findById(@PathVariable long userId){}

    @PutMapping("/{userId}")
    public User putUser(@PathVariable long userId, @RequestBody UserPayload body){}

    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable long userId){}
}
