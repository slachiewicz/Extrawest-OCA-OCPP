package com.extrawest.ocpp_2_0_1.features.server;

import com.extrawest.ocpp_2_0_1.constants.FeatureConstants;
import com.extrawest.common.feature.Feature;
import com.extrawest.ocpp_2_0_1.features.server.handlers.IServerNotifyCustomerInformationRequestHandler;
import com.extrawest.common.model.Confirmation;
import com.extrawest.common.model.Request;
import com.extrawest.ocpp_2_0_1.model.request.NotifyCustomerInformationRequest;
import com.extrawest.ocpp_2_0_1.model.response.NotifyCustomerInformationResponse;

import java.util.UUID;

public class NotifyCustomerInformationFeature implements Feature {
    private final IServerNotifyCustomerInformationRequestHandler handler;

    public NotifyCustomerInformationFeature(IServerNotifyCustomerInformationRequestHandler handler) {
        this.handler = handler;
    }

    @Override
    public Confirmation handleRequest(UUID sessionIndex, Request request) {
        return handler.handleNotifyCustomerInformationRequest(sessionIndex, (NotifyCustomerInformationRequest) request);
    }

    @Override
    public Class<? extends Request> getRequestType() {
        return NotifyCustomerInformationRequest.class;
    }

    @Override
    public Class<? extends Confirmation> getConfirmationType() {
        return NotifyCustomerInformationResponse.class;
    }

    @Override
    public String getAction() {
        return FeatureConstants.NOTIFY_CUSTOMER_INFORMATION.value();
    }
}
