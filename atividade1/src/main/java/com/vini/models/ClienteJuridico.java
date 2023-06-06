package com.vini.models;

class ClienteJuridico extends Cliente{

  ClienteJuridico(int id) {
    super(id);
  }
  public void m1() {
    System.out.println("m1() from ClienteJuridico");
  }

  public void m2() {
    System.out.println("m2() from ClienteJuridico");

  }

  public void m3() {
    System.out.println("m3() from ClienteJuridico");

  }

  public void m4() {
    System.out.println("m4() from ClienteJuridico");

  }

  public void m5() {
    System.out.println("m5() from ClienteJuridico");

  }

  public void m6() {
    System.out.println("m6() from ClienteJuridico");

  }

  @Override
  public void m7() {
    System.out.println("Overriding m7() ClienteJuridico");
  }
}
