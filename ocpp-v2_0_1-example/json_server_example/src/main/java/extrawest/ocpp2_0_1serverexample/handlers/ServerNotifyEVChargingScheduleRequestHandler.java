package extrawest.ocpp2_0_1serverexample.handlers;

import com.extrawest.ocpp_2_0_1.features.server.handlers.IServerNotifyEVChargingScheduleRequestHandler;
import com.extrawest.ocpp_2_0_1.model.dataTypes.enums.GenericStatusEnumType;
import com.extrawest.ocpp_2_0_1.model.request.NotifyEVChargingScheduleRequest;
import com.extrawest.ocpp_2_0_1.model.response.NotifyEVChargingScheduleResponse;

import java.util.UUID;

public class ServerNotifyEVChargingScheduleRequestHandler implements IServerNotifyEVChargingScheduleRequestHandler {
    @Override
    public NotifyEVChargingScheduleResponse handleNotifyEVChargingScheduleRequest(UUID sessionIndex, NotifyEVChargingScheduleRequest request) {
        return new NotifyEVChargingScheduleResponse(GenericStatusEnumType.ACCEPTED);
    }
}
