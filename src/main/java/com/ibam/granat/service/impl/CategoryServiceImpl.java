package com.ibam.granat.service.impl;

import com.ibam.granat.dto.CategoryDTO;
import com.ibam.granat.dto.ResponseDTO;
import com.ibam.granat.service.CategoryService;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service(value = "categoryService")
@RequiredArgsConstructor
@Slf4j
public class CategoryServiceImpl implements CategoryService {

    /**
     * Field considered for an instance of <code>CategoryRepository</code> specified during instantiation.
     */


    @Override
    public ResponseDTO<List<CategoryDTO>> listCategories() {

        CategoryDTO mobile = CategoryDTO.builder()
                .id(11)
                .name("Mobil")
                .title("Mobil")
                .logoUrl("https://images.ctfassets.net/rckhx7d9app2/1Pdoybn7GiOrKulWftIN7I/8f9c0d61157d8c7a0e3a12b188001164/mobile.png")
                .displayOrder(1)
                .build();

       CategoryDTO komunal= CategoryDTO.builder()
                .id(13)
                .name("Kommunal")
                .title("Kommunal")
                .logoUrl( "https://images.ctfassets.net/rckhx7d9app2/7w1LT4gbBJFSxzqc92NMZH/db90dd289ad8ed1cd6faab2e0780f691/utilities.png")
                .displayOrder(2)
                .build();

       return ResponseDTO.<List<CategoryDTO>>builder().data(List.of(mobile,komunal)).build();
    }

}