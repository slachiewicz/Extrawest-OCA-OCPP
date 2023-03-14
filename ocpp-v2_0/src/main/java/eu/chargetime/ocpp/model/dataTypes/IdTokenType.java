package eu.chargetime.ocpp.model.dataTypes;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import eu.chargetime.ocpp.model.Validatable;
import eu.chargetime.ocpp.model.dataTypes.enums.IdTokenEnum;
import eu.chargetime.ocpp.model.validation.OCPP2PrimDatatypes;
import eu.chargetime.ocpp.model.validation.RequiredValidator;
import eu.chargetime.ocpp.model.validation.Validator;
import eu.chargetime.ocpp.model.validation.ValidatorBuilder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.List;


/**
 * Contains a case insensitive identifier to use for the authorization and the type of authorization to support multiple forms of identifiers.
 *
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "customData",
        "additionalInfo",
        "idToken",
        "type"
})
@Getter
@EqualsAndHashCode
public class IdTokenType implements Validatable {

    private transient Validator idTokenValidator =
            new ValidatorBuilder().setRequired(true).addRule(OCPP2PrimDatatypes.string36()).build();

    private transient Validator<Object> requiredValidator = new RequiredValidator();

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     *
     */
    @JsonProperty("customData")
    public CustomData customData;
    @JsonProperty("additionalInfo")
    public List<AdditionalInfoType> additionalInfoType = null;
    /**
     * IdToken is case insensitive. Might hold the hidden id of an RFID tag, but can for example also contain a UUID.
     *
     * (Required)
     *
     */
    @JsonProperty("idToken")
    public String idToken;
    /**
     * Enumeration of possible idToken types.
     *
     * (Required)
     *
     */
    @JsonProperty("type")
    public IdTokenEnum type;

    public void setCustomData(CustomData customData) {
        this.customData = customData;
    }

    public void setAdditionalInfoType(List<AdditionalInfoType> additionalInfoType) {
        this.additionalInfoType = additionalInfoType;
    }

    public void setIdToken(String idToken) {
        idTokenValidator.validate(idToken);
        this.idToken = idToken;
    }

    public void setType(IdTokenEnum type) {
        requiredValidator.validate(type);
        this.type = type;
    }

    @Override
    public boolean validate() {
        return (additionalInfoType != null
                    && additionalInfoType.stream().filter(AdditionalInfoType::validate).count() == additionalInfoType.size())
                && requiredValidator.safeValidate(type)
                && requiredValidator.safeValidate(idToken);
    }
}
