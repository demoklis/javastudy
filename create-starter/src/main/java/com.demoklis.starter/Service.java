package com.demoklis.starter;

public class Service {
    private String prefix;
    private String suffix;

    public Service(String prefix, String suffix) {
        this.prefix = prefix;
        this.suffix = suffix;
    }

    public String wrap(String word){
        return prefix+word+suffix;
    }
}
