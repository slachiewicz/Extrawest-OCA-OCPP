package com.extrawest.ocpp_2_0_1.features.server.handlers;

import com.extrawest.ocpp_2_0_1.model.request.MeterValuesRequest;
import com.extrawest.ocpp_2_0_1.model.response.MeterValuesResponse;

import java.util.UUID;

/** Central system handler of {@link MeterValuesRequest}s. */
public interface IServerMeterValuesRequestHandler {
    MeterValuesResponse handleMeterValuesRequest(
            UUID sessionIndex, MeterValuesRequest request);
}
