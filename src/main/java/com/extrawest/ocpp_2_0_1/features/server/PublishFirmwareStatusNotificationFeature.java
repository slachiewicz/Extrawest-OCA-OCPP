package com.extrawest.ocpp_2_0_1.features.server;

import com.extrawest.ocpp_2_0_1.constants.FeatureConstants;
import com.extrawest.common.feature.Feature;
import com.extrawest.ocpp_2_0_1.features.server.handlers.IServerPublishFirmwareStatusNotificationRequestHandler;
import com.extrawest.common.model.Confirmation;
import com.extrawest.common.model.Request;
import com.extrawest.ocpp_2_0_1.model.request.PublishFirmwareStatusNotificationRequest;
import com.extrawest.ocpp_2_0_1.model.response.PublishFirmwareStatusNotificationResponse;

import java.util.UUID;

public class PublishFirmwareStatusNotificationFeature implements Feature {
    private final IServerPublishFirmwareStatusNotificationRequestHandler handler;

    public PublishFirmwareStatusNotificationFeature(IServerPublishFirmwareStatusNotificationRequestHandler handler) {
        this.handler = handler;
    }

    @Override
    public Confirmation handleRequest(UUID sessionIndex, Request request) {
        return handler.handlePublishFirmwareStatusNotificationRequest(sessionIndex, (PublishFirmwareStatusNotificationRequest) request);
    }

    @Override
    public Class<? extends Request> getRequestType() {
        return PublishFirmwareStatusNotificationRequest.class;
    }

    @Override
    public Class<? extends Confirmation> getConfirmationType() {
        return PublishFirmwareStatusNotificationResponse.class;
    }

    @Override
    public String getAction() {
        return FeatureConstants.PUBLISH_FIRMWARE_STATUS_NOTIFICATION.value();
    }
}
