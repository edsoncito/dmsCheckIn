package Repositories;

import http.Exception.HttpException;

public interface IUnitOfWork {
    public void commit() throws HttpException;
}
