package com.extrawest.ocpp_2_0_1.features.client;

import com.extrawest.ocpp_2_0_1.constants.FeatureConstants;
import com.extrawest.common.feature.Feature;
import com.extrawest.ocpp_2_0_1.features.client.handlers.IClientChangeAvailabilityRequestHandler;
import com.extrawest.common.model.Confirmation;
import com.extrawest.common.model.Request;
import com.extrawest.ocpp_2_0_1.model.request.ChangeAvailabilityRequest;
import com.extrawest.ocpp_2_0_1.model.response.ChangeAvailabilityResponse;

import java.util.UUID;

public class ChangeAvailabilityFeature implements Feature {
    private final IClientChangeAvailabilityRequestHandler handler;

    public ChangeAvailabilityFeature(IClientChangeAvailabilityRequestHandler handler) {
        this.handler = handler;
    }

    @Override
    public Confirmation handleRequest(UUID sessionIndex, Request request) {
        return handler.handleChangeAvailabilityRequest((ChangeAvailabilityRequest) request);
    }

    @Override
    public Class<? extends Request> getRequestType() {
        return ChangeAvailabilityRequest.class;
    }

    @Override
    public Class<? extends Confirmation> getConfirmationType() {
        return ChangeAvailabilityResponse.class;
    }

    @Override
    public String getAction() {
        return FeatureConstants.CHANGE_AVAILABILITY.value();
    }
}
