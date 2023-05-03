package com.extrawest.ocpp_2_0_1.features.client;

import com.extrawest.ocpp_2_0_1.constants.FeatureConstants;
import com.extrawest.common.feature.Feature;
import com.extrawest.ocpp_2_0_1.features.client.handlers.IClientUpdateFirmwareRequestHandler;
import com.extrawest.common.model.Confirmation;
import com.extrawest.common.model.Request;
import com.extrawest.ocpp_2_0_1.model.request.UpdateFirmwareRequest;
import com.extrawest.ocpp_2_0_1.model.response.UpdateFirmwareResponse;

import java.util.UUID;

public class UpdateFirmwareFeature implements Feature {
    private final IClientUpdateFirmwareRequestHandler handler;

    public UpdateFirmwareFeature(IClientUpdateFirmwareRequestHandler handler) {
        this.handler = handler;
    }

    @Override
    public Confirmation handleRequest(UUID sessionIndex, Request request) {
        return handler.handleUpdateFirmwareRequest((UpdateFirmwareRequest) request);
    }

    @Override
    public Class<? extends Request> getRequestType() {
        return UpdateFirmwareRequest.class;
    }

    @Override
    public Class<? extends Confirmation> getConfirmationType() {
        return UpdateFirmwareResponse.class;
    }

    @Override
    public String getAction() {
        return FeatureConstants.UPDATE_FIRMWARE.value();
    }
}
