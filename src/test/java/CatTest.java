import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    Feline feline;

    @Test
    public void getFoodPositive() throws Exception {
        Cat cat = new Cat(feline);
        List<String> expected = List.of();
        List<String> actual = cat.getFood();
        assertEquals(expected, actual);
    }


    @Test

    public void getSoundPositive() {
        Cat cat = new Cat(feline);
        String expected = "Мяу";
        String actual = cat.getSound();
        assertEquals(expected, actual);
    }



}
