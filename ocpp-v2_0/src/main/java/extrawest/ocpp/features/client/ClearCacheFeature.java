package extrawest.ocpp.features.client;

import com.extrawest.ocpp_2_0_1.constants.FeatureConstants;
import com.extrawest.common.feature.Feature;
import com.extrawest.ocpp_2_0_1.features.client.handlers.IClientClearCacheRequestHandler;
import com.extrawest.common.model.Confirmation;
import com.extrawest.common.model.Request;
import com.extrawest.ocpp_2_0_1.model.request.ClearCacheRequest;
import com.extrawest.ocpp_2_0_1.model.response.ClearCacheResponse;

import java.util.UUID;

public class ClearCacheFeature implements Feature {
    private final IClientClearCacheRequestHandler handler;

    public ClearCacheFeature(IClientClearCacheRequestHandler handler) {
        this.handler = handler;
    }

    @Override
    public Confirmation handleRequest(UUID sessionIndex, Request request) {
        return handler.handleClearCacheRequest((ClearCacheRequest) request);
    }

    @Override
    public Class<? extends Request> getRequestType() {
        return ClearCacheRequest.class;
    }

    @Override
    public Class<? extends Confirmation> getConfirmationType() {
        return ClearCacheResponse.class;
    }

    @Override
    public String getAction() {
        return FeatureConstants.CLEAR_CACHE.value();
    }
}
