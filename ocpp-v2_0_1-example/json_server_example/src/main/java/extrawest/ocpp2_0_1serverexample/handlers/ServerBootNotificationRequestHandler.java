package extrawest.ocpp2_0_1serverexample.handlers;

import com.extrawest.ocpp_2_0_1.features.server.handlers.IServerBootNotificationRequestHandler;
import com.extrawest.ocpp_2_0_1.model.dataTypes.enums.RegistrationStatusEnumType;
import com.extrawest.ocpp_2_0_1.model.request.BootNotificationRequest;
import com.extrawest.ocpp_2_0_1.model.response.BootNotificationResponse;

import java.time.LocalDateTime;
import java.util.UUID;

public class ServerBootNotificationRequestHandler implements IServerBootNotificationRequestHandler {
    @Override
    public BootNotificationResponse handleBootNotificationRequest(UUID sessionIndex, BootNotificationRequest request) {
        return new BootNotificationResponse(LocalDateTime.now(), 10, RegistrationStatusEnumType.ACCEPTED);
    }
}
