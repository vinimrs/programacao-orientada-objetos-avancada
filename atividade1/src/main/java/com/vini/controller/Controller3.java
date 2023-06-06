package com.vini.controller;

import com.vini.models.FactoryCliente;
import com.vini.models.IClienteSistema3;

public class Controller3 {
  public void getM5(int clienteId) {
    FactoryCliente factory = new FactoryCliente();
    IClienteSistema3 cliente = factory.createClienteFisico(clienteId);
    cliente.m5();
  }

  public void getM6(int clienteId) {
    FactoryCliente factory = new FactoryCliente();
    IClienteSistema3 cliente = factory.createClienteFisico(clienteId);
    cliente.m6();
  }

}
