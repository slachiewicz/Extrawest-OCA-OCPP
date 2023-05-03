package extrawest.ocpp.features.server.handlers;

import com.extrawest.ocpp_2_0_1.model.request.PublishFirmwareStatusNotificationRequest;
import com.extrawest.ocpp_2_0_1.model.response.PublishFirmwareStatusNotificationResponse;

import java.util.UUID;

/** Central system handler of {@link PublishFirmwareStatusNotificationRequest}s. */
public interface IServerPublishFirmwareStatusNotificationRequestHandler {
    PublishFirmwareStatusNotificationResponse handlePublishFirmwareStatusNotificationRequest(
            UUID sessionIndex, PublishFirmwareStatusNotificationRequest request);
}
