package com.extrawest.ocpp_2_0_1.features.server.handlers;

import com.extrawest.ocpp_2_0_1.model.request.ReportChargingProfilesRequest;
import com.extrawest.ocpp_2_0_1.model.response.ReportChargingProfilesResponse;

import java.util.UUID;

/** Central system handler of {@link ReportChargingProfilesRequest}s. */
public interface IServerReportChargingProfilesRequestHandler {
    ReportChargingProfilesResponse handleReportChargingProfilesRequest(
            UUID sessionIndex, ReportChargingProfilesRequest request);
}
