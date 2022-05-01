package dao;

import entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Component
public class ProductDao {
    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Transactional
    public void createProduct(Product product)
    {
        this.hibernateTemplate.save(product);
    }

    public List<Product> getProducts()
    {
        List<Product> allProduct = this.hibernateTemplate.loadAll(Product.class);
        return allProduct;

    }
    @Transactional
    public void deleteProduct(int pid)
    {
        Product p = this.hibernateTemplate.load(Product.class,pid);
        this.hibernateTemplate.delete(p);
    }
    public Product getProduct(int pid)
    {
        Product product = this.hibernateTemplate.load(Product.class, pid);
        return product;
    }

}
