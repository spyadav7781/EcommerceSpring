package com.ecommerce.ecommercespring.services;

import com.ecommerce.ecommercespring.dto.CategoryDTO;
import com.ecommerce.ecommercespring.entity.Category;
import com.ecommerce.ecommercespring.gateway.ICategoryGateway;
import com.ecommerce.ecommercespring.mappers.CategoryMapper;
import com.ecommerce.ecommercespring.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class FakeStoreCategoryService implements ICategoryService {


    private final ICategoryGateway categoryGateway;

    public FakeStoreCategoryService(
            @Qualifier("fakeStoreRestTemplateGateway") ICategoryGateway categoryGateway) {
        this.categoryGateway = categoryGateway;
    }

    @Override
    public List<CategoryDTO> getAllCategories() throws IOException {
        return this.categoryGateway.getAllCategories();
    }

    public CategoryDTO createCategory(CategoryDTO categoryDTO) {
        //Not Implemented
        return null;
    }

    public CategoryDTO getByName(String name) throws Exception {
        //Not Implemented
        return null;
    }
}