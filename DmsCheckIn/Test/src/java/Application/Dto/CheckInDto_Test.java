package Application.Dto;

import Dto.BaggageDto;
import Dto.CheckInDto;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class CheckInDto_Test {

    @Test
    public void CheckPropertiesValid() {

        UUID keyTest = UUID.randomUUID();
        String CodigoSeguridadTest = "daf32sdf";
        Date HoraCheckInTest = new Date();
        Boolean EstadoPacienteTest = false;
        String DescripcionTest = "sdfdsf" ;
        int AsientoTest = 23;
        List<BaggageDto> BaggageDtoTest = getBaggage();

        CheckInDto objCheckIn = new CheckInDto();

        Assert.assertEquals(null, objCheckIn.Key);
        Assert.assertNull(objCheckIn.CodigoSeguridad);
        Assert.assertNull(objCheckIn.HoraCheckIn);
        Assert.assertNull(objCheckIn.EstadoPaciente);
        Assert.assertNull(objCheckIn.Descripcion);
        Assert.assertEquals(0, objCheckIn.Asiento);
        Assert.assertEquals(null, objCheckIn.EquipajeDto);

        objCheckIn.Key = keyTest;
        objCheckIn.CodigoSeguridad = CodigoSeguridadTest;
        objCheckIn.HoraCheckIn = HoraCheckInTest;
        objCheckIn.EstadoPaciente = EstadoPacienteTest;
        objCheckIn.Descripcion = DescripcionTest;
        objCheckIn.Asiento = AsientoTest;
        objCheckIn.EquipajeDto = BaggageDtoTest;

        Assert.assertEquals(keyTest, objCheckIn.Key);
        Assert.assertEquals(CodigoSeguridadTest, objCheckIn.CodigoSeguridad);
        Assert.assertEquals(HoraCheckInTest, objCheckIn.HoraCheckIn);
        Assert.assertEquals(EstadoPacienteTest, objCheckIn.EstadoPaciente);
        Assert.assertEquals(DescripcionTest, objCheckIn.Descripcion);
        Assert.assertEquals(AsientoTest, objCheckIn.Asiento);
        Assert.assertEquals(BaggageDtoTest, objCheckIn.EquipajeDto);

    }

    private List<BaggageDto> getBaggage() {
        ArrayList list = new ArrayList();
        BaggageDto baggageDto = new BaggageDto();
        baggageDto.setNumeroEtiqueta("dsdfsdf");
        baggageDto.setDescripcion("dsfdsf");
        baggageDto.setPesoEquipaje(23.3);
        list.add(baggageDto);
        return list;
    }

}
