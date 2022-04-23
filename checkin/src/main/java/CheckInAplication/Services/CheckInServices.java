package CheckInAplication.Services;


import org.springframework.web.context.request.async.WebAsyncTask;

public interface CheckInServices extends Comparable<String>{


    WebAsyncTask<String> GenerarNroPedidoAsync();

}
