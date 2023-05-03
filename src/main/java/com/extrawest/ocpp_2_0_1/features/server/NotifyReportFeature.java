package com.extrawest.ocpp_2_0_1.features.server;

import com.extrawest.ocpp_2_0_1.constants.FeatureConstants;
import com.extrawest.common.feature.Feature;
import com.extrawest.ocpp_2_0_1.features.server.handlers.IServerNotifyReportRequestHandler;
import com.extrawest.common.model.Confirmation;
import com.extrawest.common.model.Request;
import com.extrawest.ocpp_2_0_1.model.request.NotifyReportRequest;
import com.extrawest.ocpp_2_0_1.model.response.NotifyReportResponse;

import java.util.UUID;

public class NotifyReportFeature implements Feature {
    private final IServerNotifyReportRequestHandler handler;

    public NotifyReportFeature(IServerNotifyReportRequestHandler handler) {
        this.handler = handler;
    }

    @Override
    public Confirmation handleRequest(UUID sessionIndex, Request request) {
        return handler.handleNotifyReportRequest(sessionIndex, (NotifyReportRequest) request);
    }

    @Override
    public Class<? extends Request> getRequestType() {
        return NotifyReportRequest.class;
    }

    @Override
    public Class<? extends Confirmation> getConfirmationType() {
        return NotifyReportResponse.class;
    }

    @Override
    public String getAction() {
        return FeatureConstants.NOTIFY_REPORT.value();
    }
}
