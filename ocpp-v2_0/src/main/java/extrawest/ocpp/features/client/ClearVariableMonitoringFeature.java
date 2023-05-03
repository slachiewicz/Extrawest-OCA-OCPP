package extrawest.ocpp.features.client;

import com.extrawest.ocpp_2_0_1.constants.FeatureConstants;
import com.extrawest.common.feature.Feature;
import com.extrawest.ocpp_2_0_1.features.client.handlers.IClientClearVariableMonitoringRequestHandler;
import com.extrawest.common.model.Confirmation;
import com.extrawest.common.model.Request;
import com.extrawest.ocpp_2_0_1.model.request.ClearVariableMonitoringRequest;
import com.extrawest.ocpp_2_0_1.model.response.ClearVariableMonitoringResponse;

import java.util.UUID;

public class ClearVariableMonitoringFeature implements Feature {
    private final IClientClearVariableMonitoringRequestHandler handler;

    public ClearVariableMonitoringFeature(IClientClearVariableMonitoringRequestHandler handler) {
        this.handler = handler;
    }

    @Override
    public Confirmation handleRequest(UUID sessionIndex, Request request) {
        return handler.handleClearVariableMonitoringRequest((ClearVariableMonitoringRequest) request);
    }

    @Override
    public Class<? extends Request> getRequestType() {
        return ClearVariableMonitoringRequest.class;
    }

    @Override
    public Class<? extends Confirmation> getConfirmationType() {
        return ClearVariableMonitoringResponse.class;
    }

    @Override
    public String getAction() {
        return FeatureConstants.CLEAR_VARIABLE_MONITORING.value();
    }
}
