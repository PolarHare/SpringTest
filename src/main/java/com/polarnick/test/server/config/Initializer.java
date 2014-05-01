package com.polarnick.test.server.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * http://kielczewski.eu/2013/11/spring-mvc-without-web-xml-using-webapplicationinitializer/
 * http://devcolibri.com/3810
 *
 * @author Polyarnyi Nikolay
 */
public class Initializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] { AppConfig.class };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] { WebMvcConfig.class, WebSecurityConfig.class };
    }
}
