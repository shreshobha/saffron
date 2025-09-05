package restaurant.mealType;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/mealType")
public class MealTypeController {
    private final MealTypeService service;
    public MealTypeController(MealTypeService service) { this.service = service; }

    // Define endpoints for MealType as needed
    @GetMapping
    public List<MealType> getAllMealType() { return service.getAll(); }

    @GetMapping("/{id}")
    public MealType getmealType(@PathVariable Long id) { return service.findById(id); }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MealType createmealType(@RequestBody MealType mealType) { return service.add(mealType); }

    @PutMapping("/{id}")
    public MealType updatemealType(@PathVariable Long id, @RequestBody MealType mealType) {
        return service.update(id, mealType);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletemealType(@PathVariable Long id) { service.delete(id); }

    
}
