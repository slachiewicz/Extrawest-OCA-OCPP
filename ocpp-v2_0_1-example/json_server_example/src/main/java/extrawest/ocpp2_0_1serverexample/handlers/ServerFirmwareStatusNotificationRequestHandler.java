package extrawest.ocpp2_0_1serverexample.handlers;

import com.extrawest.ocpp_2_0_1.features.server.handlers.IServerFirmwareStatusNotificationRequestHandler;
import com.extrawest.ocpp_2_0_1.model.request.FirmwareStatusNotificationRequest;
import com.extrawest.ocpp_2_0_1.model.response.FirmwareStatusNotificationResponse;

import java.util.UUID;

public class ServerFirmwareStatusNotificationRequestHandler implements IServerFirmwareStatusNotificationRequestHandler {
    @Override
    public FirmwareStatusNotificationResponse handleFirmwareStatusNotification(UUID sessionIndex, FirmwareStatusNotificationRequest request) {
        return new FirmwareStatusNotificationResponse();
    }
}
