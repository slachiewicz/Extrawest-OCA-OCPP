package extrawest.ocpp.features.server;

import com.extrawest.ocpp_2_0_1.constants.FeatureConstants;
import com.extrawest.common.feature.Feature;
import com.extrawest.ocpp_2_0_1.features.server.handlers.IServerGetCertificateStatusRequestHandler;
import com.extrawest.common.model.Confirmation;
import com.extrawest.common.model.Request;
import com.extrawest.ocpp_2_0_1.model.request.GetCertificateStatusRequest;
import com.extrawest.ocpp_2_0_1.model.response.GetCertificateStatusResponse;

import java.util.UUID;

public class GetCertificateStatusFeature implements Feature {
    private final IServerGetCertificateStatusRequestHandler handler;

    public GetCertificateStatusFeature(IServerGetCertificateStatusRequestHandler handler) {
        this.handler = handler;
    }

    @Override
    public Confirmation handleRequest(UUID sessionIndex, Request request) {
        return handler.handleGetCertificateStatusRequest(sessionIndex, (GetCertificateStatusRequest) request);
    }

    @Override
    public Class<? extends Request> getRequestType() {
        return GetCertificateStatusRequest.class;
    }

    @Override
    public Class<? extends Confirmation> getConfirmationType() {
        return GetCertificateStatusResponse.class;
    }

    @Override
    public String getAction() {
        return FeatureConstants.GET_CERTIFICATE_STATUS.value();
    }
}
