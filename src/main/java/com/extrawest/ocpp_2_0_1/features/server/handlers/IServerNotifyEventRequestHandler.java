package com.extrawest.ocpp_2_0_1.features.server.handlers;

import com.extrawest.ocpp_2_0_1.model.request.NotifyEventRequest;
import com.extrawest.ocpp_2_0_1.model.response.NotifyEventResponse;

import java.util.UUID;

/** Central system handler of {@link NotifyEventRequest}s. */
public interface IServerNotifyEventRequestHandler {
    NotifyEventResponse handleNotifyEventRequest(
            UUID sessionIndex, NotifyEventRequest request);
}
