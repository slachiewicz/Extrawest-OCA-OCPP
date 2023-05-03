package extrawest.ocpp.features.client.handlers;

import com.extrawest.ocpp_2_0_1.model.request.SetMonitoringBaseRequest;
import com.extrawest.ocpp_2_0_1.model.response.SetMonitoringBaseResponse;

/** Charging Station handler of {@link SetMonitoringBaseRequest} */
public interface IClientSetMonitoringBaseRequestHandler {
    SetMonitoringBaseResponse handleSetMonitoringBaseRequest(SetMonitoringBaseRequest request);
}
