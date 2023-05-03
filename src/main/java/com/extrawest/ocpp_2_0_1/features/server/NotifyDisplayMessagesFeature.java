package com.extrawest.ocpp_2_0_1.features.server;

import com.extrawest.ocpp_2_0_1.constants.FeatureConstants;
import com.extrawest.common.feature.Feature;
import com.extrawest.ocpp_2_0_1.features.server.handlers.IServerNotifyDisplayMessagesRequestHandler;
import com.extrawest.common.model.Confirmation;
import com.extrawest.common.model.Request;
import com.extrawest.ocpp_2_0_1.model.request.NotifyDisplayMessagesRequest;
import com.extrawest.ocpp_2_0_1.model.response.NotifyDisplayMessagesResponse;

import java.util.UUID;

public class NotifyDisplayMessagesFeature implements Feature {
    private final IServerNotifyDisplayMessagesRequestHandler handler;

    public NotifyDisplayMessagesFeature(IServerNotifyDisplayMessagesRequestHandler handler) {
        this.handler = handler;
    }

    @Override
    public Confirmation handleRequest(UUID sessionIndex, Request request) {
        return handler.handleNotifyDisplayMessagesRequest(sessionIndex, (NotifyDisplayMessagesRequest) request);
    }

    @Override
    public Class<? extends Request> getRequestType() {
        return NotifyDisplayMessagesRequest.class;
    }

    @Override
    public Class<? extends Confirmation> getConfirmationType() {
        return NotifyDisplayMessagesResponse.class;
    }

    @Override
    public String getAction() {
        return FeatureConstants.NOTIFY_DISPLAY_MESSAGES.value();
    }
}
