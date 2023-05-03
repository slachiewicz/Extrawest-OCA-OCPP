package extrawest.ocpp.features.server;

import com.extrawest.ocpp_2_0_1.constants.FeatureConstants;
import com.extrawest.common.feature.Feature;
import com.extrawest.ocpp_2_0_1.features.server.handlers.IServerNotifyEventRequestHandler;
import com.extrawest.common.model.Confirmation;
import com.extrawest.common.model.Request;
import com.extrawest.ocpp_2_0_1.model.request.NotifyEventRequest;
import com.extrawest.ocpp_2_0_1.model.response.NotifyEventResponse;

import java.util.UUID;

public class NotifyEventFeature implements Feature {
    private final IServerNotifyEventRequestHandler handler;

    public NotifyEventFeature(IServerNotifyEventRequestHandler handler) {
        this.handler = handler;
    }

    @Override
    public Confirmation handleRequest(UUID sessionIndex, Request request) {
        return handler.handleNotifyEventRequest(sessionIndex, (NotifyEventRequest) request);
    }

    @Override
    public Class<? extends Request> getRequestType() {
        return NotifyEventRequest.class;
    }

    @Override
    public Class<? extends Confirmation> getConfirmationType() {
        return NotifyEventResponse.class;
    }

    @Override
    public String getAction() {
        return FeatureConstants.NOTIFY_EVENT.value();
    }
}
