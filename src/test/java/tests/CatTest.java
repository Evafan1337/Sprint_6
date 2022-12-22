package tests;

import com.example.Cat;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {


    Cat cat;
    @Mock
    Feline felineMock;

    @Before
    public void init(){
        this.cat = new Cat(felineMock);
    }

    @Test
    public void getSoundMeowTest(){
        assert cat.getSound() == "Мяу";
    }

    @Test
    public void getFoodSuccessTest() throws Exception {

        Mockito.when(felineMock.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));

        List expectedResult = List.of("Животные", "Птицы", "Рыба");
        List actualResult = cat.getFood();

        assertEquals(expectedResult, actualResult);
    }

}
