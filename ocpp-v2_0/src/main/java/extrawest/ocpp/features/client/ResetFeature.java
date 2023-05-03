package extrawest.ocpp.features.client;

import com.extrawest.ocpp_2_0_1.constants.FeatureConstants;
import com.extrawest.common.feature.Feature;
import com.extrawest.ocpp_2_0_1.features.client.handlers.IClientResetRequestHandler;
import com.extrawest.common.model.Confirmation;
import com.extrawest.common.model.Request;
import com.extrawest.ocpp_2_0_1.model.request.ResetRequest;
import com.extrawest.ocpp_2_0_1.model.response.ResetResponse;

import java.util.UUID;

public class ResetFeature implements Feature {
    private final IClientResetRequestHandler handler;

    public ResetFeature(IClientResetRequestHandler handler) {
        this.handler = handler;
    }

    @Override
    public Confirmation handleRequest(UUID sessionIndex, Request request) {
        return handler.handleResetRequest((ResetRequest) request);
    }

    @Override
    public Class<? extends Request> getRequestType() {
        return ResetRequest.class;
    }

    @Override
    public Class<? extends Confirmation> getConfirmationType() {
        return ResetResponse.class;
    }

    @Override
    public String getAction() {
        return FeatureConstants.RESET.value();
    }
}
