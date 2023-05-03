package extrawest.ocpp2_0_1serverexample.handlers;

import com.extrawest.ocpp_2_0_1.features.server.handlers.IServerStatusNotificationRequestHandler;
import com.extrawest.ocpp_2_0_1.model.request.StatusNotificationRequest;
import com.extrawest.ocpp_2_0_1.model.response.StatusNotificationResponse;

import java.util.UUID;

public class ServerStatusNotificationRequestHandler implements IServerStatusNotificationRequestHandler {
    @Override
    public StatusNotificationResponse handleStatusNotificationRequest(UUID sessionIndex, StatusNotificationRequest request) {
        return new StatusNotificationResponse();
    }
}
