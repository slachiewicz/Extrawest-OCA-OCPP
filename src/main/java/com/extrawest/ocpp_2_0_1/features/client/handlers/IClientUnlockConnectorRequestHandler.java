package com.extrawest.ocpp_2_0_1.features.client.handlers;

import com.extrawest.ocpp_2_0_1.model.request.UnlockConnectorRequest;
import com.extrawest.ocpp_2_0_1.model.response.UnlockConnectorResponse;

/** Charging Station handler of {@link UnlockConnectorRequest} */
public interface IClientUnlockConnectorRequestHandler {
    UnlockConnectorResponse handleUnlockConnectorRequest(UnlockConnectorRequest request);
}
