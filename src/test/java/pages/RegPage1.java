package pages;

public class RegPage1 {

    // UI mezők
    SelenideElement email = ${}; //

    public void register() {
        email.set("..."); // email generator (Random string generalas)

        // next.click();
        return new RegPage2();
    }

}
