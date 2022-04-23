package modal.valueObject;

import rule.StringNotNullOrEmptyRule;
import util.BussinessRuleValidateExeption;
import util.ValueObject;

public class CodigoSeguridad extends ValueObject {

    private String Value;

    public CodigoSeguridad(String value) throws BussinessRuleValidateExeption {
        CheckRule(new StringNotNullOrEmptyRule(value));
        //TODO: validar el formato del numero
        Value = value;
    }
}
