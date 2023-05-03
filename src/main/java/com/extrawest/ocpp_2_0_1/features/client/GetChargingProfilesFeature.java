package com.extrawest.ocpp_2_0_1.features.client;

import com.extrawest.ocpp_2_0_1.constants.FeatureConstants;
import com.extrawest.common.feature.Feature;
import com.extrawest.ocpp_2_0_1.features.client.handlers.IClientGetChargingProfilesRequestHandler;
import com.extrawest.common.model.Confirmation;
import com.extrawest.common.model.Request;
import com.extrawest.ocpp_2_0_1.model.request.GetChargingProfilesRequest;
import com.extrawest.ocpp_2_0_1.model.response.GetChargingProfilesResponse;

import java.util.UUID;

public class GetChargingProfilesFeature implements Feature {
    private final IClientGetChargingProfilesRequestHandler handler;

    public GetChargingProfilesFeature(IClientGetChargingProfilesRequestHandler handler) {
        this.handler = handler;
    }

    @Override
    public Confirmation handleRequest(UUID sessionIndex, Request request) {
        return handler.handleGetChargingProfilesRequest((GetChargingProfilesRequest) request);
    }

    @Override
    public Class<? extends Request> getRequestType() {
        return GetChargingProfilesRequest.class;
    }

    @Override
    public Class<? extends Confirmation> getConfirmationType() {
        return GetChargingProfilesResponse.class;
    }

    @Override
    public String getAction() {
        return FeatureConstants.GET_CHARGING_PROFILES.value();
    }
}
