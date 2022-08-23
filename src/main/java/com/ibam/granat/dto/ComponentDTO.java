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
 * Data Transfer Object (DTO) designed to handle Component related data
 * while working with controllers and services.
 */
@Data
@AllArgsConstructor
@Builder
@ApiModel(value = "Component", description = "Object considered for components of the parameters.")
public class ComponentDTO implements Serializable {

    /**
     * Field considered to indicate a component in a list of all available components.
     */
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @ApiModelProperty(example = "3",
            value = "Field considered to indicate a component in a list of all available components.")
    private Long id;

    /**
     * Field considered for representing title of the field with snake case.
     */
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @ApiModelProperty(example = "phone_number",
            value = "Field considered for representing title of the field with snake case.")
    private String name;

    /**
     * Field considered to indicate the type of the component.
     * For example, INPUT, SELECT.
     */
    @JsonProperty(access = JsonProperty.Access.READ_ONLY, value = "component_type")
    @ApiModelProperty(example = "INPUT",
            value = "Field considered to indicate the type of the component.",
            allowableValues = "INPUT, HIDDEN, SELECT")
    private String componentType;

    /**
     * Field considered for the type of input.
     * For example, NUMBER, TEXT.
     */
    @JsonProperty(access = JsonProperty.Access.READ_ONLY, value = "input_type")
    @ApiModelProperty(example = "NUMBER",
            value = "Field considered for the type of input.",
            allowableValues = "NONE, NUMBER, TEXT")
    private String inputType;

    /**
     * Field considered for the regular expression that predetermined for the component.
     */
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @ApiModelProperty(example = "^[0-9]{7}$",
            value = "Field considered for the regular expression that predetermined for the component.")
    private String regex;

    /**
     * Field considered to indicate the format of the input while displaying.
     * For example, "657 32 45"
     */
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @ApiModelProperty(example = "### ## ##",
            value = "Field considered to indicate the format of the input while displaying.")
    private String mask;

    /**
     * Field considered for the input field itself.
     *
     * <p>This field is different than title, because title field is the name of the component,
     * but placeholder describes input field. Whenever user enters an input, it disappears.
     */
    @JsonProperty(access = JsonProperty.Access.READ_ONLY, value = "place_holder")
    @ApiModelProperty(example = "Phone number", value = "Field considered for the describing input field itself.",
            notes = "This field is different than title, because title field is the name of the component, "
                    + "but placeholder describes input field. Whenever user enters an input, it disappears.")
    private String placeHolder;

    /**
     * Field considered for the place of the component while displaying.
     */
    @JsonProperty(access = JsonProperty.Access.READ_ONLY, value = "display_order")
    @ApiModelProperty(example = "1", value = "Field considered for the place of the component while displaying.")
    private int displayOrder;

    /**
     * Field considered for values of the component.
     * Since one value has several additional details,
     * it is represented in <code>ValueDTO</code>.
     *
     * @see ValueDTO
     */
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @ApiModelProperty(value = "Field considered for values of the component.")
    private List<ValueDTO> values;
}
