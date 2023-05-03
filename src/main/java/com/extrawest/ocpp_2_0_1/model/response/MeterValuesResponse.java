package com.extrawest.ocpp_2_0_1.model.response;

import com.extrawest.common.model.Confirmation;
import com.extrawest.ocpp_2_0_1.model.dataTypes.CustomDataType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "customData"
})
@Getter
@Setter
@ToString
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class MeterValuesResponse extends Confirmation {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     *
     */
    @JsonProperty("customData")
    public CustomDataType customData;

    @Override
    public boolean validate() {
        return true;
    }
}
