package com.ibam.granat.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Log
@ApiModel(value = "Customer Info",
        description = "Object considered for parameters that required for retrieving payment related details.")
public class CustomerInfoDTO {

    /**
     * Field considered for the id of the merchant from whom customer information is requested.
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY, value = "merchant_id")
    @NotNull(message = "IBAM-PAYMENTS-BIZ-VALIDATION-201")
    @ApiModelProperty(example = "44",
            value = "Field considered for the id of the merchant from whom customer information is requested.")
    private Long merchantId;

    @ApiModelProperty(hidden = true)
    private String merchantName;

    /**
     * Parameters that are required to retrieve customer information from merchant.
     * Since there dozens of details related to Payment parameters,
     * <code>PaymentParam</code> was used to handle these data.
     *
     * @see PaymentParamDTO
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY, value = "payment_params")
    @NotEmpty(message = "IBAM-PAYMENTS-BIZ-VALIDATION-209")
    @Valid
    @ApiModelProperty(value = "Parameters that are required to retrieve customer information from merchant.")
    private List<PaymentParamDTO> paymentParams;
}
