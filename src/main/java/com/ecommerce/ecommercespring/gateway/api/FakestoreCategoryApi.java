package com.ecommerce.ecommercespring.gateway.api;

import com.ecommerce.ecommercespring.dto.FakeStoreCategoryResponseDto;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import retrofit2.Call;
import retrofit2.http.GET;

import java.io.IOException;

@Component
public interface FakestoreCategoryApi {
    @GET("/products/category")
    Call<FakeStoreCategoryResponseDto> getAllCategories() throws IOException;
}
