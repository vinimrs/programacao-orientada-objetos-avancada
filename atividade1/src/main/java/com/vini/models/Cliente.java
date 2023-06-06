package com.vini.models;

abstract class Cliente implements IClienteSistema1, IClienteSistema2, IClienteSistema3 {
  private int id;

  Cliente(int id) {
      this.id = id;
  }

    public abstract void m1();
    public abstract void m2();
    public abstract void m3();
    public abstract void m4();
    public abstract void m5();
    public abstract void m6();

    public void m7() {
        System.out.println("m7() from Cliente class");
    }

    public int getId() {
        return id;
    }
}
