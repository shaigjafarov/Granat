package com.ibam.granat.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * Data Transfer Object (DTO) designed to handle data related to parameter of the Merchant
 * while working with controllers and services.
 */
@Data
@AllArgsConstructor
@Builder
@ApiModel(value = "Merchant Param", description = "Object considered for each parameter of the Merchant.")
public class MerchantParamDTO implements Serializable {

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @ApiModelProperty(value = "Field considered for the list of components "
            + "that are required to make payment to the specific merchant.")
    private List<ComponentDTO> components;

    /**
     * Field considered to handle predefined amount limits of parameter.
     * <code>AmountOptionDTO</code> is used to keep these data.
     *
     * @see AmountOptionDTO
     */
    @JsonProperty(access = JsonProperty.Access.READ_ONLY, value = "amount_option")
    private AmountOptionDTO amountOptionDTO;

}
