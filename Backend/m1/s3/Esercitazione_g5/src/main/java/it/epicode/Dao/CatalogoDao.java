package it.epicode.Dao;

import it.epicode.Classes.Catalogo;

public interface CatalogoDao {
    void aggiungiAlCatalogo(Catalogo el);
    void eliminaDalCatalogo(long ISBN);
    Catalogo cercaPerISBN(long ISBN);
    Catalogo cercaPerAnno(long anno);
}
