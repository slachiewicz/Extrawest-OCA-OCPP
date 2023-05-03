package extrawest.ocpp.features.client.handlers;

import com.extrawest.ocpp_2_0_1.model.request.ClearCacheRequest;
import com.extrawest.ocpp_2_0_1.model.response.ClearCacheResponse;

/** Charging Station handler of {@link ClearCacheRequest} */
public interface IClientClearCacheRequestHandler {
    ClearCacheResponse handleClearCacheRequest(ClearCacheRequest request);
}
