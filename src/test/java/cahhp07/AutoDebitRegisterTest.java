package cahhp07;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static cahhp07.CardValidity.THEFT;
import static cahhp07.CardValidity.VALID;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AutoDebitRegisterTest {
    private StubCardNumberValidator stubValidator = new StubCardNumberValidator();
    private AutoDebitRegister register;

    @BeforeEach
    void setUp(){
        CardNumberValidator validator = new CardNumberValidator();
        AutoDebitInfoRepository repository = new JpaAutoDebitInfoRepository();
        register = new AutoDebitRegister(validator, repository);
    }

    @Test
    void validCard() {
        // 업체에서 받은 테스트용 유효한 카드번호 사용
        AutoDebitReq req = new AutoDebitReq("user1", "1231231231234");
        RegisterResult result = this.register.register(req);
        assertEquals(VALID, result.getValidity());
    }
    @Test
    void theftCard(){
        // 업체에서 받은 도난 테스트용 카드번호 사용
        AutoDebitReq req = new AutoDebitReq("user1", "1234567890123456");

    }

    @Test
    @DisplayName("상황 : 유효하지 않는 카드 번호")
    void invalidCardNumber(){
        // 상황 : 유효하지 않는 카드 번호
        stubValidator.setInvalidNo("11223344");

        AutoDebitReq req = new AutoDebitReq("user1", "11223344");
        RegisterResult result = register.register(req);

        assertEquals(VALID, result.getValidity());
    }
}
