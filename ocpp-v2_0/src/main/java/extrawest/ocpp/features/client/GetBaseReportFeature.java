package extrawest.ocpp.features.client;

import com.extrawest.ocpp_2_0_1.constants.FeatureConstants;
import com.extrawest.common.feature.Feature;
import com.extrawest.ocpp_2_0_1.features.client.handlers.IClientGetBaseReportRequestHandler;
import com.extrawest.common.model.Confirmation;
import com.extrawest.common.model.Request;
import com.extrawest.ocpp_2_0_1.model.request.GetBaseReportRequest;
import com.extrawest.ocpp_2_0_1.model.response.GetBaseReportResponse;

import java.util.UUID;

public class GetBaseReportFeature implements Feature {
    private final IClientGetBaseReportRequestHandler handler;

    public GetBaseReportFeature(IClientGetBaseReportRequestHandler handler) {
        this.handler = handler;
    }

    @Override
    public Confirmation handleRequest(UUID sessionIndex, Request request) {
        return handler.handleGetBaseReportRequest((GetBaseReportRequest) request);
    }

    @Override
    public Class<? extends Request> getRequestType() {
        return GetBaseReportRequest.class;
    }

    @Override
    public Class<? extends Confirmation> getConfirmationType() {
        return GetBaseReportResponse.class;
    }

    @Override
    public String getAction() {
        return FeatureConstants.GET_BASE_REPORT.value();
    }
}
