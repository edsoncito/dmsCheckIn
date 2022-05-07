package Modal.valueObject;

import SharedKernel.core.BussinessRuleValidateExeption;
import SharedKernel.core.ValueObject;
import SharedKernel.rule.StringNotNullOrEmptyRule;

public class CodigoSeguridad extends ValueObject {

    private String Value;

    public CodigoSeguridad(String value) throws BussinessRuleValidateExeption {
        CheckRule(new StringNotNullOrEmptyRule(value));
        //TODO: validar el formato del numero
        Value = value;
    }
}
