package service.impl;

import java.util.List;

import dao.MenuDao;
import dao.impl.MenuDaoImple;
import dto.MenuDto;
import dto.OrderDto;
import service.MenuService;

public class MenuServiceImpl implements MenuService {
	MenuDao menuDao = new MenuDaoImple();
	
	@Override
	public List<MenuDto> getMenuList() {
		return menuDao.getMenuList();
	}

	@Override
	public MenuDto getMenuInfo(String menu) {
		
		return menuDao.getMenuInfo(menu);
	}

}
