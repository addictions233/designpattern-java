package com.one.example02;

/**
 * 回执业务对象
 */
public class Receipt {

    /**
     * 回执类型: MT1101, MT2101, MT4101, MT8101
     */
    private String type;

    private String message;

    public Receipt(String type, String message) {
        this.type = type;
        this.message = message;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "type='" + type + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
