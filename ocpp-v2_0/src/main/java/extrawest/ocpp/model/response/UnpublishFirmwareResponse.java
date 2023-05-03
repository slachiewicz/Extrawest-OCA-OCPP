package extrawest.ocpp.model.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.extrawest.common.model.Confirmation;
import com.extrawest.ocpp_2_0_1.model.dataTypes.CustomDataType;
import com.extrawest.ocpp_2_0_1.model.dataTypes.enums.UnpublishFirmwareStatusEnumType;
import com.extrawest.common.model.validation.RequiredValidator;
import com.extrawest.common.model.validation.Validator;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "customData",
        "status"
})
@Getter
@ToString
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class UnpublishFirmwareResponse extends Confirmation {

    private final transient Validator<Object> requiredValidator = new RequiredValidator();

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     *
     */
    @JsonProperty("customData")
    @JsonPropertyDescription("This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.")
    public CustomDataType customData;
    /**
     * Indicates whether the Local Controller succeeded in unpublishing the firmware.
     *
     * (Required)
     *
     */
    @JsonProperty("status")
    @JsonPropertyDescription("Indicates whether the Local Controller succeeded in unpublishing the firmware.\r\n")
    public UnpublishFirmwareStatusEnumType status;

    public UnpublishFirmwareResponse(UnpublishFirmwareStatusEnumType status) {
        requiredValidator.validate(status);
        this.status = status;
    }

    public void setCustomData(CustomDataType customData) {
        this.customData = customData;
    }

    public void setStatus(UnpublishFirmwareStatusEnumType status) {
        requiredValidator.validate(status);
        this.status = status;
    }

    @Override
    public boolean validate() {
        return requiredValidator.safeValidate(status);
    }
}
