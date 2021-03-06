/* Copyright (c) 2008-2009 HomeAway, Inc.
 * All rights reserved.  http://www.perf4j.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Provides the concrete {@link org.perf4j.log4j.servlet.GraphingServlet} class that can be installed in a web.xml
 * file to expose graphs generated by a {@link org.perf4j.log4j.GraphingStatisticsAppender}. The following example
 * web.xml shows how the servlet could be configured:
 *
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;
 *
 * &lt;web-app version="2.4"
 *          xmlns="http://java.sun.com/xml/ns/j2ee"
 *          xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
 *          xsi:schemaLocation="http://java.sun.com/xml/ns/j2ee http://java.sun.com/xml/ns/j2ee/web-app_2_4.xsd"&gt;
 *
 *   &lt;servlet&gt;
 *     &lt;servlet-name&gt;perf4j&lt;/servlet-name&gt;
 *     &lt;servlet-class&gt;org.perf4j.servlet.Log4JGraphingServlet&lt;/servlet-class&gt;
 *     &lt;!--
 *       The values for the graphNames init param must match the names of the GraphingStatisticsAppenders
 *       as configured in the log4j.xml file.
 *     --&gt;
 *     &lt;init-param&gt;
 *       &lt;param-name&gt;graphNames&lt;/param-name&gt;
 *       &lt;param-value&gt;PageTimes,PageTPS&lt;/param-value&gt;
 *     &lt;/init-param&gt;
 *   &lt;/servlet&gt;
 *
 *   &lt;servlet-mapping&gt;
 *     &lt;servlet-name&gt;perf4j&lt;/servlet-name&gt;
 *     &lt;url-pattern&gt;/perf4j&lt;/url-pattern&gt;
 *   &lt;/servlet-mapping&gt;
 * &lt;/web-app&gt;
 * </pre>
 */
package org.perf4j.log4j.servlet;