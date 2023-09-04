package com.example.sistemaacademico;

import com.example.sistemaacademico.Examen;

public class StudentResult {
    private String student_name;
    private String email;
    private Examen examen;

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Examen getExamen() {
        return examen;
    }

    public void setExamen(Examen examen) {
        this.examen = examen;
    }

    public String toStirng(){
        return "Name: "+student_name+" / email: "+email+" --------------------> "+examen.toString();
    }



}
