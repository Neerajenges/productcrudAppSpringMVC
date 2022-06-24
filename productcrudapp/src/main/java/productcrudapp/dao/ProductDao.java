package productcrudapp.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import productcrudapp.model.Product;

@Component
public class ProductDao {
	@Autowired
	private HibernateTemplate hibernatetemplate;
	
	//create
	@Transactional
	public void createProduct(Product product) {
		//this.hibernatetemplate.save(product);--for saving fresh entry
		this.hibernatetemplate.saveOrUpdate(product);//for existing product having product id
	}
	//get all products
	public List<Product> getProducts(){
		
		List<Product> products=this.hibernatetemplate.loadAll(Product.class);
		return products;    
	}
	//delete the single product
	@Transactional
	public void deleteProduct(int pid) {
		Product p=this.hibernatetemplate.load(Product.class, pid);
		this.hibernatetemplate.delete(p);
		
	}
	//get the single product
	public Product getProduct(int pid) {
		return this.hibernatetemplate.get(Product.class,pid);
	}
}
