package kr.ac.gnu.wtet.WhatToEatToday;

import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CompareByKeyword implements CompareUserInputandResaurantList {
	
	private Restaurant[] results;
	private UserInput userInput;
	
	public void compare(Restaurant[] allOfRestaurantList) {
		
		ArrayList<String> cloneOfInputKeywords = userInput.getInputKeywords(); // �Է��� ���ڿ��� ����
		
		ArrayList<Restaurant> matchedRestaurants = new ArrayList<Restaurant>(); // ����� ������ List
					
		for(int i = 0; i < allOfRestaurantList.length; i++) {
			
			int same = 0;
			
			Map<String, Integer> cloneOfMap = allOfRestaurantList[i].getKeyword().getMap(); // ������ �� ���� �񱳸� ���� ����
						
			for(int j = 0; j < cloneOfInputKeywords.size(); j++) {
				
				if((int)cloneOfMap.get(cloneOfInputKeywords.get(j)) == 1) {
					same ++;
				} // ������ Ű���� �� �Է¹��� ���ڿ��� �ش��Ѵ� �κ��� 1�̸�
				
				if(same == cloneOfInputKeywords.size()) {
					matchedRestaurants.add(allOfRestaurantList[i]);
				} // �Է¹��� ���ڿ��� ���̿� �������� Ű���尡 1 �� ������ ��ġ�ϸ� ����� �߰�
			}
		}
		
		Restaurant [] outputs = new Restaurant[matchedRestaurants.size()];
		
		for(int i = 0; i < matchedRestaurants.size(); i++) {
			outputs[i] = new Restaurant();
			outputs[i] = matchedRestaurants.get(i);
		}
		
		//outputs = (Restaurant[]) matchedRestaurants.toArray();
		
		this.results = outputs;
		
		
	}

	public Restaurant[] getResults() {
		return results;
	}

	public void setResults(Restaurant[] results) {
		this.results = results;
	}

	public UserInput getUserInput() {
		return userInput;
	}

	public void setUserInput(UserInput userInput) {
		this.userInput = userInput;
	}

}
