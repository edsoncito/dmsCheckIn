package Application.UseCases.Command.CheckIn;

import Dto.BaggageDto;
import Dto.CheckInDto;
import Events.CheckInCreado;
import Modal.CheckIn;
import Repositories.IUnitOfWork;
import Repositories.IcheckInRepository;
import Services.CheckInServices;
import UseCases.Command.CheckIn.CrearCheckInCommand;
import UseCases.Command.CheckIn.CrearCheckInHandler;
import factories.CheckInFactory;
import factories.ICheckInFactory;
import http.Exception.HttpException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import utils.JSON;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.mockito.Mockito.*;

public class CrearCheckInHandler_Test {

    ICheckInFactory checkInFactory = Mockito.mock(ICheckInFactory.class);
    IcheckInRepository checkInRepository = Mockito.mock(IcheckInRepository.class);
    IUnitOfWork _unitOfWork = Mockito.mock(IUnitOfWork.class);
    CheckInServices checkInServices = Mockito.mock(CheckInServices.class);

    String CodigoSeguridad = "dsfds";
    int Asiento = 33;
    Boolean EstadoPaciente = true;
    String Descripcion = "haskjhfaksjf";
    List<BaggageDto> Equipaje = getBaggage();

    @Test
    public void HandleCorrectly() throws HttpException {

        CheckIn a = new CheckInFactory().Create(CodigoSeguridad, EstadoPaciente, Descripcion, Asiento);
        when(checkInFactory.Create( anyString(), anyBoolean(), anyString(), anyInt())).thenReturn(a);
       // when(checkInServices.GenerarNroPedidoAsync()).thenReturn(a.CodigoSeguridad);

        //when(mock.process(Matchers.anyList()));

        CrearCheckInHandler handler = new CrearCheckInHandler(checkInRepository, checkInFactory,  _unitOfWork, checkInServices);

        CheckInDto request = new CheckInDto();
//        BaggageDto baggageDto = new BaggageDto();
//
//        baggageDto.NumeroEtiqueta = "Sdf";
//        baggageDto.Descripcion = "sdfdsf";
//        baggageDto.PesoEquipaje = 34.3;
//        Equipaje.add(E);

        request.EquipajeDto = Equipaje;
        request.CodigoSeguridad = CodigoSeguridad;
        request.EstadoPaciente = EstadoPaciente;
        request.Descripcion = Descripcion;
        request.Asiento = Asiento;

        CrearCheckInCommand command = new CrearCheckInCommand(request);
        CheckIn resp = handler.handle(command);

        verify(checkInRepository).Create(resp);
        verify(_unitOfWork).commit();
        verify(checkInServices).GenerarNroPedidoAsync();

        Assert.assertEquals(CheckInCreado.class, a.domainEvents.get(0).getClass());
        Assert.assertEquals(CodigoSeguridad,resp.CodigoSeguridad);
        Assert.assertEquals(EstadoPaciente,resp.EstadoPaciente);
        Assert.assertEquals(Descripcion,resp.Descripcion);
        Assert.assertEquals(Asiento,resp.Asiento);
    }

    private List<BaggageDto> getBaggage() {
        List<BaggageDto> list = new ArrayList();
        BaggageDto baggageDto = new BaggageDto();
        baggageDto.setNumeroEtiqueta("dsdfsdf");
        baggageDto.setDescripcion("dsfdsf");
        baggageDto.setPesoEquipaje(23.3);
        list.add(baggageDto);
        return list;
    }
}
