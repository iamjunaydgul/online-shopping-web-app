package com.iamjunaydgul.dao;

import java.util.List;

import com.iamjunaydgul.dto.Category;

public interface CategoryDAO {
	List<Category> list();

	Category get(int id);
}
