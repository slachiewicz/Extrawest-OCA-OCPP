package extrawest.ocpp.features.server;

import com.extrawest.ocpp_2_0_1.constants.FeatureConstants;
import com.extrawest.common.feature.Feature;
import com.extrawest.ocpp_2_0_1.features.server.handlers.IServerSignCertificateRequestHandler;
import com.extrawest.common.model.Confirmation;
import com.extrawest.common.model.Request;
import com.extrawest.ocpp_2_0_1.model.request.SignCertificateRequest;
import com.extrawest.ocpp_2_0_1.model.response.SignCertificateResponse;

import java.util.UUID;

public class SignCertificateFeature implements Feature {
    private final IServerSignCertificateRequestHandler handler;

    public SignCertificateFeature(IServerSignCertificateRequestHandler handler) {
        this.handler = handler;
    }

    @Override
    public Confirmation handleRequest(UUID sessionIndex, Request request) {
        return handler.handleSignCertificateRequest(sessionIndex, (SignCertificateRequest) request);
    }

    @Override
    public Class<? extends Request> getRequestType() {
        return SignCertificateRequest.class;
    }

    @Override
    public Class<? extends Confirmation> getConfirmationType() {
        return SignCertificateResponse.class;
    }

    @Override
    public String getAction() {
        return FeatureConstants.SIGN_CERTIFICATE.value();
    }
}
