package extrawest.ocpp.features.server;

import com.extrawest.ocpp_2_0_1.constants.FeatureConstants;
import com.extrawest.common.feature.Feature;
import com.extrawest.ocpp_2_0_1.features.server.handlers.IServerNotifyEVChargingNeedsRequestHandler;
import com.extrawest.common.model.Confirmation;
import com.extrawest.common.model.Request;
import com.extrawest.ocpp_2_0_1.model.request.NotifyEVChargingNeedsRequest;
import com.extrawest.ocpp_2_0_1.model.response.NotifyEVChargingNeedsResponse;

import java.util.UUID;

public class NotifyEVChargingNeedsFeature implements Feature {
    private final IServerNotifyEVChargingNeedsRequestHandler handler;

    public NotifyEVChargingNeedsFeature(IServerNotifyEVChargingNeedsRequestHandler handler) {
        this.handler = handler;
    }

    @Override
    public Confirmation handleRequest(UUID sessionIndex, Request request) {
        return handler.handleNotifyEVChargingNeedsRequest(sessionIndex, (NotifyEVChargingNeedsRequest) request);
    }

    @Override
    public Class<? extends Request> getRequestType() {
        return NotifyEVChargingNeedsRequest.class;
    }

    @Override
    public Class<? extends Confirmation> getConfirmationType() {
        return NotifyEVChargingNeedsResponse.class;
    }

    @Override
    public String getAction() {
        return FeatureConstants.NOTIFY_EV_CHARGING_NEEDS.value();
    }
}
