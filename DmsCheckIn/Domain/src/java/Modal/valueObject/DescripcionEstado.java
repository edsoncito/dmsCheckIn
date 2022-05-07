package Modal.valueObject;

import SharedKernel.core.BussinessRuleValidateExeption;
import SharedKernel.core.ValueObject;
import SharedKernel.rule.StringNotNullOrEmptyRule;

public class DescripcionEstado extends ValueObject {

    private String Value;

    public DescripcionEstado(String value) throws BussinessRuleValidateExeption {
        if(Value.length() > 50){
            throw new BussinessRuleValidateExeption("No debe ser mayor a 50 caracteres");
        }
        Value = value;
    }
}
