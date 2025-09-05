package restaurant.menu;

class MenuNotFoundException extends RuntimeException {

	MenuNotFoundException(Long id) {
		super("Could not find employee " + id);
	}
}
