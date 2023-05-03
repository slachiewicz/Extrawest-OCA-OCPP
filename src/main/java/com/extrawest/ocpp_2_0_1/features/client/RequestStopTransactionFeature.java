package com.extrawest.ocpp_2_0_1.features.client;

import com.extrawest.ocpp_2_0_1.constants.FeatureConstants;
import com.extrawest.common.feature.Feature;
import com.extrawest.ocpp_2_0_1.features.client.handlers.IClientRequestStopTransactionRequestHandler;
import com.extrawest.common.model.Confirmation;
import com.extrawest.common.model.Request;
import com.extrawest.ocpp_2_0_1.model.request.RequestStopTransactionRequest;
import com.extrawest.ocpp_2_0_1.model.response.RequestStopTransactionResponse;

import java.util.UUID;

public class RequestStopTransactionFeature implements Feature {
    private final IClientRequestStopTransactionRequestHandler handler;

    public RequestStopTransactionFeature(IClientRequestStopTransactionRequestHandler handler) {
        this.handler = handler;
    }

    @Override
    public Confirmation handleRequest(UUID sessionIndex, Request request) {
        return handler.handleRequestStopTransactionRequest((RequestStopTransactionRequest) request);
    }

    @Override
    public Class<? extends Request> getRequestType() {
        return RequestStopTransactionRequest.class;
    }

    @Override
    public Class<? extends Confirmation> getConfirmationType() {
        return RequestStopTransactionResponse.class;
    }

    @Override
    public String getAction() {
        return FeatureConstants.REQUEST_STOP_TRANSACTION.value();
    }
}
