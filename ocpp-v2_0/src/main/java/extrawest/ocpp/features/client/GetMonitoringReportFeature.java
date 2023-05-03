package extrawest.ocpp.features.client;

import com.extrawest.ocpp_2_0_1.constants.FeatureConstants;
import com.extrawest.common.feature.Feature;
import com.extrawest.ocpp_2_0_1.features.client.handlers.IClientGetMonitoringReportRequestHandler;
import com.extrawest.common.model.Confirmation;
import com.extrawest.common.model.Request;
import com.extrawest.ocpp_2_0_1.model.request.GetMonitoringReportRequest;
import com.extrawest.ocpp_2_0_1.model.response.GetMonitoringReportResponse;

import java.util.UUID;

public class GetMonitoringReportFeature implements Feature {
    private final IClientGetMonitoringReportRequestHandler handler;

    public GetMonitoringReportFeature(IClientGetMonitoringReportRequestHandler handler) {
        this.handler = handler;
    }

    @Override
    public Confirmation handleRequest(UUID sessionIndex, Request request) {
        return handler.handleGetMonitoringReportRequest((GetMonitoringReportRequest) request);
    }

    @Override
    public Class<? extends Request> getRequestType() {
        return GetMonitoringReportRequest.class;
    }

    @Override
    public Class<? extends Confirmation> getConfirmationType() {
        return GetMonitoringReportResponse.class;
    }

    @Override
    public String getAction() {
        return FeatureConstants.GET_MONITORING_REPORT.value();
    }
}
