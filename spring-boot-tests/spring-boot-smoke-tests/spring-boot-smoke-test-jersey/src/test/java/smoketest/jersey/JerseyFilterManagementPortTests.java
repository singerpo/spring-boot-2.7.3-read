/*
 * Copyright 2012-2021 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package smoketest.jersey;

import org.springframework.test.context.TestPropertySource;

/**
 * Integration tests for Jersey configured as a Servlet using separate management and main
 * service ports.
 *
 * @author Andy Wilkinson
 */
@TestPropertySource(properties = {"spring.jersey.type=filter", "server.servlet.register-default-servlet=true"})
class JerseyFilterManagementPortTests extends AbstractJerseyManagementPortTests {

}
