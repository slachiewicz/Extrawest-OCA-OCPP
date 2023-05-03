package com.extrawest.ocpp_2_0_1.features.server.handlers;

import com.extrawest.ocpp_2_0_1.model.request.NotifyMonitoringReportRequest;
import com.extrawest.ocpp_2_0_1.model.response.NotifyMonitoringReportResponse;

import java.util.UUID;

/** Central system handler of {@link NotifyMonitoringReportRequest}s. */
public interface IServerNotifyMonitoringReportRequestHandler {
    NotifyMonitoringReportResponse handleNotifyMonitoringReportRequest(
            UUID sessionIndex, NotifyMonitoringReportRequest request);
}
