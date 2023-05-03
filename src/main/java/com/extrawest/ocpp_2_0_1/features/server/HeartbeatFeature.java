package com.extrawest.ocpp_2_0_1.features.server;

import com.extrawest.ocpp_2_0_1.constants.FeatureConstants;
import com.extrawest.common.feature.Feature;
import com.extrawest.ocpp_2_0_1.features.server.handlers.IServerHeartbeatRequestHandler;
import com.extrawest.common.model.Confirmation;
import com.extrawest.common.model.Request;
import com.extrawest.ocpp_2_0_1.model.request.HeartbeatRequest;
import com.extrawest.ocpp_2_0_1.model.response.HeartbeatResponse;

import java.util.UUID;

public class HeartbeatFeature implements Feature {
    private final IServerHeartbeatRequestHandler handler;

    public HeartbeatFeature(IServerHeartbeatRequestHandler handler) {
        this.handler = handler;
    }

    @Override
    public Confirmation handleRequest(UUID sessionIndex, Request request) {
        return handler.handleHeartbeatRequest(sessionIndex, (HeartbeatRequest) request);
    }

    @Override
    public Class<? extends Request> getRequestType() {
        return HeartbeatRequest.class;
    }

    @Override
    public Class<? extends Confirmation> getConfirmationType() {
        return HeartbeatResponse.class;
    }

    @Override
    public String getAction() {
        return FeatureConstants.HEARTBEAT.value();
    }
}
