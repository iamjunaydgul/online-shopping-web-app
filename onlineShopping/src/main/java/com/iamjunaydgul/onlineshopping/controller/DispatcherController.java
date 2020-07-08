package com.iamjunaydgul.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.iamjunaydgul.dao.CategoryDAO;
import com.iamjunaydgul.dto.Category;

@Controller
public class DispatcherController {

	@Autowired
	private CategoryDAO categoryDAO;

	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Home");
		mv.addObject("userClickHome", true);
		/* adding static categories from backend project */
		mv.addObject("categories", categoryDAO.list());
		return mv;
	}

	@RequestMapping(value = { "/about" })
	public ModelAndView about() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "About");
		mv.addObject("userClickAbout", true);
		return mv;
	}

	@RequestMapping(value = { "/contact" })
	public ModelAndView contact() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Contact");
		mv.addObject("userClickContact", true);
		return mv;
	}

	/* loading all products based on category */

	@RequestMapping(value = "/show/all/products")
	public ModelAndView showAllProducts() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "AllProducts");
		mv.addObject("userClickAllProducts", true);
		// adding static categories from backend project
		mv.addObject("categories", categoryDAO.list());
		return mv;
	}

	@RequestMapping(value = "/show/category/{id}/products")
	public ModelAndView showCategoryProducts(@PathVariable("id") int id) {
		ModelAndView mv = new ModelAndView("page");
		// categoryDAO for fetching category name
		Category category = null;
		category = categoryDAO.get(id);
		mv.addObject("title", category.getName());
		// passing single activity based on id
		mv.addObject("category", category);
		mv.addObject("userClickCategoryProducts", true);
		// adding static categories from backend project passing list of categories
		mv.addObject("categories", categoryDAO.list());
		return mv;
	}

}
