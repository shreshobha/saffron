package restaurant.mealType;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class MealTypeService {
    private final MealTypeRepository repo;
    public MealTypeService(MealTypeRepository repo) { this.repo = repo; }
    public List<MealType> getAll() { return repo.findAll(); }
    public MealType findById(Long id) {
        if (id == null) throw new IllegalArgumentException("id cannot be null");
        return repo.findById(id).orElseThrow(() -> new IllegalStateException("MealType with id " + id + " does not exist")); }
    public MealType add(MealType mealType) { return repo.save(mealType); }
    
    public MealType update(Long id, MealType mealType) {
        MealType existing = findById(id);
        existing.setMealType(mealType.getMealType());
        existing.setId(mealType.getId());
        return repo.save(existing);
    }

    public void delete(Long id) { repo.delete(findById(id)); }

}
