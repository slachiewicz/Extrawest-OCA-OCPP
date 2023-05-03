package extrawest.ocpp.features.client.handlers;

import vmodel.request.GetCompositeScheduleRequest;
import vmodel.response.GetCompositeScheduleResponse;

/** Charging Station handler of {@link GetCompositeScheduleRequest} */
public interface IClientGetCompositeScheduleRequestHandler {
    GetCompositeScheduleResponse handleGetCompositeScheduleRequest(GetCompositeScheduleRequest request);
}
