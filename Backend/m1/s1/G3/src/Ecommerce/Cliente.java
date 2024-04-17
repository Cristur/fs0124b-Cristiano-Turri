package Ecommerce;

public class Cliente {
    private String codice;
    private String nome;
    private String cognome;
    private String email;
    private String iscrizione;

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIscrizione() {
        return iscrizione;
    }

    public void setIscrizione(String iscrizione) {
        this.iscrizione = iscrizione;
    }

}
