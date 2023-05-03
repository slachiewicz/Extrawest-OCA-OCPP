package com.extrawest.ocpp_2_0_1.features.server.handlers;

import com.extrawest.ocpp_2_0_1.model.request.FirmwareStatusNotificationRequest;
import com.extrawest.ocpp_2_0_1.model.response.FirmwareStatusNotificationResponse;

import java.util.UUID;

/** Central system handler of {@link FirmwareStatusNotificationRequest}s. */
public interface IServerFirmwareStatusNotificationRequestHandler {
    FirmwareStatusNotificationResponse handleFirmwareStatusNotification(
            UUID sessionIndex, FirmwareStatusNotificationRequest request);
}
