package com.extrawest.ocpp_2_0_1.features.client;

import com.extrawest.ocpp_2_0_1.constants.FeatureConstants;
import com.extrawest.common.feature.Feature;
import com.extrawest.ocpp_2_0_1.features.client.handlers.IClientSetVariableMonitoringRequestHandler;
import com.extrawest.common.model.Confirmation;
import com.extrawest.common.model.Request;
import com.extrawest.ocpp_2_0_1.model.request.SetVariableMonitoringRequest;
import com.extrawest.ocpp_2_0_1.model.response.SetVariableMonitoringResponse;

import java.util.UUID;

public class SetVariableMonitoringFeature implements Feature {
    private final IClientSetVariableMonitoringRequestHandler handler;

    public SetVariableMonitoringFeature(IClientSetVariableMonitoringRequestHandler handler) {
        this.handler = handler;
    }

    @Override
    public Confirmation handleRequest(UUID sessionIndex, Request request) {
        return handler.handleSetVariableMonitoringRequest((SetVariableMonitoringRequest) request);
    }

    @Override
    public Class<? extends Request> getRequestType() {
        return SetVariableMonitoringRequest.class;
    }

    @Override
    public Class<? extends Confirmation> getConfirmationType() {
        return SetVariableMonitoringResponse.class;
    }

    @Override
    public String getAction() {
        return FeatureConstants.SET_VARIABLE_MONITORING.value();
    }
}
