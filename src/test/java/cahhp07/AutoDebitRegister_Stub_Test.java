package cahhp07;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static cahhp07.CardValidity.INVALID;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AutoDebitRegister_Stub_Test {
    private AutoDebitRegister register;
    private StubCardNumberValidator stubValidator;
    private StubAutoDebitInfoRepository stubRepository;

    @BeforeEach
    void setUp() {
        stubValidator = new StubCardNumberValidator();
        stubRepository = new StubAutoDebitInfoRepository();
        register = new AutoDebitRegister(stubValidator, stubRepository);
    }
    @Test
    void invalidCard(){
        stubValidator.setInvalidNo("111222333");
        AutoDebitReq req = new AutoDebitReq("user1", "111222333");
        RegisterResult result = register.register(req);

        assertEquals(INVALID, result.getValidity());
    }
}
