
class Smartphone extends DispositivoElettronico {

    @Override
    public void avviaApplicazione(String nomeApp) {
        super.avviaApplicazione(nomeApp);

        // login
        login("Giacomo", "12345678");

    }

    private void login(String username, String password) {
        System.out.println("Username: " + username + ", Password: " + password);
    }
}
