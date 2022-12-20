package tests;

import com.example.Cat;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {


    Cat cat;
    @Mock
    Feline feline;

    @Before
    public void init(){
        this.cat = new Cat(feline);
    }

    @Test
    public void getSoundMeowTest(){
        assert cat.getSound() == "Мяу";
    }

    @Test
    public void getFoodSuccesTest() throws Exception {
        this.cat = new Cat(new Feline());
        assert cat.getFood().size() != 0;
    }
}
