package com.extrawest.ocpp_2_0_1.features.client;

import com.extrawest.ocpp_2_0_1.constants.FeatureConstants;
import com.extrawest.common.feature.Feature;
import com.extrawest.ocpp_2_0_1.features.client.handlers.IClientRequestStartTransactionRequestHandler;
import com.extrawest.common.model.Confirmation;
import com.extrawest.common.model.Request;
import com.extrawest.ocpp_2_0_1.model.request.RequestStartTransactionRequest;
import com.extrawest.ocpp_2_0_1.model.response.RequestStartTransactionResponse;

import java.util.UUID;

public class RequestStartTransactionFeature implements Feature {
    private final IClientRequestStartTransactionRequestHandler handler;

    public RequestStartTransactionFeature(IClientRequestStartTransactionRequestHandler handler) {
        this.handler = handler;
    }

    @Override
    public Confirmation handleRequest(UUID sessionIndex, Request request) {
        return handler.handleRequestStartTransactionRequest((RequestStartTransactionRequest) request);
    }

    @Override
    public Class<? extends Request> getRequestType() {
        return RequestStartTransactionRequest.class;
    }

    @Override
    public Class<? extends Confirmation> getConfirmationType() {
        return RequestStartTransactionResponse.class;
    }

    @Override
    public String getAction() {
        return FeatureConstants.REQUEST_START_TRANSACTION.value();
    }
}
