package extrawest.ocppv2_0_1clientexample.handlers;

import com.extrawest.ocpp_2_0_1.features.client.handlers.IClientGetInstalledCertificateIdsRequestHandler;
import com.extrawest.ocpp_2_0_1.model.dataTypes.enums.GetInstalledCertificateStatusEnumType;
import com.extrawest.ocpp_2_0_1.model.request.GetInstalledCertificateIdsRequest;
import com.extrawest.ocpp_2_0_1.model.response.GetInstalledCertificateIdsResponse;

public class ClientGetInstalledCertificateIdsRequestHandler implements IClientGetInstalledCertificateIdsRequestHandler {
    @Override
    public GetInstalledCertificateIdsResponse handleGetInstalledCertificateIdsRequest(GetInstalledCertificateIdsRequest request) {
        System.out.println(request.toString());
        return new GetInstalledCertificateIdsResponse(GetInstalledCertificateStatusEnumType.ACCEPTED);
    }
}
