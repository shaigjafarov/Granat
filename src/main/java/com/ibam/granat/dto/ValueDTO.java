package com.ibam.granat.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import javax.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Data Transfer Object (DTO) designed to handle value and its properties
 * while working with controllers and services.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel(value = "Value", description = "Object considered for each value and its properties.")
public class ValueDTO implements Serializable {

    /**
     * Field considered for tha name of the value.
     */
    @ApiModelProperty(example = "city_Bakı", value = "Field considered for the name of the value.")
    @NotBlank(message = "IBAM-PAYMENTS-BIZ-VALIDATION-212")
    private String name;

    /**
     * Field considered for the value itself.
     */
    @ApiModelProperty(example = "12", value = "Field considered for the value itself.")
    @NotBlank(message = "IBAM-PAYMENTS-BIZ-VALIDATION-213")
    private String value;

    /**
     * Field considered for the label of the value.
     */
    @ApiModelProperty(example = "Bakı (12)", value = "Field considered for the label of the value.",
            notes = "For some ValueDTOs, this field and name field may contain the same information.")
    private String label;

    /**
     * Field considered for the place of the value in list of multiple values.
     */
    @ApiModelProperty(example = "1", value = "Field considered for the place of the value in list of multiple values.")
    @JsonProperty(value = "display_order")
    private Integer displayOrder;
}
