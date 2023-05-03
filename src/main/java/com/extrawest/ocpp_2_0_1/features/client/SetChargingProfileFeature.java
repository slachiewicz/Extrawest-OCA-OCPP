package com.extrawest.ocpp_2_0_1.features.client;

import com.extrawest.ocpp_2_0_1.constants.FeatureConstants;
import com.extrawest.common.feature.Feature;
import com.extrawest.ocpp_2_0_1.features.client.handlers.IClientSetChargingProfileRequestHandler;
import com.extrawest.common.model.Confirmation;
import com.extrawest.common.model.Request;
import com.extrawest.ocpp_2_0_1.model.request.SetChargingProfileRequest;
import com.extrawest.ocpp_2_0_1.model.response.SetChargingProfileResponse;

import java.util.UUID;

public class SetChargingProfileFeature implements Feature {
    private final IClientSetChargingProfileRequestHandler handler;

    public SetChargingProfileFeature(IClientSetChargingProfileRequestHandler handler) {
        this.handler = handler;
    }

    @Override
    public Confirmation handleRequest(UUID sessionIndex, Request request) {
        return handler.handleSetChargingProfileRequest((SetChargingProfileRequest) request);
    }

    @Override
    public Class<? extends Request> getRequestType() {
        return SetChargingProfileRequest.class;
    }

    @Override
    public Class<? extends Confirmation> getConfirmationType() {
        return SetChargingProfileResponse.class;
    }

    @Override
    public String getAction() {
        return FeatureConstants.SET_CHARGING_PROFILE.value();
    }
}
