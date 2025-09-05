package restaurant.menu;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class MenuService {
    private final MenuRepository repo;
    public MenuService(MenuRepository repo) { this.repo = repo; }
    public List<Menu> getAll() { return repo.findAll(); }
    public Menu findById(Long id) {
        if (id == null) throw new IllegalArgumentException("id cannot be null");
        return repo.findById(id).orElseThrow(() -> new IllegalStateException("Menu with id " + id + " does not exist")); }
    public Menu add(Menu Menu) { return repo.save(Menu); }
    
    public Menu update(Long id, Menu Menu) {
        Menu existing = findById(id);
        existing.setItem(Menu.getItem());
        
        existing.setType(Menu.getType());
        return repo.save(existing);
    }

    public void delete(Long id) { repo.delete(findById(id)); }
}