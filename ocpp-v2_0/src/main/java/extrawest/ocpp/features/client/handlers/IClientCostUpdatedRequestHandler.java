package extrawest.ocpp.features.client.handlers;

import com.extrawest.ocpp_2_0_1.
        com.extrawest.ocpp_2_0_1.model.response.CostUpdatedResponse;

/** Charging Station handler of {@link CostUpdatedRequest} */
public interface IClientCostUpdatedRequestHandler {
    CostUpdatedResponse handleCostUpdatedRequest(CostUpdatedRequest request);
}
