package com.extrawest.ocpp_2_0_1.features.server;

import com.extrawest.ocpp_2_0_1.constants.FeatureConstants;
import com.extrawest.common.feature.Feature;
import com.extrawest.ocpp_2_0_1.features.server.handlers.IServerReportChargingProfilesRequestHandler;
import com.extrawest.common.model.Confirmation;
import com.extrawest.common.model.Request;
import com.extrawest.ocpp_2_0_1.model.request.ReportChargingProfilesRequest;
import com.extrawest.ocpp_2_0_1.model.response.ReportChargingProfilesResponse;

import java.util.UUID;

public class ReportChargingProfilesFeature implements Feature {
    private final IServerReportChargingProfilesRequestHandler handler;

    public ReportChargingProfilesFeature(IServerReportChargingProfilesRequestHandler handler) {
        this.handler = handler;
    }

    @Override
    public Confirmation handleRequest(UUID sessionIndex, Request request) {
        return handler.handleReportChargingProfilesRequest(sessionIndex, (ReportChargingProfilesRequest) request);
    }

    @Override
    public Class<? extends Request> getRequestType() {
        return ReportChargingProfilesRequest.class;
    }

    @Override
    public Class<? extends Confirmation> getConfirmationType() {
        return ReportChargingProfilesResponse.class;
    }

    @Override
    public String getAction() {
        return FeatureConstants.REPORT_CHARGING_PROFILES.value();
    }
}
