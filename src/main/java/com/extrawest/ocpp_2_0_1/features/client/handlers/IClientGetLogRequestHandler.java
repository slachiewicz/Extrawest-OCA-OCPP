package com.extrawest.ocpp_2_0_1.features.client.handlers;

import com.extrawest.ocpp_2_0_1.model.request.GetLogRequest;
import com.extrawest.ocpp_2_0_1.model.response.GetLogResponse;

/** Charging Station handler of {@link GetLogRequest} */
public interface IClientGetLogRequestHandler {
    GetLogResponse handleGetLogRequest(GetLogRequest request);
}
