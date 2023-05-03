package extrawest.ocppv2_0_1clientexample.handlers;

import com.extrawest.ocpp_2_0_1.features.client.handlers.IClientInstallCertificateRequestHandler;
import com.extrawest.ocpp_2_0_1.model.dataTypes.enums.InstallCertificateStatusEnumType;
import com.extrawest.ocpp_2_0_1.model.request.InstallCertificateRequest;
import com.extrawest.ocpp_2_0_1.model.response.InstallCertificateResponse;

public class ClientInstallCertificateRequestHandler implements IClientInstallCertificateRequestHandler {
    @Override
    public InstallCertificateResponse handleInstallCertificateRequest(InstallCertificateRequest request) {
        System.out.println(request.toString());
        return new InstallCertificateResponse(InstallCertificateStatusEnumType.ACCEPTED);
    }
}
