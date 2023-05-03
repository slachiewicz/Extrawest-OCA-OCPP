package extrawest.ocpp2_0_1serverexample.handlers;

import com.extrawest.ocpp_2_0_1.features.server.handlers.IServerNotifyChargingLimitRequestHandler;
import com.extrawest.ocpp_2_0_1.model.request.NotifyChargingLimitRequest;
import com.extrawest.ocpp_2_0_1.model.response.NotifyChargingLimitResponse;

import java.util.UUID;

public class ServerNotifyChargingLimitRequestHandler implements IServerNotifyChargingLimitRequestHandler {
    @Override
    public NotifyChargingLimitResponse handleNotifyChargingLimitRequest(UUID sessionIndex, NotifyChargingLimitRequest request) {
        return new NotifyChargingLimitResponse();
    }
}
