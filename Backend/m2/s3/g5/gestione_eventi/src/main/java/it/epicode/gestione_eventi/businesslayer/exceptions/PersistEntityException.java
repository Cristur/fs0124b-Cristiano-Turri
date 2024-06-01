package it.epicode.gestione_eventi.businesslayer.exceptions;

import it.epicode.gestione_eventi.businesslayer.dto.DtoBase;

public class PersistEntityException extends ServiceException{

    public final DtoBase invalidDto;


    public PersistEntityException(DtoBase invalidDto) {
        this.invalidDto = invalidDto;
    }

}
