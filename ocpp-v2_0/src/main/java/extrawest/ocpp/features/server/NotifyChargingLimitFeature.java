package extrawest.ocpp.features.server;

import com.extrawest.ocpp_2_0_1.constants.FeatureConstants;
import com.extrawest.common.feature.Feature;
import com.extrawest.ocpp_2_0_1.features.server.handlers.IServerNotifyChargingLimitRequestHandler;
import com.extrawest.common.model.Confirmation;
import com.extrawest.common.model.Request;
import com.extrawest.ocpp_2_0_1.model.request.NotifyChargingLimitRequest;
import com.extrawest.ocpp_2_0_1.model.response.NotifyChargingLimitResponse;

import java.util.UUID;

public class NotifyChargingLimitFeature implements Feature {
    private final IServerNotifyChargingLimitRequestHandler handler;

    public NotifyChargingLimitFeature(IServerNotifyChargingLimitRequestHandler handler) {
        this.handler = handler;
    }

    @Override
    public Confirmation handleRequest(UUID sessionIndex, Request request) {
        return handler.handleNotifyChargingLimitRequest(sessionIndex, (NotifyChargingLimitRequest) request);
    }

    @Override
    public Class<? extends Request> getRequestType() {
        return NotifyChargingLimitRequest.class;
    }

    @Override
    public Class<? extends Confirmation> getConfirmationType() {
        return NotifyChargingLimitResponse.class;
    }

    @Override
    public String getAction() {
        return FeatureConstants.NOTIFY_CHARGING_LIMIT.value();
    }
}
