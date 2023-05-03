package com.extrawest.ocpp_2_0_1.features.client;

import com.extrawest.ocpp_2_0_1.constants.FeatureConstants;
import com.extrawest.common.feature.Feature;
import com.extrawest.ocpp_2_0_1.features.client.handlers.IClientGetLogRequestHandler;
import com.extrawest.common.model.Confirmation;
import com.extrawest.common.model.Request;
import com.extrawest.ocpp_2_0_1.model.request.GetLogRequest;
import com.extrawest.ocpp_2_0_1.model.response.GetLogResponse;

import java.util.UUID;

public class GetLogFeature implements Feature {
    private final IClientGetLogRequestHandler handler;

    public GetLogFeature(IClientGetLogRequestHandler handler) {
        this.handler = handler;
    }

    @Override
    public Confirmation handleRequest(UUID sessionIndex, Request request) {
        return handler.handleGetLogRequest((GetLogRequest) request);
    }

    @Override
    public Class<? extends Request> getRequestType() {
        return GetLogRequest.class;
    }

    @Override
    public Class<? extends Confirmation> getConfirmationType() {
        return GetLogResponse.class;
    }

    @Override
    public String getAction() {
        return FeatureConstants.GET_LOG.value();
    }
}
