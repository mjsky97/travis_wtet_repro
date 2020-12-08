package kr.ac.gnu.wtet.WhatToEatToday;

public class RecommendRandom implements RecommendRestaurants {
	
	private Restaurant[] results;
	
	public void RecommendRestaurantsList() {
		Restaurant [] outputs;
		
		Restaurants_testcase rt = new Restaurants_testcase(); // �׽�Ʈ���̽� ��ü����
		ManageRestaurantsData mrd = new ManageRestaurantsData(rt); // �׽�Ʈ���̽��� �ִ� ������ �迭�� �������� �κ�
		
		CompareRandom random = new CompareRandom();
		random.compare(mrd.getRestaurantlist());
		outputs = random.getResults();
		
		this.results = outputs;
	}

	public Restaurant[] getResults() {
		return results;
	}

	public void setResults(Restaurant[] results) {
		this.results = results;
	}

}
