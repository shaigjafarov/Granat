package com.ibam.granat.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * Data Transfer Object (DTO) designed to handle data related to the Amount specified in parameters
 * while working with controllers and services.
 *
 * <p>Main purpose of this object is to manage predefined limits of the amount required.
 */
@Data
@Builder
@AllArgsConstructor
@ApiModel(value = "Amount", description = "Object considered for predefined limits of amount.")
public class AmountOptionDTO implements Serializable {
    /**
     * Field considered to indicate the predefined minimum limit that can be paid.
     */
    @JsonProperty(access = JsonProperty.Access.READ_ONLY, value = "min_amount")
    @ApiModelProperty(example = "1",
            value = "Field considered to indicate the predefined minimum limit that can be paid.")
    private BigDecimal minAmount;

    /**
     * Field considered to indicate the predefined maximum limit that can be paid.
     */
    @JsonProperty(access = JsonProperty.Access.READ_ONLY, value = "max_amount")
    @ApiModelProperty(example = "100",
            value = "Field considered to indicate the predefined maximum limit that can be paid.")
    private BigDecimal maxAmount;

    /**
     * Field considered to indicate the type of amount (integer, decimal ...)
     */
    @JsonProperty(access = JsonProperty.Access.READ_ONLY, value = "amount_type")
    @ApiModelProperty(example = "DECIMAL",
            value = "Field considered to indicate the type of amount (integer, decimal ...)")
    private String amountType;
}
