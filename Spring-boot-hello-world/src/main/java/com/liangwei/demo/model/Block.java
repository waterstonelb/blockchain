package com.liangwei.demo.model;

public class Block {
    private String id;
    private String address;
    private int amount;
    private int jiangeok;
    private int eeok;
    private float feieok;
    private int blockHeight;
    private String data;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getJiangeok() {
        return jiangeok;
    }

    public void setJiangeok(int jiangeok) {
        this.jiangeok = jiangeok;
    }

    public int getEeok() {
        return eeok;
    }

    public void setEeok(int eeok) {
        this.eeok = eeok;
    }

    public float getFeieok() {
        return feieok;
    }

    public void setFeieok(float feieok) {
        this.feieok = feieok;
    }

    public int getBlockHeight() {
        return blockHeight;
    }

    public void setBlockHeight(int blockHeight) {
        this.blockHeight = blockHeight;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
