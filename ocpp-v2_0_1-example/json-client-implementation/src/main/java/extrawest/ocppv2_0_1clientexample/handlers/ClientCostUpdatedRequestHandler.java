package extrawest.ocppv2_0_1clientexample.handlers;

import com.extrawest.ocpp_2_0_1.features.client.handlers.IClientCostUpdatedRequestHandler;
import com.extrawest.ocpp_2_0_1.model.request.CostUpdatedRequest;
import com.extrawest.ocpp_2_0_1.model.response.CostUpdatedResponse;

public class ClientCostUpdatedRequestHandler implements IClientCostUpdatedRequestHandler {
    @Override
    public CostUpdatedResponse handleCostUpdatedRequest(CostUpdatedRequest request) {
        System.out.println(request.toString());
        return new CostUpdatedResponse();
    }
}
