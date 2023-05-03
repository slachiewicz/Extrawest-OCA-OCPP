package extrawest.ocpp.features.client;

import com.extrawest.ocpp_2_0_1.constants.FeatureConstants;
import com.extrawest.common.feature.Feature;
import com.extrawest.ocpp_2_0_1.features.client.handlers.IClientCostUpdatedRequestHandler;
import com.extrawest.common.model.Confirmation;
import com.extrawest.common.model.Request;
import com.extrawest.ocpp_2_0_1.model.request.CostUpdatedRequest;
import com.extrawest.ocpp_2_0_1.model.response.CostUpdatedResponse;

import java.util.UUID;

public class CostUpdatedFeature implements Feature {
    private final IClientCostUpdatedRequestHandler handler;

    public CostUpdatedFeature(IClientCostUpdatedRequestHandler handler) {
        this.handler = handler;
    }

    @Override
    public Confirmation handleRequest(UUID sessionIndex, Request request) {
        return handler.handleCostUpdatedRequest((CostUpdatedRequest) request);
    }

    @Override
    public Class<? extends Request> getRequestType() {
        return CostUpdatedRequest.class;
    }

    @Override
    public Class<? extends Confirmation> getConfirmationType() {
        return CostUpdatedResponse.class;
    }

    @Override
    public String getAction() {
        return FeatureConstants.COST_UPDATED.value();
    }
}
