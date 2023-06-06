package com.vini.models;

public class FactoryCliente {

  public Cliente createClienteFisico(int id) {
    return new ClienteFisico(id);
  }

  public Cliente createClienteJuridico(int id) {
    return new ClienteJuridico(id);
  }
}
