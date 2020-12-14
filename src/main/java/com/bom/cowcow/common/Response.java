package com.bom.cowcow.common;

import com.bom.cowcow.model.ModelBase;
import lombok.Data;

@Data
public class Response {
    String errorCode = null;
    String errorMessage = null;
    ModelBase model;
}
