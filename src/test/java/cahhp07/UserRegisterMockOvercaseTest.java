package cahhp07;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.BDDMockito;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserRegisterMockOvercaseTest {
    private UserRegister userRegister;

    private UserRegister userRegisterWithFakeRepo;
    private UserRepository mockRepository = Mockito.mock(UserRepository.class);


    private WeakPasswordChecker mockPasswordChecker = Mockito.mock(WeakPasswordChecker.class);

    private MemoryUserRepository fakeRepository = new MemoryUserRepository();

    private EmailNotifier mockEmailNotifier = Mockito.mock(EmailNotifier.class);

    @BeforeEach
    void setUp() {
        userRegister = new UserRegister(mockPasswordChecker, mockRepository, mockEmailNotifier);
        userRegisterWithFakeRepo = new UserRegister(mockPasswordChecker, fakeRepository, mockEmailNotifier);
    }

    @Test
    void noDupId_RegisterSuccess() {
        userRegister.register("id","pw","email");

        ArgumentCaptor<User> captor = ArgumentCaptor.forClass(User.class);
        BDDMockito.then(mockRepository).should().save(captor.capture());

        User savedUser = captor.getValue();
        assertEquals("id",savedUser.getId());
        assertEquals("email", savedUser.getEmail());
    }

    @Test
    void 같은_ID가_없으면_가입(){
        userRegister.register("id","pw","email");


    }
}
