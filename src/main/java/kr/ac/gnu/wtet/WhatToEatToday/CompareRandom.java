package kr.ac.gnu.wtet.WhatToEatToday;

import java.util.Random;

/*

��� ������ �� �������� 3�� ���

*/

public class CompareRandom implements CompareUserInputandResaurantList {
	
	private Restaurant[] results;
	private final int SIZE_OF_RESTAURANT_LIST = 3;		//����� ������ ����Ʈ ����(���) 
	
	public Restaurant binarySearch(int key, Restaurant[] restaurantlist) {
		int mid = 0;
		int left = 0;
		int right = restaurantlist.length - 1;
		Restaurant restaurant = new Restaurant();

		while(right >= left) {
			mid = (right + left) / 2;
			
			if (key == restaurantlist[mid].getNumber()) {
				restaurant = new Restaurant();
				restaurant = restaurantlist[mid];				
				break;
			}
			
			if (key < restaurantlist[mid].getNumber()) {
				right = mid - 1;
			}
			else {
				left = mid + 1;
			}
		}
		
		return restaurant;
	}
		
	public void compare(Restaurant[] allOfRestaurantList) {
		
		Random random = new Random();
		int [] listOfRandomNumbers = new int [SIZE_OF_RESTAURANT_LIST];		// ������ ������ �迭
		Restaurant [] outputs = new Restaurant[SIZE_OF_RESTAURANT_LIST];	// output ������ ��ü �迭
					
		for(int i = 0; i < SIZE_OF_RESTAURANT_LIST; i++) {  // �����ŭ �ݺ�
			
			listOfRandomNumbers[i] = random.nextInt(allOfRestaurantList.length) + 1; // �����߻�(3)
			
			for(int j = 0; j < i; j++) {
				if(listOfRandomNumbers[i] == listOfRandomNumbers[j]) {
					i--;
				}
			} // ���� �ߺ������� ���� �ݺ���
			
			outputs[i] = new Restaurant();  // ���۷��� �Ҵ�
			outputs[i] = this.binarySearch(listOfRandomNumbers[i], allOfRestaurantList);  // ��ü�迭�� ��ü �Ҵ�
		}
		
		this.results = outputs;
		
	}
	
	public Restaurant[] getResults() {
		return results;
	}

	public void setResults(Restaurant[] results) {
		this.results = results;
	}
}
