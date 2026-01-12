package com.ecommerce.ecommercespring.services;
import com.ecommerce.ecommercespring.dto.CategoryDTO;

import java.util.List;

public interface ICategoryService {
    List<CategoryDTO> getAllCategories() throws Exception;

    CategoryDTO createCategory(CategoryDTO categoryDTO);

    CategoryDTO getByName(String name) throws Exception;
}
