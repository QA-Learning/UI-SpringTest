import com.qa.bootcamp.beans.PageBeans;
import com.qa.bootcamp.builder.NewCustomer;
import com.qa.bootcamp.setup.BaseTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class JuiceShopTest extends BaseTest {

    @Autowired
    PageBeans user;


    @Test
    public void register() {
        getDriver().get("https://juice-shop.herokuapp.com/#/register");
        user.banner().skipBanner();
        NewCustomer newCustomer = NewCustomer.builder()
            .email("test33333@gmail.com")
            .password("Password")
            .repeatPassword("Password").build();
        user.customer().register(newCustomer);
        user.customer().isRegistered();
    }
}