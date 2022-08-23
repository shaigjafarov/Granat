package com.ibam.granat.controller;

import com.ibam.granat.dto.CategoryDTO;
import com.ibam.granat.dto.MerchantDTO;
import com.ibam.granat.dto.ResponseDTO;
import com.ibam.granat.service.CategoryService;
import com.ibam.granat.service.MerchantService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/")
public class MerchantController {
    @Autowired
    CategoryService categoryService;

    @Autowired
    MerchantService merchantService;

    @GetMapping(value = "/categories/{id}/merchants")
    public ResponseDTO<List<MerchantDTO>> getMerchantsByCategoryId(
            @PathVariable(required = true, name = "id") int categoryId,
            @RequestHeader(value = "Accept-Language", defaultValue = "az") String language,
            @RequestHeader(value = "X-App-Version", required = false) String apiVersion) {
        return  this.merchantService.findByCategoryId();
    }


    @GetMapping("/categories")
    public ResponseDTO<List<CategoryDTO>> getCategories(
            @RequestHeader(value = "Accept-Language", defaultValue = "az") String language) {
        return this.categoryService.listCategories();
    }

}
