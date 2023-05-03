package extrawest.ocpp.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.extrawest.common.model.RequestWithId;
import com.extrawest.ocpp_2_0_1.model.dataTypes.CertificateHashDataType;
import com.extrawest.ocpp_2_0_1.model.dataTypes.CustomDataType;
import com.extrawest.common.model.validation.RequiredValidator;
import com.extrawest.common.model.validation.Validator;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "customData",
        "certificateHashData"
})
@Getter
@ToString
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class DeleteCertificateRequest extends RequestWithId {

    private final transient Validator<Object> requiredValidator = new RequiredValidator();

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     *
     */
    @JsonProperty("customData")
    public CustomDataType customData;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("certificateHashData")
    public CertificateHashDataType certificateHashData;

    public DeleteCertificateRequest(CertificateHashDataType certificateHashData) {
        this.certificateHashData = certificateHashData;
    }

    public void setCustomData(CustomDataType customData) {
        this.customData = customData;
    }

    public void setCertificateHashData(CertificateHashDataType certificateHashData) {
        requiredValidator.validate(certificateHashData);
        this.certificateHashData = certificateHashData;
    }

    @Override
    public boolean transactionRelated() {
        return false;
    }

    @Override
    public boolean validate() {
        return requiredValidator.safeValidate(certificateHashData);
    }
}
