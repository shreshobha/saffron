package restaurant.menu;

import org.springframework.data.jpa.repository.JpaRepository;

interface MenuRepository extends JpaRepository<Menu, Long> {

}
