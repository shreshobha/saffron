package restaurant.users;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService service;
    public UserController(UserService service) { this.service = service; }

    @GetMapping
    public List<Users> getAllUsers() { return service.findAll(); }

    @GetMapping("/{id}")
    public Users getUser(@PathVariable Integer id) { return service.findById(id); }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Users createUser(@RequestBody Users user) { return service.create(user); }

    @PutMapping("/{id}")
    public Users updateUser(@PathVariable Integer id, @RequestBody Users user) {
        return service.update(id, user);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteUser(@PathVariable Integer id) { service.delete(id); }
}
