package _13.audit.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import _13.audit.service.ProductService;


@Controller
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductService productService;

	@RequestMapping
	public String list(Model model) {
		model.addAttribute("products", productService.getAllProducts());
		return "13.audit.view/productList";
	}

	@RequestMapping("/all")
	public ModelAndView listAllProducts() {
		ModelAndView modelAndView = new ModelAndView();

		modelAndView.addObject("products", productService.getAllProducts());
		modelAndView.setViewName("13.audit.view//productList");
		return modelAndView;
	}

	@RequestMapping("/category/{productCategory}")
	public String listProductsByCategory(@PathVariable("productCategory") String productCategory, Model model) {
		model.addAttribute("products", productService.getProductsByCategory(productCategory));
		return "13.audit.view/productList";
	}

	@RequestMapping("/product")
	public String getProductById(@RequestParam(required = false, name = "id") String productId, Model model) {
		model.addAttribute("product", productService.getProductById(productId));
		return "13.audit.view/productDetail";
	}

	@RequestMapping("/brand/{brands}")
	public String listProductsByBrands(@MatrixVariable(pathVar = "brands") List<String> brands, Model model) {
		model.addAttribute("products", productService.getProductsByBrands(brands));
		return "13.audit.view/productList";
	}

}
