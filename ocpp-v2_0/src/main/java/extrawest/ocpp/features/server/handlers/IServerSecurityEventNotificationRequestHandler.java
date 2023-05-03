package extrawest.ocpp.features.server.handlers;

import com.extrawest.ocpp_2_0_1.model.request.SecurityEventNotificationRequest;
import com.extrawest.ocpp_2_0_1.model.response.SecurityEventNotificationResponse;

import java.util.UUID;

/** Central system handler of {@link SecurityEventNotificationRequest}s. */
public interface IServerSecurityEventNotificationRequestHandler {
    SecurityEventNotificationResponse handleSecurityEventNotificationRequest(
            UUID sessionIndex, SecurityEventNotificationRequest request);
}
