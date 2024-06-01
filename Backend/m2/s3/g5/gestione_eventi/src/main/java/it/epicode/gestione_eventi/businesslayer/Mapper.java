package it.epicode.gestione_eventi.businesslayer;

public interface Mapper<D, S> {
    S map(D input);
}
