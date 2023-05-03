package extrawest.ocpp2_0_1serverexample.handlers;

import com.extrawest.ocpp_2_0_1.features.server.handlers.IServerNotifyEventRequestHandler;
import com.extrawest.ocpp_2_0_1.model.request.NotifyEventRequest;
import com.extrawest.ocpp_2_0_1.model.response.NotifyEventResponse;

import java.util.UUID;

public class ServerNotifyEventRequestHandler implements IServerNotifyEventRequestHandler {
    @Override
    public NotifyEventResponse handleNotifyEventRequest(UUID sessionIndex, NotifyEventRequest request) {
        return new NotifyEventResponse();
    }
}
