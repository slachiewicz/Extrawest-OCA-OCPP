package extrawest.ocpp.features.client;

import com.extrawest.ocpp_2_0_1.constants.FeatureConstants;
import com.extrawest.common.feature.Feature;
import com.extrawest.ocpp_2_0_1.features.client.handlers.IClientReserveNowRequestHandler;
import com.extrawest.common.model.Confirmation;
import com.extrawest.common.model.Request;
import com.extrawest.ocpp_2_0_1.model.request.ReserveNowRequest;
import com.extrawest.ocpp_2_0_1.model.response.ReserveNowResponse;

import java.util.UUID;

public class ReserveNowFeature implements Feature {
    private final IClientReserveNowRequestHandler handler;

    public ReserveNowFeature(IClientReserveNowRequestHandler handler) {
        this.handler = handler;
    }

    @Override
    public Confirmation handleRequest(UUID sessionIndex, Request request) {
        return handler.handleReserveNowRequest((ReserveNowRequest) request);
    }

    @Override
    public Class<? extends Request> getRequestType() {
        return ReserveNowRequest.class;
    }

    @Override
    public Class<? extends Confirmation> getConfirmationType() {
        return ReserveNowResponse.class;
    }

    @Override
    public String getAction() {
        return FeatureConstants.RESERVE_NOW.value();
    }
}
