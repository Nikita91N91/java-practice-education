package com.dmdev.multithreading.queue;

public class CashBox {

    private static int generator = 1;
    private final int id;

    public CashBox(int id) {
        this.id = generator++;
    }

    @Override
    public String toString() {
        return "CashBox{" +
                "id=" + id +
                '}';
    }
}
