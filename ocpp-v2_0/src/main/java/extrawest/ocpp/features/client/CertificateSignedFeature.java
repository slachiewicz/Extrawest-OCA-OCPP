package extrawest.ocpp.features.client;

import com.extrawest.ocpp_2_0_1.constants.FeatureConstants;
import com.extrawest.common.feature.Feature;
import com.extrawest.ocpp_2_0_1.features.client.handlers.IClientCertificateSignedRequestHandler;
import com.extrawest.common.model.Confirmation;
import com.extrawest.common.model.Request;
import com.extrawest.ocpp_2_0_1.model.request.CertificateSignedRequest;
import com.extrawest.ocpp_2_0_1.model.response.CertificateSignedResponse;

import java.util.UUID;

public class CertificateSignedFeature implements Feature {
    private final IClientCertificateSignedRequestHandler handler;

    public CertificateSignedFeature(IClientCertificateSignedRequestHandler handler) {
        this.handler = handler;
    }

    @Override
    public Confirmation handleRequest(UUID sessionIndex, Request request) {
        return handler.handleCertificateSignedRequest((CertificateSignedRequest) request);
    }

    @Override
    public Class<? extends Request> getRequestType() {
        return CertificateSignedRequest.class;
    }

    @Override
    public Class<? extends Confirmation> getConfirmationType() {
        return CertificateSignedResponse.class;
    }

    @Override
    public String getAction() {
        return FeatureConstants.CERTIFICATE_SIGNED.value();
    }
}
