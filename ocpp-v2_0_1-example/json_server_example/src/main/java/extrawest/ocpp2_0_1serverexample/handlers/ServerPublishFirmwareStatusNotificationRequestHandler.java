package extrawest.ocpp2_0_1serverexample.handlers;

import com.extrawest.ocpp_2_0_1.features.server.handlers.IServerPublishFirmwareStatusNotificationRequestHandler;
import com.extrawest.ocpp_2_0_1.model.request.PublishFirmwareStatusNotificationRequest;
import com.extrawest.ocpp_2_0_1.model.response.PublishFirmwareStatusNotificationResponse;

import java.util.UUID;

public class ServerPublishFirmwareStatusNotificationRequestHandler implements IServerPublishFirmwareStatusNotificationRequestHandler {
    @Override
    public PublishFirmwareStatusNotificationResponse handlePublishFirmwareStatusNotificationRequest(UUID sessionIndex, PublishFirmwareStatusNotificationRequest request) {
        return new PublishFirmwareStatusNotificationResponse();
    }
}
