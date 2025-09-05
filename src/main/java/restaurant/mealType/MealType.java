package restaurant.mealType;

import jakarta.persistence.*;

@Entity
@Table(name = "MealType")
public class MealType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @Column(name = "meal_type", nullable = false)
    private String mealType;

    public MealType() {}

    public MealType(String mealType) {
        this.mealType = mealType;
    }

    public Long getId() {
        return id;
    }

    public String getMealType() {
        return mealType;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setMealType(String mealType) {
        this.mealType = mealType;
    }
}
