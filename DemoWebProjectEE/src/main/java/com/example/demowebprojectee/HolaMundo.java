package com.example.demowebprojectee;

public class HolaMundo {
    private String message;
    private String despedida;
    public HolaMundo(){
        message="";
    }
    public HolaMundo(String message){
        this.message=message;
    }
    public HolaMundo(String message, String despedida){
        this.message=message;
        this.despedida=despedida;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
