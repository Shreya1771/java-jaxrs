package io.opentracing.contrib.jaxrs2.itest.cxf;

import io.opentracing.contrib.jaxrs2.itest.common.AbstractClassOperationNameTest;
import org.eclipse.jetty.servlet.ServletContextHandler;

/**
 * @author Pavol Loffay
 */
public class ApacheCXFClassOperationNameITest extends AbstractClassOperationNameTest {

  @Override
  protected void initServletContext(ServletContextHandler context) {
    ApacheCXFHelper.initServletContext(context);
  }
}
