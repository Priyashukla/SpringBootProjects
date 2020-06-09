package com.crudproject.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.crudproject.entity.product;
import com.crudproject.service.ProductService;
//to handle requests from the clients 
@Controller
public class ProductController {
        //we inject an instance of the ProductService class to this controller 
		@Autowired
		private ProductService service;
		
		//
		@RequestMapping("/")// maps HTTP requests to handler methods of MVC and REST controllers
		public String viewHomePage(Model model)//Model represents formal underlying data constructs that the View uses to present the user with the look and feel of the application
		{
			List<product> listProducts=service.listAll();
			model.addAttribute("listProducts",listProducts);//to read data from an existing model,
			
			return "index";
		}
		
		@RequestMapping("/new")
		public String showNewProductForm(Model model)
		{
		    product pro=new product();
		    model.addAttribute("product",pro);//used to inject data objects in the model 
			
			return "new_product";
		}
		
		@RequestMapping(value="/save",method=RequestMethod.POST)
		public String saveProduct(@ModelAttribute("product") product product)//@ModelAttribute to inject data objects in the model before a JSP loads
		{
		    service.save(product);
			
			return "redirect:/";
		}
		
		//ModelAndView merely holds both to make it possible for a controller to return both model and view in a single return value
		//@PathVariable is a Spring annotation which indicates that a method parameter should be bound to a URI template variable
		@RequestMapping("/edit/{id}")
		public ModelAndView showEditProductForm(@PathVariable(name="id") Integer id)
		{
		    ModelAndView mav=new ModelAndView("edit_product");
		    product product=service.get(id);
		    mav.addObject("product",product);//Add an attribute to the model.
			
			return mav;
		}
		
		@RequestMapping("/delete/{id}")
		public String deleteProductF(@PathVariable(name="id") Integer id)
		{
		   
		    service.delete(id);
			
			return "redirect:/";
		}
}
