package tests;

import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    Lion lion;
    @Mock
    Feline felineMock;
    List lionFoodScope = List.of("Животные", "Птицы", "Рыба");

    @Before
    public void init() throws Exception {
        lion = new Lion("Самец", felineMock);
    }

    @Test
    public void getFoodSuccessTest() throws Exception {
        assert this.lion.getFood().equals(lionFoodScope);
    }

    @Test
    public void getKittensWithoutValueSuccessTest() throws Exception {
        int expectedResult = 1;
        Mockito.when(felineMock.getKittens()).thenReturn(1);
        int actualResult = lion.getKittens();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getKittensWithValueSuccessTest() throws Exception {
        int expectedResult = 3;
        Mockito.when(felineMock.getKittens()).thenReturn(3);
        int actualResult = lion.getKittens();
        assertEquals(expectedResult, actualResult);
    }
}
