package extrawest.ocpp2_0_1serverexample.handlers;

import com.extrawest.ocpp_2_0_1.features.server.handlers.IServerNotifyDisplayMessagesRequestHandler;
import com.extrawest.ocpp_2_0_1.model.request.NotifyDisplayMessagesRequest;
import com.extrawest.ocpp_2_0_1.model.response.NotifyDisplayMessagesResponse;

import java.util.UUID;

public class ServerNotifyDisplayMessagesRequestHandler implements IServerNotifyDisplayMessagesRequestHandler {
    @Override
    public NotifyDisplayMessagesResponse handleNotifyDisplayMessagesRequest(UUID sessionIndex, NotifyDisplayMessagesRequest request) {
        return new NotifyDisplayMessagesResponse();
    }
}
