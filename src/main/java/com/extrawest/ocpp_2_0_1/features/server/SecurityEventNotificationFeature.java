package com.extrawest.ocpp_2_0_1.features.server;

import com.extrawest.ocpp_2_0_1.constants.FeatureConstants;
import com.extrawest.common.feature.Feature;
import com.extrawest.ocpp_2_0_1.features.server.handlers.IServerSecurityEventNotificationRequestHandler;
import com.extrawest.common.model.Confirmation;
import com.extrawest.common.model.Request;
import com.extrawest.ocpp_2_0_1.model.request.SecurityEventNotificationRequest;
import com.extrawest.ocpp_2_0_1.model.response.SecurityEventNotificationResponse;

import java.util.UUID;

public class SecurityEventNotificationFeature implements Feature {
    private final IServerSecurityEventNotificationRequestHandler handler;

    public SecurityEventNotificationFeature(IServerSecurityEventNotificationRequestHandler handler) {
        this.handler = handler;
    }

    @Override
    public Confirmation handleRequest(UUID sessionIndex, Request request) {
        return handler.handleSecurityEventNotificationRequest(sessionIndex, (SecurityEventNotificationRequest) request);
    }

    @Override
    public Class<? extends Request> getRequestType() {
        return SecurityEventNotificationRequest.class;
    }

    @Override
    public Class<? extends Confirmation> getConfirmationType() {
        return SecurityEventNotificationResponse.class;
    }

    @Override
    public String getAction() {
        return FeatureConstants.SECURITY_EVENT_NOTIFICATION.value();
    }
}
