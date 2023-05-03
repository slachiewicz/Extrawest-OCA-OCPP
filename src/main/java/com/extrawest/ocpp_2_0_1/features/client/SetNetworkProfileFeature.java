package com.extrawest.ocpp_2_0_1.features.client;

import com.extrawest.ocpp_2_0_1.constants.FeatureConstants;
import com.extrawest.common.feature.Feature;
import com.extrawest.ocpp_2_0_1.features.client.handlers.IClientSetNetworkProfileRequestHandler;
import com.extrawest.common.model.Confirmation;
import com.extrawest.common.model.Request;
import com.extrawest.ocpp_2_0_1.model.request.SetNetworkProfileRequest;
import com.extrawest.ocpp_2_0_1.model.response.SetNetworkProfileResponse;

import java.util.UUID;

public class SetNetworkProfileFeature implements Feature {
    private final IClientSetNetworkProfileRequestHandler handler;

    public SetNetworkProfileFeature(IClientSetNetworkProfileRequestHandler handler) {
        this.handler = handler;
    }

    @Override
    public Confirmation handleRequest(UUID sessionIndex, Request request) {
        return handler.handleSetNetworkProfileRequest((SetNetworkProfileRequest) request);
    }

    @Override
    public Class<? extends Request> getRequestType() {
        return SetNetworkProfileRequest.class;
    }

    @Override
    public Class<? extends Confirmation> getConfirmationType() {
        return SetNetworkProfileResponse.class;
    }

    @Override
    public String getAction() {
        return FeatureConstants.SET_NETWORK_PROFILE.value();
    }
}
