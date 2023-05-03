package com.extrawest.ocpp_2_0_1.features.client.handlers;

import com.extrawest.ocpp_2_0_1.model.request.GetMonitoringReportRequest;
import com.extrawest.ocpp_2_0_1.model.response.GetMonitoringReportResponse;

/** Charging Station handler of {@link GetMonitoringReportRequest} */
public interface IClientGetMonitoringReportRequestHandler {
    GetMonitoringReportResponse handleGetMonitoringReportRequest(GetMonitoringReportRequest request);
}
