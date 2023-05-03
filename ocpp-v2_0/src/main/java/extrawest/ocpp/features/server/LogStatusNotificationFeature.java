package extrawest.ocpp.features.server;

import com.extrawest.ocpp_2_0_1.constants.FeatureConstants;
import com.extrawest.common.feature.Feature;
import com.extrawest.ocpp_2_0_1.features.server.handlers.IServerLogStatusNotificationRequestHandler;
import com.extrawest.common.model.Confirmation;
import com.extrawest.common.model.Request;
import com.extrawest.ocpp_2_0_1.model.request.LogStatusNotificationRequest;
import com.extrawest.ocpp_2_0_1.model.response.LogStatusNotificationResponse;

import java.util.UUID;

public class LogStatusNotificationFeature implements Feature {
    private final IServerLogStatusNotificationRequestHandler handler;

    public LogStatusNotificationFeature(IServerLogStatusNotificationRequestHandler handler) {
        this.handler = handler;
    }

    @Override
    public Confirmation handleRequest(UUID sessionIndex, Request request) {
        return handler.handleLogStatusNotificationRequest(sessionIndex, (LogStatusNotificationRequest) request);
    }

    @Override
    public Class<? extends Request> getRequestType() {
        return LogStatusNotificationRequest.class;
    }

    @Override
    public Class<? extends Confirmation> getConfirmationType() {
        return LogStatusNotificationResponse.class;
    }

    @Override
    public String getAction() {
        return FeatureConstants.LOG_STATUS_NOTIFICATION.value();
    }
}
