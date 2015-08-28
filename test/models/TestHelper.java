package models;

import play.mvc.Http;

import java.util.Collections;
import java.util.Map;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by jackson on 27/08/15.
 */
public class TestHelper {

    public static Http.Context getMockContext() {
        Long id = 2L;
        play.api.mvc.RequestHeader requestHeader = mock(play.api.mvc.RequestHeader.class);
        Http.Request request = mock(Http.Request.class);
        when(request.remoteAddress()).thenReturn("104.156.228.162");
        Map<String, String> flashData = Collections.emptyMap();
        Map<String, Object> argData = Collections.emptyMap();
        Http.Context context = new Http.Context(id, requestHeader, request, flashData, flashData, argData);
        return context;
    }
}
