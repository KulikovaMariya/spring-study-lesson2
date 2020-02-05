package ru.geekbrains.springdata.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.geekbrains.entity.Product;
import ru.geekbrains.springdata.service.ProductService;

import java.util.List;

@Controller
@RequestMapping("/productsnew")
public class ProductController {
    private ProductService productService;

    @Autowired
    public void  setProductService(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showAllProducts(Model uiModel) {
        System.out.println("start showAllProducts");
        List<Product> productList = productService.getAll();
        uiModel.addAttribute("products", productList);
        System.out.println("end showAllProducts " + productList.size());
        return "home";
    }

    @RequestMapping(value = "/mincost/{minCost}", method = RequestMethod.GET)
    public String findByCostGreaterThanEqual(Model uiModel, @PathVariable(value = "minCost") Long minCost) {
        List<Product> products = productService.findByCostLessThanEqual(minCost);
        uiModel.addAttribute("products", products);
        return "home";
    }

    @RequestMapping(value = "/maxcost/{maxCost}", method = RequestMethod.GET)
    public String findByCostLessThanEqual(Model uiModel, @PathVariable(value = "maxCost") Long maxCost) {
        List<Product> products = productService.findByCostGreaterThanEqual(maxCost);
        uiModel.addAttribute("products", products);
        return "home";
    }

    @RequestMapping("/newProduct")
    public String addNewProduct(Model uiModel) {
        uiModel.addAttribute("product", new Product());
        return "productForm";
    }
}
