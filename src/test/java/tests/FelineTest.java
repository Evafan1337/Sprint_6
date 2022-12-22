package tests;

import com.example.Animal;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {


    List felineFoodScope = List.of("Животные", "Птицы", "Рыба");
    String felineFamilyDefinition = "Кошачьи";

    Feline feline;
    @Before
    public void init(){
        this.feline = new Feline();
    }

    @Test
    public void eatMeatSuccessTest() throws Exception {
        assert this.feline.eatMeat().equals(felineFoodScope);
    }

    @Test
    public void getFamilySuccessTest(){
        assert this.feline.getFamily().equals(felineFamilyDefinition);
    }

    @Test
    public void getKittensCallSuccessTest(){
        assert feline.getKittens(5) == 5;
    }

    @Test
    public void getKittensEmptyCallSuccessTest(){
        assert feline.getKittens() == 1;
    }

}
