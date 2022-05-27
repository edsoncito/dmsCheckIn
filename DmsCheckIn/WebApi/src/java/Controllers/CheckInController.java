package Controllers;

import Dto.CheckInDto;
import Modal.CheckIn;
import http.annotation.GetMapping;
import Services.CheckIn.CrearCheckInCommand;
import UseCases.Queries.GetCheckInByIdQuery;
import http.Exception.HttpException;
import http.annotation.*;
import mediator.Mediator;
import mediator.Response;

@RestController
@RequestMapping("/checkin")
public class CheckInController {

    private Mediator _mediator;

    public CheckInController(Mediator mediator) {
        this._mediator = mediator;
    }

    @GetMapping("/")
    public String getAll() {
        return "checkIn";
    }

    @GetMapping("/{key}")
    public Response<CheckInDto> getByKey(@PathVariable GetCheckInByIdQuery request) throws HttpException {
        return _mediator.send(request);
    }

    @PostMapping("/registro")
    public Response<CheckIn> register(@RequestBody CrearCheckInCommand checkInCommand) throws HttpException {
        Response<CheckIn> obj = _mediator.send(checkInCommand);
        return obj;
    }

    // @PutMapping("/{key}")
    // public Aeronave edit(@RequestBody Aeronave aeronave, @PathVariable String key) {
    //     return aeronave;
    // }

    // @DeleteMapping("/{key}")
    // public void delete(@PathVariable String key) {
    //     System.out.println("entro delete");
    // }
    
}
