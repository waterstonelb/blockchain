package com.liangwei.demo.model;

public class BTranscation {
    private String id;
    private String type;
    private String initator;
    private String recivier;
    private int tranAmount;
    private float tranFei;
    private int blockHeight;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getInitator() {
        return initator;
    }

    public void setInitator(String initator) {
        this.initator = initator;
    }

    public String getRecivier() {
        return recivier;
    }

    public void setRecivier(String recivier) {
        this.recivier = recivier;
    }

    public int getTranAmount() {
        return tranAmount;
    }

    public void setTranAmount(int tranAmount) {
        this.tranAmount = tranAmount;
    }

    public float getTranFei() {
        return tranFei;
    }

    public void setTranFei(float tranFei) {
        this.tranFei = tranFei;
    }

    public int getBlockHeight() {
        return blockHeight;
    }

    public void setBlockHeight(int blockHeight) {
        this.blockHeight = blockHeight;
    }
}
