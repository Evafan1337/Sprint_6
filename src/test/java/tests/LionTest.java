package tests;

import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.fail;

//@RunWith(MockitoJUnitRunner.class)
@RunWith(Parameterized.class)
public class LionTest {

    Lion lion;
    List lionFoodScope = List.of("Животные", "Птицы", "Рыба");

    String sex;
    String result;
    public LionTest(String sex, String result){
        this.sex = sex;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][] {
                {"Самка", "false"},
                {"Самец", "true"},
                {"incorrect", "exception"},
                {"", "exception"}
        };
    }

    @Test
    public void setLionSexValueCorrectTest() throws Exception {
        try{
            lion = new Lion(this.sex);
            if(this.result == "true"){
                assert lion.doesHaveMane() == true;
            } else if(this.result == "false") {
                assert lion.doesHaveMane() == false;
            } else {
                fail("Должно быть брошено исключение ввиду некорректного значения пола животного");
            }

        } catch (Exception exception) {
            if(this.result != "exception"){
                fail("Исключение не должно быть брошено");
            }
        }

    }

    @Test
    public void getFoodSuccessTest() throws Exception {
        lion = new Lion("Самец");
        assert this.lion.getFood().equals(lionFoodScope);
    }
}
