import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    void VerifyInteraction(){

        ExternalApi mockApi = mock(ExternalApi.class);

        MyService service =
                new MyService(mockApi);

        service.fetchData();

        verify(mockApi).getData();
    }
}