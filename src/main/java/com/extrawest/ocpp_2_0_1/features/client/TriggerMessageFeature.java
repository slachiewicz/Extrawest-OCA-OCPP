package com.extrawest.ocpp_2_0_1.features.client;

import com.extrawest.ocpp_2_0_1.constants.FeatureConstants;
import com.extrawest.common.feature.Feature;
import com.extrawest.ocpp_2_0_1.features.client.handlers.IClientTriggerMessageRequestHandler;
import com.extrawest.common.model.Confirmation;
import com.extrawest.common.model.Request;
import com.extrawest.ocpp_2_0_1.model.request.TriggerMessageRequest;
import com.extrawest.ocpp_2_0_1.model.response.TriggerMessageResponse;

import java.util.UUID;

public class TriggerMessageFeature implements Feature {
    private final IClientTriggerMessageRequestHandler handler;

    public TriggerMessageFeature(IClientTriggerMessageRequestHandler handler) {
        this.handler = handler;
    }

    @Override
    public Confirmation handleRequest(UUID sessionIndex, Request request) {
        return handler.handleTriggerMessageRequest((TriggerMessageRequest) request);
    }

    @Override
    public Class<? extends Request> getRequestType() {
        return TriggerMessageRequest.class;
    }

    @Override
    public Class<? extends Confirmation> getConfirmationType() {
        return TriggerMessageResponse.class;
    }

    @Override
    public String getAction() {
        return FeatureConstants.TRIGGER_MESSAGE.value();
    }
}
