package kr.ac.gnu.wtet.WhatToEatToday;

public class RecommendBySearchword implements RecommendRestaurants {
	
	private Restaurant[] results;
	private UserInput userInput;
	
	public void RecommendRestaurantsList() {
		
		Restaurant [] outputs;
		
		Restaurants_testcase rt = new Restaurants_testcase(); // �׽�Ʈ���̽� ��ü����
		ManageRestaurantsData mrd = new ManageRestaurantsData(rt); // �׽�Ʈ���̽��� �ִ� ������ �迭�� �������� �κ�
		
		CompareBySearchword search = new CompareBySearchword();
		search.setUserInput(this.userInput);
		search.compare(mrd.getRestaurantlist());
		
		outputs = search.getResults();
		
		if(outputs.length == 0) {
			System.out.println("There's no results");
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
