package extrawest.ocpp.features.client;

import com.extrawest.ocpp_2_0_1.constants.FeatureConstants;
import com.extrawest.common.feature.Feature;
import com.extrawest.ocpp_2_0_1.features.client.handlers.IClientInstallCertificateRequestHandler;
import com.extrawest.common.model.Confirmation;
import com.extrawest.common.model.Request;
import com.extrawest.ocpp_2_0_1.model.request.InstallCertificateRequest;
import com.extrawest.ocpp_2_0_1.model.response.InstallCertificateResponse;

import java.util.UUID;

public class InstallCertificateFeature implements Feature {
    private final IClientInstallCertificateRequestHandler handler;

    public InstallCertificateFeature(IClientInstallCertificateRequestHandler handler) {
        this.handler = handler;
    }

    @Override
    public Confirmation handleRequest(UUID sessionIndex, Request request) {
        return handler.handleInstallCertificateRequest((InstallCertificateRequest) request);
    }

    @Override
    public Class<? extends Request> getRequestType() {
        return InstallCertificateRequest.class;
    }

    @Override
    public Class<? extends Confirmation> getConfirmationType() {
        return InstallCertificateResponse.class;
    }

    @Override
    public String getAction() {
        return FeatureConstants.INSTALL_CERTIFICATE.value();
    }
}
