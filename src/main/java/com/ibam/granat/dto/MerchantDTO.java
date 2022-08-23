package com.ibam.granat.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.extern.java.Log;

@Data
@AllArgsConstructor
@Builder
@Log
@ApiModel(value = "Merchant", description = "Object considered for properties and specifications of merchant.")
public class MerchantDTO implements Serializable {

    private static final long serialVersionUID = -6529685098267757690L;

    /**
     * Field considered for the id of merchant.
     */
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @ApiModelProperty(example = "1", value = "Field considered for the id of merchant.")
    private long id;

    /**
     * Field considered for the name of the merchant.
     */
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @ApiModelProperty(example = "Azercell", value = "Field considered for the name of the merchant.")
    private String name;

    /**
     * Field considered for the url address where logo of the merchant is saved.
     */
    @JsonProperty(access = JsonProperty.Access.READ_ONLY, value = "logo_url")
    @ApiModelProperty(example = "https://mbanking.ibar.az/static/new_ibam/logo/azercell.png",
            value = "Field considered for the url address where logo of the merchant is saved.")
    private String logoUrl;

    /**
     * Field considered for parameters that merchant has.
     * Since there are multiple details related to Merchant Parameter,
     * they are collected in <code>MerchantParamDTO</code>.
     *
     * @see MerchantParamDTO
     */
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @ApiModelProperty(value = "Field considered for parameters that merchant has.")
    private MerchantParamDTO param;

    /**
     * Field that indicates the place of the merchant in list of merchants which are grouped by category.
     */
    @JsonProperty(access = JsonProperty.Access.READ_ONLY, value = "display_order")
    @ApiModelProperty(example = "1",
            value = "Field that indicates the place of the merchant"
                    + " in list of merchants which are grouped by category.")
    private int displayOrder;

}