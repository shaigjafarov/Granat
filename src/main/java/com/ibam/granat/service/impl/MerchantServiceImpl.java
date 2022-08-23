package com.ibam.granat.service.impl;

import com.ibam.granat.dto.AmountOptionDTO;
import com.ibam.granat.dto.CategoryDTO;
import com.ibam.granat.dto.ComponentDTO;
import com.ibam.granat.dto.MerchantDTO;
import com.ibam.granat.dto.MerchantDTO.MerchantDTOBuilder;
import com.ibam.granat.dto.MerchantParamDTO;
import com.ibam.granat.dto.ResponseDTO;
import com.ibam.granat.dto.ValueDTO;
import com.ibam.granat.service.MerchantService;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class MerchantServiceImpl implements MerchantService {

    public ResponseDTO<List<MerchantDTO>> findByCategoryId() {

        ValueDTO valueDTO1 = ValueDTO.builder()
                .name("50")
                .value("050")
                .displayOrder(1).build();
        ValueDTO valueDTO2 = ValueDTO.builder()
                .name("51")
                .value("051")
                .displayOrder(2).build();

        ValueDTO valueDTO3 = ValueDTO.builder()
                .name("55")
                .value("055")
                .displayOrder(3).build();

        ValueDTO valueDTO4 = ValueDTO.builder()
                .name("70")
                .value("070")
                .displayOrder(4).build();

        MerchantDTO merchantDTO = MerchantDTO.builder()
                .id(1L)
                .name("Azercell")
                .displayOrder(1)
                .logoUrl("https://images.ctfassets.net/rckhx7d9app2/64iWAS671q2x1G5hJx2J15/47c656745bcdb0c8dd2ea5ad4a02c05a/azercell.png")
                .param(MerchantParamDTO.builder()
                        .amountOptionDTO(AmountOptionDTO.builder().amountType("DECIMAL").maxAmount(BigDecimal.TEN).minAmount(BigDecimal.ONE).build())
                        .components(List.of(ComponentDTO.builder()
                                        .id(429L)
                                        .name("prefix")
                                        .mask("choose")
                                        .componentType("SELECT")
                                        .inputType("NONE")
                                        .placeHolder("Choose")
                                        .displayOrder(1)
                                        .values(List.of(valueDTO1, valueDTO2, valueDTO3, valueDTO4)).build(),
                                ComponentDTO.builder()
                                        .id(430L)
                                        .name("abon_code")
                                        .mask("### ## ##")
                                        .componentType("INPUT")
                                        .inputType("NUMBER")
                                        .displayOrder(2)
                                        .build()
                        ))
                        .build()).build();

        return ResponseDTO.<List<MerchantDTO>>builder().data(List.of(merchantDTO)).build();
    }
}
