package com.extrawest.ocpp_2_0_1.features.client.handlers;

import com.extrawest.ocpp_2_0_1.model.request.GetCompositeScheduleRequest;
import com.extrawest.ocpp_2_0_1.model.response.GetCompositeScheduleResponse;

/** Charging Station handler of {@link GetCompositeScheduleRequest} */
public interface IClientGetCompositeScheduleRequestHandler {
    GetCompositeScheduleResponse handleGetCompositeScheduleRequest(GetCompositeScheduleRequest request);
}
