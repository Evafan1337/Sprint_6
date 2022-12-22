package tests;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

import static org.junit.Assert.fail;

@RunWith(Parameterized.class)
public class LionSexTest {

    Lion lion;

    @Mock
    Feline felineMock;

    String sex;
    boolean result;
    public LionSexTest(String sex, boolean result){
        this.sex = sex;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][] {
                {"Самка", false},
                {"Самец", true}
        };
    }

    @Test
    public void setLionSexValueCorrectTest() throws Exception {

        lion = new Lion(this.sex, felineMock);
        assert lion.doesHaveMane() == this.result;

    }

}

