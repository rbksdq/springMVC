package controller;

import dao.ProductDao;
import entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.Date;
import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductDao productDao;

    @RequestMapping("/home")
    public String home(Model model)
    {
       List<Product> AllProduct = productDao.getProducts();
       model.addAttribute("product", AllProduct);
       return "home";

    }
    @RequestMapping("/Product")
    public String addProduct(Model model)
    {
        model.addAttribute("title", "Add Product");
        return "add_Product_form";
    }
    @RequestMapping(value = "/saveProduct", method = RequestMethod.POST)
    public String SaveProduct(@ModelAttribute Product product)
    {
        Date date = new Date();
        product.setCreatedDate(date);
        productDao.createProduct(product);
        return "add_Product_form";
    }
    @RequestMapping("/delete/{productId}")
    public String DeleteProduct(@PathVariable("productId") int productId)
    {
        this.productDao.deleteProduct(productId);
        return "add_Product_form";
    }
}
