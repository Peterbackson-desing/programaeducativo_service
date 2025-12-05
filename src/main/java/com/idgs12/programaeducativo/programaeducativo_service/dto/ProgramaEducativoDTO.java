package com.idgs12.programaeducativo.programaeducativo_service.dto;

import lombok.Data;

@Data
public class ProgramaEducativoDTO {
    private Long id;
    private String nombre;
    private String descripcion;
    private Boolean activo;
    private Long idDivision;
}
