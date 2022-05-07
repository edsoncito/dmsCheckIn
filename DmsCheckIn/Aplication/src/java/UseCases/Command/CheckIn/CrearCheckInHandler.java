package UseCases.Command.CheckIn;

import java.util.UUID;
import Modal.CheckIn;
import Repositories.IUnitOfWork;
import Repositories.IcheckInRepository;
import Services.CheckInServices;
import Services.IcheckInService;
import factories.ICheckInFactory;
import SharedKernel.mediator.RequestHandler;

public class CrearCheckInHandler implements RequestHandler<CrearCheckInCommand , CheckIn> {


    private IcheckInRepository CheckInRepository;
    private ICheckInFactory CheckInFactory;
    private CheckInServices inService;
    private IUnitOfWork _unitOfWork;

    public CrearCheckInHandler(IcheckInRepository checkInRepository, ICheckInFactory checkInFactory, IUnitOfWork unitOfWork,CheckInServices checkInServices  ) {
        CheckInRepository = checkInRepository;
        CheckInFactory = checkInFactory;
        _unitOfWork = unitOfWork;
        inService = checkInServices;
    }

    @Override
    public CheckIn handle(CrearCheckInCommand request) {

        String nroCheckIn = inService.GenerarNroPedidoAsync();
        CheckIn objCheckIn = CheckInFactory.Create(nroCheckIn, request.checkInDto.getEstadoPaciente(), request.checkInDto.getDescripcion() ,request.checkInDto.getAsiento());

        for (var item: request.Equipaje) {
            objCheckIn.AgregarItem(item.getPesoEquipaje(), item.getNumeroEtiquta(), item.getDescripcion());
        }
        objCheckIn.checkInCompletado();
        CheckInRepository.Create(objCheckIn);
        _unitOfWork.commit();
        return objCheckIn;
    }
}
