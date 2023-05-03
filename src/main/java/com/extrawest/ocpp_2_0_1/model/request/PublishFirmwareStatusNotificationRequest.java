package com.extrawest.ocpp_2_0_1.model.request;

import com.extrawest.common.model.RequestWithId;
import com.extrawest.common.model.validation.RequiredValidator;
import com.extrawest.common.model.validation.Validator;
import com.extrawest.common.model.validation.ValidatorBuilder;
import com.extrawest.ocpp_2_0_1.model.dataTypes.CustomDataType;
import com.extrawest.ocpp_2_0_1.model.dataTypes.enums.PublishFirmwareStatusEnumType;
import com.extrawest.ocpp_2_0_1.model.validation.OCPP2PrimDatatypes;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "customData",
        "status",
        "location",
        "requestId"
})
@Getter
@ToString
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class PublishFirmwareStatusNotificationRequest extends RequestWithId {

    private final transient Validator<Object> requiredValidator = new RequiredValidator();

    private final transient Validator locationValidator = new ValidatorBuilder().addRule(OCPP2PrimDatatypes.string512()).build();

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     *
     */
    @JsonProperty("customData")
    public CustomDataType customData;
    /**
     * This contains the progress status of the publishfirmware
     * installation.
     *
     * (Required)
     *
     */
    @JsonProperty("status")
    public PublishFirmwareStatusEnumType status;
    /**
     * Required if status is Published. Can be multiple URI’s, if the Local Controller supports e.g. HTTP, HTTPS, and FTP.
     *
     *
     */
    @JsonProperty("location")
    public List<String> location;
    /**
     * The request id that was
     * provided in the
     * PublishFirmwareRequest which
     * triggered this action.
     *
     *
     */
    @JsonProperty("requestId")
    public Integer requestId;

    public PublishFirmwareStatusNotificationRequest(PublishFirmwareStatusEnumType status) {
        requiredValidator.validate(status);
        this.status = status;
    }

    public void setCustomData(CustomDataType customData) {
        this.customData = customData;
    }

    public void setStatus(PublishFirmwareStatusEnumType status) {
        this.status = status;
    }

    public void setLocation(List<String> location) {
        for (String l:location) {
            locationValidator.validate(l);
        }
        this.location = location;
    }

    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    @Override
    public boolean transactionRelated() {
        return false;
    }

    @Override
    public boolean validate() {
        return requiredValidator.safeValidate(status);
    }
}
