package org.bsbo.util;

public class ResponseEntity<T> {
    private T body;
    private int code;
    public T getBody() {
        return body;
    }
    public void setBody(T body) {
        this.body = body;
    }
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
}
