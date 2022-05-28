package Application.UseCases.Command.CheckIn;

import Dto.CheckInDto;
import UseCases.Command.CheckIn.CrearCheckInCommand;
import org.junit.Assert;
import org.junit.Test;

public class CrearCheckInCommand_Test {

    @Test
    public void dataValid() {
        String descripcion = "HOlaa";
        CheckInDto checkInDto = new CheckInDto();
        checkInDto.Descripcion = descripcion;
        CrearCheckInCommand command = new CrearCheckInCommand(checkInDto);
        Assert.assertEquals(descripcion, command.checkInDto.Descripcion);
    }

    @Test
    public void constructorIsPrivate() {
        Assert.assertTrue(CrearCheckInCommand.class.getConstructors()[0].canAccess(null));
    }

}
