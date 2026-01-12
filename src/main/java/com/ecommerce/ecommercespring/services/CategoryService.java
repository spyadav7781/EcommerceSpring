package com.ecommerce.ecommercespring.services;

import com.ecommerce.ecommercespring.dto.CategoryDTO;
import com.ecommerce.ecommercespring.entity.Category;
import com.ecommerce.ecommercespring.mappers.CategoryMapper;
import com.ecommerce.ecommercespring.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService implements ICategoryService {

    private final CategoryRepository repo;

    public CategoryService(CategoryRepository repo) {
        this.repo = repo;
    }

    @Override
    public List<CategoryDTO> getAllCategories() {
        List<CategoryDTO> dtos = new ArrayList<>();
        for (Category category : repo.findAll()) {
            dtos.add(CategoryMapper.toDto(category));
        }
        return dtos;
    }

    @Override
    public CategoryDTO createCategory(CategoryDTO categoryDTO) {
        Category category = CategoryMapper.toEntity(categoryDTO);
        Category saved = repo.save(category);
        return CategoryMapper.toDto(saved);
    }

    @Override
    public CategoryDTO getByName(String name) throws Exception {
        Category category = repo.findByName(name)
                .orElseThrow(() -> new Exception("Category not found with name: " + name));

        return CategoryMapper.toDto(category);

    }
}