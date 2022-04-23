package ShareKernel.mediator;

public interface Mediator {

    public <T,E> Response<E> send(Request<T> request);

    public Response<Void> notify(Notification notification);
}