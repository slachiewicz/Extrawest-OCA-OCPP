package extrawest.ocppv2_0_1clientexample.handlers;

import com.extrawest.ocpp_2_0_1.features.client.handlers.IClientCertificateSignedRequestHandler;
import com.extrawest.ocpp_2_0_1.model.dataTypes.enums.CertificateSignedStatusEnumType;
import com.extrawest.ocpp_2_0_1.model.request.CertificateSignedRequest;
import com.extrawest.ocpp_2_0_1.model.response.CertificateSignedResponse;

public class ClientCertificateSignedRequestHandler implements IClientCertificateSignedRequestHandler {
    @Override
    public CertificateSignedResponse handleCertificateSignedRequest(CertificateSignedRequest request) {
        System.out.println(request.toString());
        return new CertificateSignedResponse(CertificateSignedStatusEnumType.ACCEPTED);
    }
}
