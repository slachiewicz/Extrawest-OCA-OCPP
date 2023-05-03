package com.extrawest.ocpp_2_0_1.features.client;

import com.extrawest.ocpp_2_0_1.constants.FeatureConstants;
import com.extrawest.common.feature.Feature;
import com.extrawest.ocpp_2_0_1.features.client.handlers.IClientGetDisplayMessagesRequestHandler;
import com.extrawest.common.model.Confirmation;
import com.extrawest.common.model.Request;
import com.extrawest.ocpp_2_0_1.model.request.GetDisplayMessagesRequest;
import com.extrawest.ocpp_2_0_1.model.response.GetDisplayMessagesResponse;

import java.util.UUID;

public class GetDisplayMessagesFeature implements Feature {
    private final IClientGetDisplayMessagesRequestHandler handler;

    public GetDisplayMessagesFeature(IClientGetDisplayMessagesRequestHandler handler) {
        this.handler = handler;
    }

    @Override
    public Confirmation handleRequest(UUID sessionIndex, Request request) {
        return handler.handleGetDisplayMessagesRequest((GetDisplayMessagesRequest) request);
    }

    @Override
    public Class<? extends Request> getRequestType() {
        return GetDisplayMessagesRequest.class;
    }

    @Override
    public Class<? extends Confirmation> getConfirmationType() {
        return GetDisplayMessagesResponse.class;
    }

    @Override
    public String getAction() {
        return FeatureConstants.GET_DISPLAY_MESSAGES.value();
    }
}
