package ch1.di;

import ch1.di.request.Request;
import ch1.di.requesthandler.CssRequestHandlerImpl;
import ch1.di.request.CssRequestImpl;
import org.junit.Test;

import static org.mockito.Mockito.*;

// 1.4
public class CssRequestHandlerTest {

  @Test
  public void test() {
    Request request = mock(CssRequestImpl.class); // 创建mock Quest
    CssRequestHandlerImpl handler = new CssRequestHandlerImpl(request); // 注入mock quest
    handler.doRequestHandler();
    verify(request, times(1)).doRequest();
  }
}
