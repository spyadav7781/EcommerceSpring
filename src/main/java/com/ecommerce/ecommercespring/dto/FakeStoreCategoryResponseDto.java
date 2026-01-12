package com.ecommerce.ecommercespring.dto;

import lombok.*;

import java.util.List;



@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FakeStoreCategoryResponseDto {
    private String status;

    private String message;

    private List<String> categories;
}
