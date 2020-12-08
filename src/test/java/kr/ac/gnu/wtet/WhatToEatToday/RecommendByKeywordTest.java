package kr.ac.gnu.wtet.WhatToEatToday;

import static org.junit.Assert.*;

import org.junit.Test;

import kr.ac.gnu.wtet.WhatToEatToday.ManageRestaurantsData;
import kr.ac.gnu.wtet.WhatToEatToday.CompareByKeyword;
import kr.ac.gnu.wtet.WhatToEatToday.Restaurant;
import kr.ac.gnu.wtet.WhatToEatToday.Restaurants_testcase;
import kr.ac.gnu.wtet.WhatToEatToday.UserInput;

public class RecommendByKeywordTest {

	@Test
	public void testListOfRecommendedList() {
		
		Restaurant [] outputs;
		Restaurant [] compare = new Restaurant[3];
				
		Restaurants_testcase rt = new Restaurants_testcase();
		ManageRestaurantsData mrd = new ManageRestaurantsData(rt);
			
		UserInput ui = new UserInput();
		ui.putInputKeywords("회식");
		
		RecommendByKeyword keyword = new RecommendByKeyword();
		keyword.setUserInput(ui);
		keyword.RecommendRestaurantsList();
				
		outputs = keyword.getResults();
		
		compare[0] = rt.getRestaurants()[0];
		compare[1] = rt.getRestaurants()[7];
		compare[2] = rt.getRestaurants()[8];
		
		assertNotNull(outputs);
		assertEquals("조커닭", outputs[0].getRestaurantName());
		assertEquals("비날", outputs[1].getRestaurantName());
		assertEquals("핑청", outputs[2].getRestaurantName());
	}

}
