package extrawest.ocpp.features.client;

import com.extrawest.ocpp_2_0_1.constants.FeatureConstants;
import com.extrawest.common.feature.Feature;
import com.extrawest.ocpp_2_0_1.features.client.handlers.IClientUnlockConnectorRequestHandler;
import com.extrawest.common.model.Confirmation;
import com.extrawest.common.model.Request;
import com.extrawest.ocpp_2_0_1.model.request.UnlockConnectorRequest;
import com.extrawest.ocpp_2_0_1.model.response.UnlockConnectorResponse;

import java.util.UUID;

public class UnlockConnectorFeature implements Feature {
    private final IClientUnlockConnectorRequestHandler handler;

    public UnlockConnectorFeature(IClientUnlockConnectorRequestHandler handler) {
        this.handler = handler;
    }

    @Override
    public Confirmation handleRequest(UUID sessionIndex, Request request) {
        return handler.handleUnlockConnectorRequest((UnlockConnectorRequest) request);
    }

    @Override
    public Class<? extends Request> getRequestType() {
        return UnlockConnectorRequest.class;
    }

    @Override
    public Class<? extends Confirmation> getConfirmationType() {
        return UnlockConnectorResponse.class;
    }

    @Override
    public String getAction() {
        return FeatureConstants.UNLOCK_CONNECTOR.value();
    }
}
