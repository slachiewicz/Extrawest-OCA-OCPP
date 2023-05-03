package com.extrawest.ocpp_2_0_1.features.server;

import com.extrawest.ocpp_2_0_1.constants.FeatureConstants;
import com.extrawest.common.feature.Feature;
import com.extrawest.ocpp_2_0_1.features.server.handlers.IServerClearedChargingLimitRequestHandler;
import com.extrawest.common.model.Confirmation;
import com.extrawest.common.model.Request;
import com.extrawest.ocpp_2_0_1.model.request.ClearedChargingLimitRequest;
import com.extrawest.ocpp_2_0_1.model.response.ClearedChargingLimitResponse;

import java.util.UUID;

public class ClearedChargingLimitFeature implements Feature {
    private final IServerClearedChargingLimitRequestHandler handler;

    public ClearedChargingLimitFeature(IServerClearedChargingLimitRequestHandler handler) {
        this.handler = handler;
    }

    @Override
    public Confirmation handleRequest(UUID sessionIndex, Request request) {
        return handler.handleClearedChargingLimitRequest(sessionIndex, (ClearedChargingLimitRequest) request);
    }

    @Override
    public Class<? extends Request> getRequestType() {
        return ClearedChargingLimitRequest.class;
    }

    @Override
    public Class<? extends Confirmation> getConfirmationType() {
        return ClearedChargingLimitResponse.class;
    }

    @Override
    public String getAction() {
        return FeatureConstants.CLEARED_CHARGING_LIMIT.value();
    }
}
