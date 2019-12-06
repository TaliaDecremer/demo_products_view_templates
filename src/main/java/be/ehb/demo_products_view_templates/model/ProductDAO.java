package be.ehb.demo_products_view_templates.model;

import org.springframework.data.repository.CrudRepository;
//integer = parameter van primary key
public interface ProductDAO extends CrudRepository<Product,Integer> {
}

