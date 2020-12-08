package kr.ac.gnu.wtet.WhatToEatToday;

import java.util.ArrayList;

/*

 �˻�� input���� ����
 �� �˻�� �����ϴ� ����� ���
 
*/

public class CompareBySearchword implements CompareUserInputandResaurantList {
	
	private Restaurant[] results;
	private UserInput userInput;
	
	public void compare(Restaurant[] allOfRestaurantList) {
 		
		String [] arrayOfInputtedWord = userInput.getSearchword().split(""); // �ѱ��ھ� ����(split)
		
		ArrayList<Integer> indexOfMatchedRestaurant = new ArrayList<Integer>(); // ����� ������ List
		
		for(int i = 0; i < allOfRestaurantList.length; i++) {		// ��� Restaurant ������ŭ �ݺ�
			
			int count = 0;		// �� ���� ���� ���� ������ �� ����
			
			for(int j = 0; j < arrayOfInputtedWord.length; j++) {		// input���� ���� ���ڿ��� �� ������ŭ �ݺ�	
				
				if(allOfRestaurantList[i].getRestaurantName().contains(arrayOfInputtedWord[j])) {
					count ++;
				}		// ���ڸ� �����ϸ� count�� 1 �ø�
				
				if(count == arrayOfInputtedWord.length) {
					indexOfMatchedRestaurant.add(i);
				}		// ������ �̸��� ���Ͽ� count�� input���� ���� String�� �迭 ���̿� ������(=�˻�� ��� ����) 
			}
		}

		Restaurant [] outputs = new Restaurant[indexOfMatchedRestaurant.size()];
		
		for(int i = 0; i < indexOfMatchedRestaurant.size(); i++) {
			outputs[i] = new Restaurant();
			outputs[i] = allOfRestaurantList[indexOfMatchedRestaurant.get(i)];
			
		}
		
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
