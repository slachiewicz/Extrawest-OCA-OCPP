package com.extrawest.ocpp_2_0_1.features.client.handlers;

import com.extrawest.ocpp_2_0_1.model.request.CustomerInformationRequest;
import com.extrawest.ocpp_2_0_1.model.response.CustomerInformationResponse;

/** Charging Station handler of {@link CustomerInformationRequest} */
public interface IClientCustomerInformationRequestHandler {
    CustomerInformationResponse handleCustomerInformationRequest(CustomerInformationRequest request);
}
