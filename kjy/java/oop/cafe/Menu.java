package coffee;

import java.util.ArrayList;
import java.util.List;

public class Menu implements IMenu {

	public List<MenuItem> menuItems;
	public Menu(){
		menuItems = new ArrayList<MenuItem>();
	}
	@Override
	public void addMenu(MenuItem menuItem) {
		// TODO Auto-generated method stub
		menuItems.add(menuItem);
		System.out.println(menuItem.name+" 메뉴를 추가합니다.");
	}

	@Override
	public List<MenuItem> showMenu() {
		// TODO Auto-generated method stub
		return menuItems;
	}

}
