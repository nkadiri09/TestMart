package org.koushik.javabrain.business;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl {

	List<String> bookList = new ArrayList<>();
	List<String> moviesList = new ArrayList<>();
	List<String> musicList = new ArrayList<>();

	public ProductServiceImpl() {
		bookList.add("Balaram");
		bookList.add("krishna");
		bookList.add("Ram");

		moviesList.add("Bahubali");
		moviesList.add("Kick2");
		moviesList.add("khidhi");

		musicList.add("Melody");
		musicList.add("PoP");
		musicList.add("Jazz");
	}

	public List<String> getProductCategories() {

		List<String> categories = new ArrayList<>();
		categories.add("books");
		categories.add("Music");
		categories.add("Movies");
		return categories;
	}

	public List<String> getProductService(String category) {
		switch (category.toLowerCase()) {
		case "books":
			return bookList;
		case "music":
			return musicList;
		case "movies":
			return moviesList;
		}
		return null;
	}

	public boolean addProduct(String category, String product) {
		switch (category.toLowerCase()) {
		case "books":
			bookList.add(product);
			break;
		case "music":
			musicList.add(product);
			break;
		case "movies":
			moviesList.add(product);
			break;
		default:
			return false;
		}
		return true;

	}

}
