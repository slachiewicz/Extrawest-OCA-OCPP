package extrawest.ocpp.features.client;

import com.extrawest.ocpp_2_0_1.constants.FeatureConstants;
import com.extrawest.common.feature.Feature;
import com.extrawest.ocpp_2_0_1.features.client.handlers.IClientSetDisplayMessageRequestHandler;
import com.extrawest.common.model.Confirmation;
import com.extrawest.common.model.Request;
import com.extrawest.ocpp_2_0_1.model.request.SetDisplayMessageRequest;
import com.extrawest.ocpp_2_0_1.model.response.SetDisplayMessageResponse;

import java.util.UUID;

public class SetDisplayMessageFeature implements Feature {
    private final IClientSetDisplayMessageRequestHandler handler;

    public SetDisplayMessageFeature(IClientSetDisplayMessageRequestHandler handler) {
        this.handler = handler;
    }

    @Override
    public Confirmation handleRequest(UUID sessionIndex, Request request) {
        return handler.handleSetDisplayMessageRequest((SetDisplayMessageRequest) request);
    }

    @Override
    public Class<? extends Request> getRequestType() {
        return SetDisplayMessageRequest.class;
    }

    @Override
    public Class<? extends Confirmation> getConfirmationType() {
        return SetDisplayMessageResponse.class;
    }

    @Override
    public String getAction() {
        return FeatureConstants.SET_DISPLAY_MESSAGE.value();
    }
}
