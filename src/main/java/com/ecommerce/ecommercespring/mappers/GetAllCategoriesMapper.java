package com.ecommerce.ecommercespring.mappers;

import com.ecommerce.ecommercespring.dto.CategoryDTO;
import com.ecommerce.ecommercespring.dto.FakeStoreCategoryResponseDto;

import java.util.List;

public class GetAllCategoriesMapper {

    public static FakeStoreCategoryResponseDto toFakeStoreCategoryDTO() {
        return null;
    }

    public static List<CategoryDTO> toCategoryDto(FakeStoreCategoryResponseDto dto) {
        return dto.getCategories().stream()
                .map(category -> CategoryDTO.builder()
                        .name(category)
                        .build())
                .toList();
    }
}
