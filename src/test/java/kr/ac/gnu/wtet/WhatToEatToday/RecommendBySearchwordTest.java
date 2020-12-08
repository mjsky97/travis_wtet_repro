package kr.ac.gnu.wtet.WhatToEatToday;

import static org.junit.Assert.*;

import org.junit.Test;

import kr.ac.gnu.wtet.WhatToEatToday.ManageRestaurantsData;
import kr.ac.gnu.wtet.WhatToEatToday.CompareBySearchword;
import kr.ac.gnu.wtet.WhatToEatToday.Restaurant;
import kr.ac.gnu.wtet.WhatToEatToday.Restaurants_testcase;
import kr.ac.gnu.wtet.WhatToEatToday.UserInput;

public class RecommendBySearchwordTest {

	@Test
	public void testListOfRecommendedList() {
		
		Restaurant [] outputs;
		Restaurant [] compare = new Restaurant[2];		
		
		Restaurants_testcase rt = new Restaurants_testcase();
		ManageRestaurantsData mrd = new ManageRestaurantsData(rt);
		
		UserInput ui = new UserInput();
		ui.setSearchword("포차");
		
		RecommendBySearchword search = new RecommendBySearchword();
		search.setUserInput(ui);
		search.RecommendRestaurantsList();
		
		compare[0] = rt.getRestaurants()[9];		// ��������
		compare[1] = rt.getRestaurants()[10];		// ��������
		
		outputs = search.getResults();
		
		assertNotNull(outputs);
		assertEquals("수복포차", outputs[0].getRestaurantName());
		assertEquals("만고포차", outputs[1].getRestaurantName());
		
	}

}
