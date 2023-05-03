package extrawest.ocpp.features.client;

import com.extrawest.ocpp_2_0_1.constants.FeatureConstants;
import com.extrawest.common.feature.Feature;
import com.extrawest.ocpp_2_0_1.features.client.handlers.IClientGetCompositeScheduleRequestHandler;
import com.extrawest.common.model.Confirmation;
import com.extrawest.common.model.Request;
import com.extrawest.ocpp_2_0_1.model.request.GetCompositeScheduleRequest;
import com.extrawest.ocpp_2_0_1.model.response.GetCompositeScheduleResponse;

import java.util.UUID;

public class GetCompositeScheduleFeature implements Feature {
    private final IClientGetCompositeScheduleRequestHandler handler;

    public GetCompositeScheduleFeature(IClientGetCompositeScheduleRequestHandler handler) {
        this.handler = handler;
    }

    @Override
    public Confirmation handleRequest(UUID sessionIndex, Request request) {
        return handler.handleGetCompositeScheduleRequest((GetCompositeScheduleRequest) request);
    }

    @Override
    public Class<? extends Request> getRequestType() {
        return GetCompositeScheduleRequest.class;
    }

    @Override
    public Class<? extends Confirmation> getConfirmationType() {
        return GetCompositeScheduleResponse.class;
    }

    @Override
    public String getAction() {
        return FeatureConstants.GET_COMPOSITE_SCHEDULE.value();
    }
}
