package com.example.cursomc.resources.exception;

import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardError {
    private static final long serialVersionUID = 1L;

    private List<FieldMessage> erros = new ArrayList<>();

    public ValidationError(Integer status, String msg, long timeStamp) {
        super(status, msg, timeStamp);
    }

   public List<FieldMessage> getErrors() {
        return erros;
   }

   public void addError(String fieldName, String messagem) {
       erros.add(new FieldMessage(fieldName, messagem));
   }


}
