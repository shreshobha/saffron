package restaurant.menu;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;  


@Entity
@Table(name = "menu_items")
class Menu {

	private @Id
	@GeneratedValue Long item_id;
	private String item_name;
	private String category_id;	
		
	public Menu() {}

	public Menu(String item_name, String category_id) {
		this.item_name = item_name;
		this.category_id = category_id;
	}
	public Long getItem_id() {
		return item_id;
	}
	public String getItem() {
		return item_name;
	}
	public String getType() {	
		return category_id;
	}
	public void setItem_id(Long item_id) {
		this.item_id = item_id;	
	}
	public void setItem(String item_name) {	
		this.item_name = item_name;
	}	
	public void setType(String category_id) {	
		this.category_id = category_id;
	}
	@Override
	public boolean equals(Object o) {
		if (this == o)	
			return true;
		if (!(o instanceof Menu))
			return false;
		Menu menu = (Menu) o;
		return Objects.equals(this.item_id, menu.item_id) && Objects.equals(this.item_name, menu.item_name)
				&& Objects.equals(this.category_id, menu.category_id);
	}	
	@Override
	public int hashCode() {
		return Objects.hash(this.item_id, this.item_name, this.category_id);
	}	
	@Override
	public String toString() {
		return "Menu{" + "id=" + this.item_id + ", item='" + this.item_name + '\'' + ", type='" + this.category_id + '\'' + '}';
	}
}

