package com.ibam.granat.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * Data Transfer Object (DTO) designed to handle data related to Category
 * while working with controllers and services.
 */
@Data
@AllArgsConstructor
@Builder
@ApiModel(value = "Category", description = "Object considered for properties of category.")
public class CategoryDTO implements Serializable {

    private static final long serialVersionUID = -6529685098267757691L;

    /**
     * Field considered for the id of the category.
     */
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @ApiModelProperty(example = "11", value = "Field considered for the id of the category.")
    private long id;

    /**
     * Field considered for the name of the category.
     */
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @ApiModelProperty(example = "Mobile", value = "Field considered for the name of the category.")
    private String name;

    /**
     * Field considered for the title of the category.
     */
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @ApiModelProperty(example = "Mobile", value = "Field considered for the title of the category.",
            notes = "Usually, name and title fields use the same values.")
    private String title;

    /**
     * Field considered for the place of the category in category list.
     */
    @JsonProperty(value = "display_order", access = JsonProperty.Access.READ_ONLY)
    @ApiModelProperty(example = "1", value = "Field considered for the place of the category in category list.")
    private int displayOrder;

    /**
     * Field considered for the url address that logo of the category is saved.
     */
    @JsonProperty(value = "logo_url", access = JsonProperty.Access.READ_ONLY)
    @ApiModelProperty(example = "https://mbanking.ibar.az/static/new_ibam/categories/mobile.png",
            value = "Field considered for the url address that logo of the category is saved.")
    private String logoUrl;

}
