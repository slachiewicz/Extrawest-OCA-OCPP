package extrawest.ocpp.features.client.handlers;

import com.extrawest.ocpp_2_0_1.model.request.SetVariableMonitoringRequest;
import com.extrawest.ocpp_2_0_1.model.response.SetVariableMonitoringResponse;

/** Charging Station handler of {@link SetVariableMonitoringRequest} */
public interface IClientSetVariableMonitoringRequestHandler {
    SetVariableMonitoringResponse handleSetVariableMonitoringRequest(SetVariableMonitoringRequest request);
}
