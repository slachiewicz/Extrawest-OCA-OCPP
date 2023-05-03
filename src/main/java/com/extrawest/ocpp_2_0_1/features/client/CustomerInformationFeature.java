package com.extrawest.ocpp_2_0_1.features.client;

import com.extrawest.ocpp_2_0_1.constants.FeatureConstants;
import com.extrawest.common.feature.Feature;
import com.extrawest.ocpp_2_0_1.features.client.handlers.IClientCustomerInformationRequestHandler;
import com.extrawest.common.model.Confirmation;
import com.extrawest.common.model.Request;
import com.extrawest.ocpp_2_0_1.model.request.CustomerInformationRequest;
import com.extrawest.ocpp_2_0_1.model.response.CustomerInformationResponse;

import java.util.UUID;

public class CustomerInformationFeature implements Feature {
    private final IClientCustomerInformationRequestHandler handler;

    public CustomerInformationFeature(IClientCustomerInformationRequestHandler handler) {
        this.handler = handler;
    }

    @Override
    public Confirmation handleRequest(UUID sessionIndex, Request request) {
        return handler.handleCustomerInformationRequest((CustomerInformationRequest) request);
    }

    @Override
    public Class<? extends Request> getRequestType() {
        return CustomerInformationRequest.class;
    }

    @Override
    public Class<? extends Confirmation> getConfirmationType() {
        return CustomerInformationResponse.class;
    }

    @Override
    public String getAction() {
        return FeatureConstants.CUSTOMER_INFORMATION.value();
    }
}
