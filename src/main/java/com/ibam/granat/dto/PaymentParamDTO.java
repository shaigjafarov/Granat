
package com.ibam.granat.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Data Transfer Object (DTO) designed to handle parameters of the Payment
 * while working with controllers and services.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonNaming(value = PropertyNamingStrategy.SnakeCaseStrategy.class)
@ApiModel(value = "Payment Param", description = "Object considered for each parameter of the payment.")
public class PaymentParamDTO implements Comparable<PaymentParamDTO> {

    @ApiModelProperty(example = "component_id", value = "Field considered for component id parameter.")
    @Positive(message = "IBAM-PAYMENTS-BIZ-VALIDATION-225")
    private Long componentId;
    /**
     * Field considered for name of the parameter.
     */
    @ApiModelProperty(example = "prefix", value = "Field considered for name of the parameter.")
    @NotBlank(message = "IBAM-PAYMENTS-BIZ-VALIDATION-210")
    private String name;

    /**
     * Field considered for the parameter value and its details.
     *
     * @see ValueDTO
     */
    @ApiModelProperty(value = "Field considered for the value of the parameter.")
    @NotNull(message = "IBAM-PAYMENTS-BIZ-VALIDATION-211")
    @Valid
    private String value;

    /**
     * Field considered for the place of parameter while displaying.
     */
    @ApiModelProperty(example = "1", value = "Field considered for the place of parameter while displaying.")
    @NotNull(message = "IBAM-PAYMENTS-BIZ-VALIDATION-215")
    @Positive(message = "IBAM-PAYMENTS-BIZ-VALIDATION-214")
    private Integer displayOrder;

    @Override
    public int compareTo(PaymentParamDTO param) {
        return param.displayOrder > this.displayOrder ? -1 : 1;
    }
}
