package com.extrawest.ocpp_2_0_1.features.client;

import com.extrawest.ocpp_2_0_1.constants.FeatureConstants;
import com.extrawest.common.feature.Feature;
import com.extrawest.ocpp_2_0_1.features.client.handlers.IClientUnpublishFirmwareRequestHandler;
import com.extrawest.common.model.Confirmation;
import com.extrawest.common.model.Request;
import com.extrawest.ocpp_2_0_1.model.request.UnpublishFirmwareRequest;
import com.extrawest.ocpp_2_0_1.model.response.UnpublishFirmwareResponse;

import java.util.UUID;

public class UnpublishFirmwareFeature implements Feature {
    private final IClientUnpublishFirmwareRequestHandler handler;

    public UnpublishFirmwareFeature(IClientUnpublishFirmwareRequestHandler handler) {
        this.handler = handler;
    }

    @Override
    public Confirmation handleRequest(UUID sessionIndex, Request request) {
        return handler.handleUnpublishFirmwareRequest((UnpublishFirmwareRequest) request);
    }

    @Override
    public Class<? extends Request> getRequestType() {
        return UnpublishFirmwareRequest.class;
    }

    @Override
    public Class<? extends Confirmation> getConfirmationType() {
        return UnpublishFirmwareResponse.class;
    }

    @Override
    public String getAction() {
        return FeatureConstants.UNPUBLISH_FIRMWARE.value();
    }
}
