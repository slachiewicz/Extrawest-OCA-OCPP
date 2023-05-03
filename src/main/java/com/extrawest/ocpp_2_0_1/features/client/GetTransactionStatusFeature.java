package com.extrawest.ocpp_2_0_1.features.client;

import com.extrawest.ocpp_2_0_1.constants.FeatureConstants;
import com.extrawest.common.feature.Feature;
import com.extrawest.ocpp_2_0_1.features.client.handlers.IClientGetTransactionStatusRequestHandler;
import com.extrawest.common.model.Confirmation;
import com.extrawest.common.model.Request;
import com.extrawest.ocpp_2_0_1.model.request.GetTransactionStatusRequest;
import com.extrawest.ocpp_2_0_1.model.response.GetTransactionStatusResponse;

import java.util.UUID;

public class GetTransactionStatusFeature implements Feature {
    private final IClientGetTransactionStatusRequestHandler handler;

    public GetTransactionStatusFeature(IClientGetTransactionStatusRequestHandler handler) {
        this.handler = handler;
    }

    @Override
    public Confirmation handleRequest(UUID sessionIndex, Request request) {
        return handler.handleGetTransactionRequest((GetTransactionStatusRequest) request);
    }

    @Override
    public Class<? extends Request> getRequestType() {
        return GetTransactionStatusRequest.class;
    }

    @Override
    public Class<? extends Confirmation> getConfirmationType() {
        return GetTransactionStatusResponse.class;
    }

    @Override
    public String getAction() {
        return FeatureConstants.GET_TRANSACTION_STATUS.value();
    }
}
