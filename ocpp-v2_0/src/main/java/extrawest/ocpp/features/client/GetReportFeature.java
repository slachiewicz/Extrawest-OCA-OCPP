package extrawest.ocpp.features.client;

import com.extrawest.ocpp_2_0_1.constants.FeatureConstants;
import com.extrawest.common.feature.Feature;
import com.extrawest.ocpp_2_0_1.features.client.handlers.IClientGetReportRequestHandler;
import com.extrawest.common.model.Confirmation;
import com.extrawest.common.model.Request;
import com.extrawest.ocpp_2_0_1.model.request.GetReportRequest;
import com.extrawest.ocpp_2_0_1.model.response.GetReportResponse;

import java.util.UUID;

public class GetReportFeature implements Feature {
    private final IClientGetReportRequestHandler handler;

    public GetReportFeature(IClientGetReportRequestHandler handler) {
        this.handler = handler;
    }

    @Override
    public Confirmation handleRequest(UUID sessionIndex, Request request) {
        return handler.handleGetReportRequest((GetReportRequest) request);
    }

    @Override
    public Class<? extends Request> getRequestType() {
        return GetReportRequest.class;
    }

    @Override
    public Class<? extends Confirmation> getConfirmationType() {
        return GetReportResponse.class;
    }

    @Override
    public String getAction() {
        return FeatureConstants.GET_REPORT.value();
    }
}
