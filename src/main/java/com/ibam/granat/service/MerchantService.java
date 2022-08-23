package com.ibam.granat.service;

import com.ibam.granat.dto.MerchantDTO;
import com.ibam.granat.dto.ResponseDTO;
import java.util.List;

public interface MerchantService {
    ResponseDTO<List<MerchantDTO>> findByCategoryId();
}
