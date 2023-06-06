package com.vini.models;

class ClienteFisico extends Cliente{

    ClienteFisico(int id) {
        super(id);
    }
    public void m1() {
        System.out.println("m1() from ClienteFisico");
    }

    public void m2() {
        System.out.println("m2() from ClienteFisico");

    }

    public void m3() {
        System.out.println("m3() from ClienteFisico");

    }

    public void m4() {
        System.out.println("m4() from ClienteFisico");

    }

    public void m5() {
        System.out.println("m5() from ClienteFisico");

    }

    public void m6() {
        System.out.println("m6() from ClienteFisico");

    }

    @Override
    public void m7() {
        System.out.println("Overriding m7() ClienteFisico");
    }
}
