package com.extrawest.ocpp_2_0_1.features.client.handlers;

import com.extrawest.ocpp_2_0_1.model.request.ClearDisplayMessageRequest;
import com.extrawest.ocpp_2_0_1.model.response.ClearDisplayMessageResponse;

/** Charging Station handler of {@link ClearDisplayMessageRequest} */
public interface IClientClearDisplayMessageRequestHandler {
    ClearDisplayMessageResponse handleClearDisplayMessageRequest(ClearDisplayMessageRequest request);
}
