package com.ibam.granat.service;

import com.ibam.granat.dto.CategoryDTO;
import com.ibam.granat.dto.ResponseDTO;
import java.util.List;

public interface CategoryService {

    /**
     * Fetches and returns all currently available categories in a list of <code>CategoryDTO</code>.
     *
     * @return {@code ResponseDTO} filled with list of categories
     * @see CategoryDTO
     */
    ResponseDTO<List<CategoryDTO>> listCategories();

}
