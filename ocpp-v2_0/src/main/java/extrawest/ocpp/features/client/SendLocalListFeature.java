package extrawest.ocpp.features.client;

import com.extrawest.ocpp_2_0_1.constants.FeatureConstants;
import com.extrawest.common.feature.Feature;
import com.extrawest.ocpp_2_0_1.features.client.handlers.IClientSendLocalListRequestHandler;
import com.extrawest.common.model.Confirmation;
import com.extrawest.common.model.Request;
import com.extrawest.ocpp_2_0_1.model.request.SendLocalListRequest;
import com.extrawest.ocpp_2_0_1.model.response.SendLocalListResponse;

import java.util.UUID;

public class SendLocalListFeature implements Feature {
    private final IClientSendLocalListRequestHandler handler;

    public SendLocalListFeature(IClientSendLocalListRequestHandler handler) {
        this.handler = handler;
    }

    @Override
    public Confirmation handleRequest(UUID sessionIndex, Request request) {
        return handler.handleSendLocalListRequest((SendLocalListRequest) request);
    }

    @Override
    public Class<? extends Request> getRequestType() {
        return SendLocalListRequest.class;
    }

    @Override
    public Class<? extends Confirmation> getConfirmationType() {
        return SendLocalListResponse.class;
    }

    @Override
    public String getAction() {
        return FeatureConstants.SEND_LOCAL_LIST.value();
    }
}
