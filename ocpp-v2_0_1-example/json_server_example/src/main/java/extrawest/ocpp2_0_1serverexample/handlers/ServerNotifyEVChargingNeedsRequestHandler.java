package extrawest.ocpp2_0_1serverexample.handlers;

import com.extrawest.ocpp_2_0_1.features.server.handlers.IServerNotifyEVChargingNeedsRequestHandler;
import com.extrawest.ocpp_2_0_1.model.dataTypes.enums.NotifyEVChargingNeedsStatusEnumType;
import com.extrawest.ocpp_2_0_1.model.request.NotifyEVChargingNeedsRequest;
import com.extrawest.ocpp_2_0_1.model.response.NotifyEVChargingNeedsResponse;

import java.util.UUID;

public class ServerNotifyEVChargingNeedsRequestHandler implements IServerNotifyEVChargingNeedsRequestHandler {
    @Override
    public NotifyEVChargingNeedsResponse handleNotifyEVChargingNeedsRequest(UUID sessionIndex, NotifyEVChargingNeedsRequest request) {
        return new NotifyEVChargingNeedsResponse(NotifyEVChargingNeedsStatusEnumType.ACCEPTED);
    }
}
