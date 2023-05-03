package com.extrawest.ocpp_2_0_1.features.server;

import com.extrawest.ocpp_2_0_1.constants.FeatureConstants;
import com.extrawest.common.feature.Feature;
import com.extrawest.ocpp_2_0_1.features.server.handlers.IServerMeterValuesRequestHandler;
import com.extrawest.common.model.Confirmation;
import com.extrawest.common.model.Request;
import com.extrawest.ocpp_2_0_1.model.request.MeterValuesRequest;
import com.extrawest.ocpp_2_0_1.model.response.MeterValuesResponse;

import java.util.UUID;

public class MeterValuesFeature implements Feature {
    private final IServerMeterValuesRequestHandler handler;

    public MeterValuesFeature(IServerMeterValuesRequestHandler handler) {
        this.handler = handler;
    }

    @Override
    public Confirmation handleRequest(UUID sessionIndex, Request request) {
        return handler.handleMeterValuesRequest(sessionIndex, (MeterValuesRequest) request);
    }

    @Override
    public Class<? extends Request> getRequestType() {
        return MeterValuesRequest.class;
    }

    @Override
    public Class<? extends Confirmation> getConfirmationType() {
        return MeterValuesResponse.class;
    }

    @Override
    public String getAction() {
        return FeatureConstants.METER_VALUES.value();
    }
}
