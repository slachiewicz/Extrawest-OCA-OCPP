package com.extrawest.ocpp_2_0_1.model.request;

import com.extrawest.common.model.RequestWithId;
import com.extrawest.common.model.validation.Validator;
import com.extrawest.common.model.validation.ValidatorBuilder;
import com.extrawest.ocpp_2_0_1.model.dataTypes.CustomDataType;
import com.extrawest.ocpp_2_0_1.model.validation.OCPP2PrimDatatypes;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "customData",
        "transactionId"
})
@Getter
@ToString
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class RequestStopTransactionRequest extends RequestWithId {

    private final transient Validator transactionIdValidator =
            new ValidatorBuilder()
                    .addRule(OCPP2PrimDatatypes.identifierString())
                    .addRule(OCPP2PrimDatatypes.string36())
                    .setRequired(true)
                    .build();

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     *
     */
    @JsonProperty("customData")
    public CustomDataType customData;
    /**
     * The identifier of the transaction which the Charging Station is requested to stop.
     *
     * (Required)
     *
     */
    @JsonProperty("transactionId")
    public String transactionId;

    public RequestStopTransactionRequest(String transactionId) {
        transactionIdValidator.validate(transactionId);
        this.transactionId = transactionId;
    }

    public void setCustomData(CustomDataType customData) {
        this.customData = customData;
    }

    public void setTransactionId(String transactionId) {
        transactionIdValidator.validate(transactionId);
        this.transactionId = transactionId;
    }

    @Override
    public boolean transactionRelated() {
        return false;
    }

    @Override
    public boolean validate() {
        return transactionIdValidator.safeValidate(transactionId);
    }
}
