package com.ecommerce.ecommercespring.configuration;


import com.ecommerce.ecommercespring.gateway.api.FakestoreCategoryApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Configuration
public class RetrofitConfig {

    @Bean
    public Retrofit retrofit() {
        return new Retrofit.Builder()
                .baseUrl("https://fakestoreapi.in/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    @Bean
    public FakestoreCategoryApi fakestoreCategoryApi(Retrofit retrofit){
        return retrofit.create(FakestoreCategoryApi.class);
    }

}
