package com.extrawest.ocpp_2_0_1.features.server.handlers;

import com.extrawest.ocpp_2_0_1.model.request.AuthorizeRequest;
import com.extrawest.ocpp_2_0_1.model.request.LogStatusNotificationRequest;
import com.extrawest.ocpp_2_0_1.model.response.LogStatusNotificationResponse;

import java.util.UUID;

/** Central system handler of {@link AuthorizeRequest}s. */
public interface IServerLogStatusNotificationRequestHandler {
    LogStatusNotificationResponse handleLogStatusNotificationRequest(
            UUID sessionIndex, LogStatusNotificationRequest request);
}
