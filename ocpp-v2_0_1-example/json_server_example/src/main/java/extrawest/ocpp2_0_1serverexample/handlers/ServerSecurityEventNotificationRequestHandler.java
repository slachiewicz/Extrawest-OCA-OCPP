package extrawest.ocpp2_0_1serverexample.handlers;

import com.extrawest.ocpp_2_0_1.features.server.handlers.IServerSecurityEventNotificationRequestHandler;
import com.extrawest.ocpp_2_0_1.model.request.SecurityEventNotificationRequest;
import com.extrawest.ocpp_2_0_1.model.response.SecurityEventNotificationResponse;

import java.util.UUID;

public class ServerSecurityEventNotificationRequestHandler implements IServerSecurityEventNotificationRequestHandler {
    @Override
    public SecurityEventNotificationResponse handleSecurityEventNotificationRequest(UUID sessionIndex, SecurityEventNotificationRequest request) {
        return new SecurityEventNotificationResponse();
    }
}
