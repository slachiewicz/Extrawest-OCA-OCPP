package extrawest.ocppv2_0_1clientexample.handlers;

import com.extrawest.ocpp_2_0_1.features.client.handlers.IClientDeleteCertificateRequestHandler;
import com.extrawest.ocpp_2_0_1.model.dataTypes.enums.DeleteCertificateStatusEnumType;
import com.extrawest.ocpp_2_0_1.model.request.DeleteCertificateRequest;
import com.extrawest.ocpp_2_0_1.model.response.DeleteCertificateResponse;

public class ClientDeleteCertificateRequestHandler implements IClientDeleteCertificateRequestHandler {
    @Override
    public DeleteCertificateResponse handleCancelDeleteCertificateRequest(DeleteCertificateRequest request) {
        System.out.println(request.toString());
        return new DeleteCertificateResponse(DeleteCertificateStatusEnumType.ACCEPTED);
    }
}
