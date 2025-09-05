package restaurant.users;


import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {
    private final UserRepository repo;
    public UserService(UserRepository repo) { this.repo = repo; }

    public List<Users> findAll() { return repo.findAll(); }
    public Users findById(Integer id) { 
        if (id == null) throw new IllegalArgumentException("id cannot be null");
        return repo.findById(id).orElseThrow(() -> new RuntimeException("User not found")); }
    public Users create(Users user) { return repo.save(user); }
    public Users update(Integer id, Users user) {
        Users existing = findById(id);
        existing.setUsername(user.getUsername());
        existing.setEmail(user.getEmail());
        return repo.save(existing);
    }
    public void delete(Integer id) { repo.delete(findById(id)); }
}
