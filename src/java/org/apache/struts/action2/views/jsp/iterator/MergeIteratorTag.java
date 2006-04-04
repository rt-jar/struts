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
package org.apache.struts.action2.views.jsp.iterator;

import org.apache.struts.action2.components.Component;
import org.apache.struts.action2.components.MergeIterator;
import org.apache.struts.action2.views.jsp.ComponentTagSupport;
import com.opensymphony.xwork.util.OgnlValueStack;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Append a list of iterators. The values of the iterators will be merged
 * into one iterator.
 *
 * @author Rickard �berg (rickard@dreambean.com)
 * @author tm_jee ( tm_jee (at) yahoo.co.uk )
 * @see MergeIterator
 * @see org.apache.struts.action2.util.MergeIteratorFilter
 */
public class MergeIteratorTag extends ComponentTagSupport {

	private static final long serialVersionUID = 4999729472466011218L;

	public Component getBean(OgnlValueStack stack, HttpServletRequest req, HttpServletResponse res) {
		return new MergeIterator(stack);
	}

}
