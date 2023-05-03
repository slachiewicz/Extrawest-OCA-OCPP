package com.extrawest.ocpp_2_0_1.features.server.handlers;

import com.extrawest.ocpp_2_0_1.model.request.NotifyDisplayMessagesRequest;
import com.extrawest.ocpp_2_0_1.model.response.NotifyDisplayMessagesResponse;

import java.util.UUID;

/** Central system handler of {@link NotifyDisplayMessagesRequest}s. */
public interface IServerNotifyDisplayMessagesRequestHandler {
    NotifyDisplayMessagesResponse handleNotifyDisplayMessagesRequest(
            UUID sessionIndex, NotifyDisplayMessagesRequest request);
}
