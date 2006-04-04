/*
 * $Id$
 *
 * Copyright 2006 The Apache Software Foundation.
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
package org.apache.struts.action2;

import com.opensymphony.xwork.ActionSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 * ExecutionCountTestAction
 *
 * @author Jason Carreira
 *         Created Apr 18, 2003 6:17:40 PM
 */
public class ExecutionCountTestAction extends ActionSupport {

	private static final long serialVersionUID = -2954211394678430609L;


	private static final Log LOG = LogFactory.getLog(ExecutionCountTestAction.class);


    private int executionCount = 0;


    public int getExecutionCount() {
        return executionCount;
    }

    public String execute() throws Exception {
        executionCount++;
        LOG.info("executing ExecutionCountTestAction. Current count is " + executionCount);

        return SUCCESS;
    }
}
