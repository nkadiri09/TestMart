package org.koushik.javabrain;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.koushik.javabrain.business.ProductServiceImpl;

@WebService
public class ProductCatalog {

	ProductServiceImpl productService = new ProductServiceImpl();

	@WebMethod
	public List<String> getProductCategories() {
		return productService.getProductCategories();
	}
	@WebMethod(exclude=true)
	public List<String> getProduct(String category) {
		return productService.getProductService(category);
	}
	@WebMethod(exclude=true)
	public boolean addProduct(String category, String product) {
		return productService.addProduct(category, product);

	}

}
