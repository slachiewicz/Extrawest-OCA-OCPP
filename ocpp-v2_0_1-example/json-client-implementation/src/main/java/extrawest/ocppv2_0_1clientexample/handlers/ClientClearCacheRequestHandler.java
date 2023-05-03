package extrawest.ocppv2_0_1clientexample.handlers;

import com.extrawest.ocpp_2_0_1.features.client.handlers.IClientClearCacheRequestHandler;
import com.extrawest.ocpp_2_0_1.model.dataTypes.enums.ClearCacheStatusEnumType;
import com.extrawest.ocpp_2_0_1.model.request.ClearCacheRequest;
import com.extrawest.ocpp_2_0_1.model.response.ClearCacheResponse;

public class ClientClearCacheRequestHandler implements IClientClearCacheRequestHandler {
    @Override
    public ClearCacheResponse handleClearCacheRequest(ClearCacheRequest request) {
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        System.out.println(request.toString());
        return new ClearCacheResponse(ClearCacheStatusEnumType.ACCEPTED);
    }
}
