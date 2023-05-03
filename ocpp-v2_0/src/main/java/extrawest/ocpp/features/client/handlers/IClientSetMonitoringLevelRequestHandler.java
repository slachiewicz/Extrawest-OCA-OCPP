package extrawest.ocpp.features.client.handlers;

import com.extrawest.ocpp_2_0_1.model.request.SetMonitoringLevelRequest;
import com.extrawest.ocpp_2_0_1.model.response.SetMonitoringLevelResponse;

/** Charging Station handler of {@link SetMonitoringLevelRequest} */
public interface IClientSetMonitoringLevelRequestHandler {
    SetMonitoringLevelResponse handleSetMonitoringLevelRequest(SetMonitoringLevelRequest request);
}
