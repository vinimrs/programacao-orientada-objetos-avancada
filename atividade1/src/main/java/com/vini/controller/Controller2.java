package com.vini.controller;

import com.vini.models.FactoryCliente;
import com.vini.models.IClienteSistema2;

public class Controller2 {
  public void getM3(int clienteId) {
    FactoryCliente factory = new FactoryCliente();
    IClienteSistema2 cliente = factory.createClienteFisico(clienteId);
    cliente.m3();
  }

  public void getM4(int clienteId) {
    FactoryCliente factory = new FactoryCliente();
    IClienteSistema2 cliente = factory.createClienteFisico(clienteId);
    cliente.m4();
  }

}
