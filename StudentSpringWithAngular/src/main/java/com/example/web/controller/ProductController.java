package com.example.web.controller;



import java.io.IOException;
import java.util.Base64;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import com.example.web.model.Product;
import com.example.web.repository.ProductRepository;
import com.example.web.service.ProductServiceImpl;

@Controller
public class ProductController {

	@Autowired
	private ProductRepository repository;
	
	@Autowired
	private ProductServiceImpl impl;

	@GetMapping("/allProducts")
	public String viewHomePage(Model model,@Param("keyword") String keyword) {
		 List<Product> listProducts = impl.listAll(keyword);
	        model.addAttribute("listProducts", listProducts);
	        model.addAttribute("keyword", keyword);
			return "list_Products";
	}
	
	
//	@RequestMapping(value = "/addProduct",method = RequestMethod.GET)
//	@ResponseBody
//	public ModelAndView returnAddProduct()
//	{
//	  ModelAndView mv = new ModelAndView();
//	  mv.setViewName("addProduct");
//	  //mv.addObject("var", "halim");
//	  return mv;
//	  
//	}
//	
//	@RequestMapping(value = "/listProduct",method = RequestMethod.GET)
//	@ResponseBody
//	public ModelAndView returnListProduct()
//	{
//	  ModelAndView mv = new ModelAndView();
//	  List<Product> products = productRepo.findAll();
//	  mv.setViewName("listProducts");
//	  mv.addObject("products", products);
//	  return mv;
//	  
//	}
	

	@GetMapping("/new")
	public String showNew(Model model, MultipartFile multipartFile) {
		Product product = new Product();
		model.addAttribute("product", product);
		return "new_product";
	}
	
	 @PostMapping("/save")
	 public String saveProduct(@RequestParam("file") MultipartFile file,@ModelAttribute("product") Product product)
	    {
		 	String fileName = StringUtils.cleanPath(file.getOriginalFilename());
			if(fileName.contains(".."))
			{
				System.out.println("not a a valid file");
			}
			try {
				product.setImage(Base64.getEncoder().encodeToString(file.getBytes()));
			} catch (IOException e) {
				e.printStackTrace();
			}
		 	repository.save(product);
	    	return "redirect:/allProducts";
	    }

//	@PostMapping("/save")
//	public String saveProduct(@ModelAttribute("product") Product product) {
//		repository.save(product);
//		return "redirect:/allProducts";
//	}

	@GetMapping("/editProducts/{id}")
	public String showEditProductPage(@PathVariable("id") Integer id, Model model) {
			Product product = repository.getById(id);
			System.out.println(product);
			model.addAttribute("product", product);
			return "edit_Product";
	}

	@PostMapping("/updateProducts/{id}")
	public String updateProducts(@PathVariable("id") Integer id, @Valid Product product,@RequestParam("file") MultipartFile file,BindingResult result,
			Model model) {
		if (result.hasErrors()) {
			product.setUniqueId(id);
			return "edit_Product";
		}
		impl.saveProductToDB(file, product);
		model.addAttribute("product", repository.findAll());
		return "redirect:/allProducts";
	}

	@GetMapping("/deleteProducts/{id}")
	public String deleteProduct(@PathVariable("id") Integer id) {
			repository.deleteById(id);
			return "redirect:/allProducts";
	}

//	@GetMapping("/")
//    public String viewHomePage(Model model, @Param("keyword") String keyword) {
//        List<Product> listProducts = serviceImpl.listAll(keyword);
//        model.addAttribute("listProducts", listProducts);
//        model.addAttribute("keyword", keyword);
//        return "redirect:/usersback";
//    }

}

//@GetMapping("/editProducts/{id}")
//public ModelAndView showEditProductPage(@PathVariable("id") String id) {
//	ModelAndView mav = new ModelAndView("edit_product");
//	Product product = repository.getById(id);
//	mav.addObject("product", product);
//	return mav;
//}

//
//@PostMapping("newProduct")
//  public String addStudent(@Valid Product product, BindingResult result, Model model) {
//      if (result.hasErrors()) {
//          return "AdminProductEditForm";
//      }
//
//      serviceImpl.addProduct(product);
//      return "redirect:adminProducts";
//  }

//@PostMapping("/save")
//public String saveProduct(@ModelAttribute("product") Product product, @RequestParam("image") MultipartFile multipartFile) throws IOException {
//	String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
//	product.setPhotos(fileName);
//	Product savedPro = repository.save(product);
//    String uploadDir = "user-photos/" + savedPro.getProductId();
//    FileUploadUtil.saveFile(uploadDir, fileName, multipartFile);
//    repository.save(product);
//    //return new RedirectView("/allProducts", true);
//    
//	return "redirect:/allProducts";
//}