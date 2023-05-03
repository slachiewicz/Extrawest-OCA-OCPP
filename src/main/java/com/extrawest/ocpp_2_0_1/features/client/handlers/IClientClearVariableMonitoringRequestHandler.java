package com.extrawest.ocpp_2_0_1.features.client.handlers;

import com.extrawest.ocpp_2_0_1.model.request.ClearVariableMonitoringRequest;
import com.extrawest.ocpp_2_0_1.model.response.ClearVariableMonitoringResponse;

/** Charging Station handler of {@link ClearVariableMonitoringRequest} */
public interface IClientClearVariableMonitoringRequestHandler {
    ClearVariableMonitoringResponse handleClearVariableMonitoringRequest(ClearVariableMonitoringRequest request);
}
