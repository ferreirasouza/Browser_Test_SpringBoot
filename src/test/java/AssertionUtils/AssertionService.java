package AssertionUtils;

import org.junit.jupiter.api.Assertions;
import org.springframework.stereotype.Service;
@Service
public class AssertionService {
    public void assertErrorMessagePresence(boolean isErrorMessageDisplayed) {
        if (isErrorMessageDisplayed) {
            Assertions.assertTrue(isErrorMessageDisplayed, "Error message should be displayed.");
        } else {
            Assertions.assertFalse(isErrorMessageDisplayed, "Error message should not be displayed.");
        }
    }
}
