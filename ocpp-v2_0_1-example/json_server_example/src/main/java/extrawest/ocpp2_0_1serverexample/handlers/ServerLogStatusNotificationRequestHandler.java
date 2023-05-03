package extrawest.ocpp2_0_1serverexample.handlers;

import com.extrawest.ocpp_2_0_1.features.server.handlers.IServerLogStatusNotificationRequestHandler;
import com.extrawest.ocpp_2_0_1.model.request.LogStatusNotificationRequest;
import com.extrawest.ocpp_2_0_1.model.response.LogStatusNotificationResponse;

import java.util.UUID;

public class ServerLogStatusNotificationRequestHandler implements IServerLogStatusNotificationRequestHandler {
    @Override
    public LogStatusNotificationResponse handleLogStatusNotificationRequest(UUID sessionIndex, LogStatusNotificationRequest request) {
        return new LogStatusNotificationResponse();
    }
}
