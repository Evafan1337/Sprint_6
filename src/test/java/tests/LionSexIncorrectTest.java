package tests;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

import static org.junit.Assert.fail;

@RunWith(Parameterized.class)
public class LionSexIncorrectTest {

    Lion lion;

    @Mock
    Feline felineMock;

    String sex;

    public LionSexIncorrectTest(String sex){
        this.sex = sex;
    }

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][] {
                {"incorrect"},
                {""}
        };
    }

    @Test
    public void setLionSexValueIncorrectTest() {
        try{
            lion = new Lion(this.sex, felineMock);
            fail("Должно быть брошено исключение ввиду некорректного значения пола животного");

        } catch (Exception exception) {
        }

    }
}

