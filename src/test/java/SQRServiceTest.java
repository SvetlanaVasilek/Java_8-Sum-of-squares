import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.homework6.sqr.SQRService;

public class SQRServiceTest {
    SQRService sqrService = new SQRService();

    @Test
    public void calculSqrInlimit() {
        int expected = 3;
        int actual = sqrService.calculSqr(200, 300);
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void calculSqrInLimit2() {
        int expected = 7;
        int actual = sqrService.calculSqr (5000, 6000);
        Assertions.assertEquals(expected, actual);

    }
}