package extrawest.ocpp.features.client;

import com.extrawest.ocpp_2_0_1.constants.FeatureConstants;
import com.extrawest.common.feature.Feature;
import com.extrawest.ocpp_2_0_1.features.client.handlers.IClientGetLocalListVersionRequestHandler;
import com.extrawest.common.model.Confirmation;
import com.extrawest.common.model.Request;
import com.extrawest.ocpp_2_0_1.model.request.GetLocalListVersionRequest;
import com.extrawest.ocpp_2_0_1.model.response.GetLocalListVersionResponse;

import java.util.UUID;

public class GetLocalListVersionFeature implements Feature {
    private final IClientGetLocalListVersionRequestHandler handler;

    public GetLocalListVersionFeature(IClientGetLocalListVersionRequestHandler handler) {
        this.handler = handler;
    }

    @Override
    public Confirmation handleRequest(UUID sessionIndex, Request request) {
        return handler.handleGetLocalListVersionRequest((GetLocalListVersionRequest) request);
    }

    @Override
    public Class<? extends Request> getRequestType() {
        return GetLocalListVersionRequest.class;
    }

    @Override
    public Class<? extends Confirmation> getConfirmationType() {
        return GetLocalListVersionResponse.class;
    }

    @Override
    public String getAction() {
        return FeatureConstants.GET_LOCAL_LIST_VERSION.value();
    }
}
