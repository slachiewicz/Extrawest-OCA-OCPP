package com.extrawest.ocpp_2_0_1.features.client;

import com.extrawest.ocpp_2_0_1.constants.FeatureConstants;
import com.extrawest.common.feature.Feature;
import com.extrawest.ocpp_2_0_1.features.client.handlers.IClientPublishFirmwareRequestHandler;
import com.extrawest.common.model.Confirmation;
import com.extrawest.common.model.Request;
import com.extrawest.ocpp_2_0_1.model.request.PublishFirmwareRequest;
import com.extrawest.ocpp_2_0_1.model.response.PublishFirmwareResponse;

import java.util.UUID;

public class PublishFirmwareFeature implements Feature {
    private final IClientPublishFirmwareRequestHandler handler;

    public PublishFirmwareFeature(IClientPublishFirmwareRequestHandler handler) {
        this.handler = handler;
    }

    @Override
    public Confirmation handleRequest(UUID sessionIndex, Request request) {
        return handler.handlePublishFirmwareRequest((PublishFirmwareRequest) request);
    }

    @Override
    public Class<? extends Request> getRequestType() {
        return PublishFirmwareRequest.class;
    }

    @Override
    public Class<? extends Confirmation> getConfirmationType() {
        return PublishFirmwareResponse.class;
    }

    @Override
    public String getAction() {
        return FeatureConstants.PUBLISH_FIRMWARE.value();
    }
}
