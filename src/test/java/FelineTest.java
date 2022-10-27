import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.List;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class FelineTest {
    Feline feline = new Feline();
    private final int kittensQuantity;


    public FelineTest(int kittensQuantity) {
        this.kittensQuantity = kittensQuantity;
    }


    @Parameterized.Parameters
    public static Object[][] kittensInput_getCount() {
        return new Object[][]{
                {0},
                {1},
                {55},
        };
    }


    @Test
    public void getKittensPositive() {
        int expected = 1;
        int actual = feline.getKittens();
        assertEquals(expected, actual);
    }


    @Test
    public void getKittensParameterizedPositive() {
        int actual = feline.getKittens(kittensQuantity);
        assertEquals(kittensQuantity, actual);
    }


    @Test
    public void getFamilyPositive() {
        String expected = "Кошачьи";
        String actual = feline.getFamily();
        assertEquals(expected, actual);
    }

    @Test
    public void eatMeatTrue() throws Exception {
        List <String> expected = List.of("Животные", "Птицы", "Рыба");
        List <String> actual = feline.eatMeat();
        assertEquals(expected, actual);
    }
}
