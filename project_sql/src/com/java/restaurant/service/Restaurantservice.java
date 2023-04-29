package com.java.restaurant.service;


import com.java.common.AppService;
import com.java.restaurant.repository.Restaurantrepository;
import com.java.view.StartUI;

public class Restaurantservice implements AppService{

	private final Restaurantrepository restaurantrepository 
	= new Restaurantrepository();
	
	@Override
	public void start() {

		
		while(true) {
			StartUI.searchMenu();
			int selection = StartUI.inputInteger();
			
			switch(selection) {
			
			case 1:
				restaurantrepository.searchRestaurant();
				break;
			case 2:
				StartUI.fourMenu();
				int fourvalue= StartUI.inputInteger();
				restaurantrepository.foodtype(fourvalue);
				break;
			case 3:

				return;
				
			default:
				System.out.println("메뉴를 다시 입력하세요.");
			}
			System.out.println("\n==== 계속 진행하시려면 ENTER를 누르세요====");
			StartUI.inputString();
			
			}
			
		}
		
	
}
