package com.vini.controller;

import com.vini.models.FactoryCliente;
import com.vini.models.IClienteSistema1;

public class Controller1 {
  public void getM1(int clienteId) {
    FactoryCliente factory = new FactoryCliente();
    IClienteSistema1 cliente = factory.createClienteFisico(clienteId);
    cliente.m1();
  }

  public void getM2(int clienteId) {
    FactoryCliente factory = new FactoryCliente();
    IClienteSistema1 cliente = factory.createClienteFisico(clienteId);
    cliente.m2();
  }

  public void getM3(int clienteId) {
    FactoryCliente factory = new FactoryCliente();
    IClienteSistema1 cliente = factory.createClienteFisico(clienteId);
    cliente.m3();
  }
}
