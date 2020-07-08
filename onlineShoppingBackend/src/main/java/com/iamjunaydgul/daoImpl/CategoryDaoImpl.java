package com.iamjunaydgul.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.iamjunaydgul.dao.CategoryDAO;
import com.iamjunaydgul.dto.Category;

@Repository("categoryDAO")
public class CategoryDaoImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();

	static {
		Category category = new Category();
		category.setId(1);
		category.setName("Television");
		category.setDescription("This is some description for television");
		category.setImageURL(".png");
		category.setActive(false);
		categories.add(category);
	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) { // TODO Auto-generated method stub
		for (Category category : categories) {
			if (category.getId() == id)
				return category;
		}
		return null;
	}

}
