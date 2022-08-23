package com.ibam.granat.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.ibam.granat.dto.CustomerInfoDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import java.net.SocketTimeoutException;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = {"/payment", "/"})
@Api("Payment controller")
@ApiResponses(value = {
        @ApiResponse(code = 200, message = "Requested operation was successfully completed."),
        @ApiResponse(code = 401, message = "Unauthorized for requested operation."),
        @ApiResponse(code = 403, message = "Requested operation is not allowed."),
        @ApiResponse(code = 404, message = "Requested data was not found.")
})
public class PaymentController {


    @PostMapping(path = "/customer-info")
    @ApiOperation(httpMethod = "POST",
            value = "Get customer info by billing params",
            response = CustomerInfoResultDTO.class)
    public ResponseDTO<CustomerInfoResultDTO> customerInfo(
            @ApiParam(value = "Billing parameter details that are required to retrieve customer information.")
            @Valid @RequestBody CustomerInfoDTO customerInfoDTO,
            @RequestHeader(name = "Accept-Language", defaultValue = "az") String lang)
            throws SocketTimeoutException, JSONException, JsonProcessingException {
        return this.paymentService.getCustomerInfo(customerInfoDTO);
    }

}
