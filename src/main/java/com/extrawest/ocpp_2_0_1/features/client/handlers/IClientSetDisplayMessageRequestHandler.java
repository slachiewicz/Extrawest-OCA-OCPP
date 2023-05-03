package com.extrawest.ocpp_2_0_1.features.client.handlers;

import com.extrawest.ocpp_2_0_1.model.request.SendLocalListRequest;
import com.extrawest.ocpp_2_0_1.model.request.SetDisplayMessageRequest;
import com.extrawest.ocpp_2_0_1.model.response.SetDisplayMessageResponse;

/** Charging Station handler of {@link SendLocalListRequest} */
public interface IClientSetDisplayMessageRequestHandler {
    SetDisplayMessageResponse handleSetDisplayMessageRequest(SetDisplayMessageRequest request);
}
