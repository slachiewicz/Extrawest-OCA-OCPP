package com.extrawest.ocpp_2_0_1.features.client;

import com.extrawest.ocpp_2_0_1.constants.FeatureConstants;
import com.extrawest.common.feature.Feature;
import com.extrawest.ocpp_2_0_1.features.client.handlers.IClientClearChargingProfileRequestHandler;
import com.extrawest.common.model.Confirmation;
import com.extrawest.common.model.Request;
import com.extrawest.ocpp_2_0_1.model.request.ClearChargingProfileRequest;
import com.extrawest.ocpp_2_0_1.model.response.ClearChargingProfileResponse;

import java.util.UUID;

public class ClearChargingProfileFeature implements Feature {
    private final IClientClearChargingProfileRequestHandler handler;

    public ClearChargingProfileFeature(IClientClearChargingProfileRequestHandler handler) {
        this.handler = handler;
    }

    @Override
    public Confirmation handleRequest(UUID sessionIndex, Request request) {
        return handler.handleClearChargingProfileRequest((ClearChargingProfileRequest) request);
    }

    @Override
    public Class<? extends Request> getRequestType() {
        return ClearChargingProfileRequest.class;
    }

    @Override
    public Class<? extends Confirmation> getConfirmationType() {
        return ClearChargingProfileResponse.class;
    }

    @Override
    public String getAction() {
        return FeatureConstants.CLEAR_CHARGING_PROFILE.value();
    }
}
