package extrawest.ocpp.features.server;

import com.extrawest.ocpp_2_0_1.constants.FeatureConstants;
import com.extrawest.common.feature.Feature;
import com.extrawest.ocpp_2_0_1.features.server.handlers.IServerNotifyEVChargingScheduleRequestHandler;
import com.extrawest.common.model.Confirmation;
import com.extrawest.common.model.Request;
import com.extrawest.ocpp_2_0_1.model.request.NotifyEVChargingScheduleRequest;
import com.extrawest.ocpp_2_0_1.model.response.NotifyEVChargingScheduleResponse;

import java.util.UUID;

public class NotifyEVChargingScheduleFeature implements Feature {
    private final IServerNotifyEVChargingScheduleRequestHandler handler;

    public NotifyEVChargingScheduleFeature(IServerNotifyEVChargingScheduleRequestHandler handler) {
        this.handler = handler;
    }

    @Override
    public Confirmation handleRequest(UUID sessionIndex, Request request) {
        return handler.handleNotifyEVChargingScheduleRequest(sessionIndex, (NotifyEVChargingScheduleRequest) request);
    }

    @Override
    public Class<? extends Request> getRequestType() {
        return NotifyEVChargingScheduleRequest.class;
    }

    @Override
    public Class<? extends Confirmation> getConfirmationType() {
        return NotifyEVChargingScheduleResponse.class;
    }

    @Override
    public String getAction() {
        return FeatureConstants.NOTIFY_EV_CHARGING_SCHEDULE.value();
    }
}
