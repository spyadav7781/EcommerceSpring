package com.ecommerce.ecommercespring.gateway;

import com.ecommerce.ecommercespring.dto.CategoryDTO;
import com.ecommerce.ecommercespring.dto.FakeStoreCategoryResponseDto;
import com.ecommerce.ecommercespring.gateway.api.FakestoreCategoryApi;
import com.ecommerce.ecommercespring.mappers.GetAllCategoriesMapper;
import org.springframework.boot.autoconfigure.couchbase.CouchbaseProperties;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

@Component
public class FakeStoreCategoryGateway implements ICategoryGateway{
    private final FakestoreCategoryApi fakestoreCategoryApi;

    public FakeStoreCategoryGateway(FakestoreCategoryApi fakestoreCategoryApi){
        this.fakestoreCategoryApi = fakestoreCategoryApi;
    }

    @Override
    public List<CategoryDTO> getAllCategories() throws IOException {
        // 1. Make the HTTP request to the FakeStore API to fetch all categories
        FakeStoreCategoryResponseDto response = this.fakestoreCategoryApi.getAllCategories().execute().body();

        // 2. Check if the response is null and throw an IOException if it is
        if(response == null) {
            throw new IOException("Failed to fetch categories from FakeStore API");
        }

        // 3. Map the response to a list of CategoryDTO objects
        return GetAllCategoriesMapper.toCategoryDto(response);
    }
}
