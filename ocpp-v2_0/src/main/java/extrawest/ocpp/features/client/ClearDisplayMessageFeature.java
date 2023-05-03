package extrawest.ocpp.features.client;

import com.extrawest.ocpp_2_0_1.constants.FeatureConstants;
import com.extrawest.common.feature.Feature;
import com.extrawest.ocpp_2_0_1.features.client.handlers.IClientClearDisplayMessageRequestHandler;
import com.extrawest.common.model.Confirmation;
import com.extrawest.common.model.Request;
import com.extrawest.ocpp_2_0_1.model.request.ClearDisplayMessageRequest;
import com.extrawest.ocpp_2_0_1.model.response.ClearDisplayMessageResponse;

import java.util.UUID;

public class ClearDisplayMessageFeature implements Feature {
    private final IClientClearDisplayMessageRequestHandler handler;

    public ClearDisplayMessageFeature(IClientClearDisplayMessageRequestHandler handler) {
        this.handler = handler;
    }

    @Override
    public Confirmation handleRequest(UUID sessionIndex, Request request) {
        return handler.handleClearDisplayMessageRequest((ClearDisplayMessageRequest) request);
    }

    @Override
    public Class<? extends Request> getRequestType() {
        return ClearDisplayMessageRequest.class;
    }

    @Override
    public Class<? extends Confirmation> getConfirmationType() {
        return ClearDisplayMessageResponse.class;
    }

    @Override
    public String getAction() {
        return FeatureConstants.CLEAR_DISPLAY_MESSAGE.value();
    }
}
