package CheckInDomain.modal.valueObject;

import ShareKernel.rule.StringNotNullOrEmptyRule;
import ShareKernel.core.BussinessRuleValidateExeption;
import ShareKernel.core.ValueObject;

public class CodigoSeguridad extends ValueObject {

    private String Value;

    public CodigoSeguridad(String value) throws BussinessRuleValidateExeption {
        CheckRule(new StringNotNullOrEmptyRule(value));
        //TODO: validar el formato del numero
        Value = value;
    }
}
