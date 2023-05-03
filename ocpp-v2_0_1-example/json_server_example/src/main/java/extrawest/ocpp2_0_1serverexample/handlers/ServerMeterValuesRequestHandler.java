package extrawest.ocpp2_0_1serverexample.handlers;

import com.extrawest.ocpp_2_0_1.features.server.handlers.IServerMeterValuesRequestHandler;
import com.extrawest.ocpp_2_0_1.model.request.MeterValuesRequest;
import com.extrawest.ocpp_2_0_1.model.response.MeterValuesResponse;

import java.util.UUID;

public class ServerMeterValuesRequestHandler implements IServerMeterValuesRequestHandler {
    @Override
    public MeterValuesResponse handleMeterValuesRequest(UUID sessionIndex, MeterValuesRequest request) {
        return new MeterValuesResponse();
    }
}
