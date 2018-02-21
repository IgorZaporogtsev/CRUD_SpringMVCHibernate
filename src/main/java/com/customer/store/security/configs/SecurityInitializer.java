package com.customer.store.security.configs;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;



/* настройка  SpringSecurityFilterChain
*
*
*
*  или эквивалент XML
**  filter>
  <filter-name>springSecurityFilterChain</filter-name>
  <filter-class>
    org.springframework.web.filter.DelegatingFilterProxy
  </filter-class>
</filter>

<filter-mapping>
  <filter-name>springSecurityFilterChain</filter-name>
  <url-pattern>/*</url-pattern>
  <dispatcher>ERROR</dispatcher>
  <dispatcher>REQUEST</dispatcher>
</filter-mapping>
*
*
*
* */


public class SecurityInitializer extends AbstractSecurityWebApplicationInitializer {
}
