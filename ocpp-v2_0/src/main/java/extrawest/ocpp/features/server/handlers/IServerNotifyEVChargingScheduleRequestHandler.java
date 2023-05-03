package extrawest.ocpp.features.server.handlers;

import com.extrawest.ocpp_2_0_1.model.request.NotifyEVChargingScheduleRequest;
import com.extrawest.ocpp_2_0_1.model.response.NotifyEVChargingScheduleResponse;

import java.util.UUID;

/** Central system handler of {@link NotifyEVChargingScheduleRequest}s. */
public interface IServerNotifyEVChargingScheduleRequestHandler {
    NotifyEVChargingScheduleResponse handleNotifyEVChargingScheduleRequest(
            UUID sessionIndex, NotifyEVChargingScheduleRequest request);
}
