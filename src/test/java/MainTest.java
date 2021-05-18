import org.junit.jupiter.api.*;

public class MainTest {
    @Test
    public void test_welcomeMessage(){
        //arrange

        //act
        String actual = Main.GetMessage();

        //assert
        Assertions.assertEquals("Welcome to ArchiverApp", actual);
    }
}
