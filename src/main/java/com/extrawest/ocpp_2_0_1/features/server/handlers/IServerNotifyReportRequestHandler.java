package com.extrawest.ocpp_2_0_1.features.server.handlers;

import com.extrawest.ocpp_2_0_1.model.request.NotifyReportRequest;
import com.extrawest.ocpp_2_0_1.model.response.NotifyReportResponse;

import java.util.UUID;

/** Central system handler of {@link NotifyReportRequest}s. */
public interface IServerNotifyReportRequestHandler {
    NotifyReportResponse handleNotifyReportRequest(
            UUID sessionIndex, NotifyReportRequest request);
}
