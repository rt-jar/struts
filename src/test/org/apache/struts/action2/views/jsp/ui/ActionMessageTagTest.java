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
package org.apache.struts.action2.views.jsp.ui;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.apache.struts.action2.views.jsp.AbstractUITagTest;
import com.opensymphony.xwork.Action;
import com.opensymphony.xwork.ActionSupport;

/**
 * ActionMessageTag test case.
 * 
 * @author tm_jee
 * @version $Date$ $Id$
 */
public class ActionMessageTagTest extends AbstractUITagTest {

	public void testNoActionMessages() throws Exception {
		
		ActionMessageTag tag = new ActionMessageTag();
		((InternalActionSupport)action).setHasActionMessage(false);
		tag.setPageContext(pageContext);
		tag.doStartTag();
		tag.doEndTag();
		
		verify(ActionMessageTagTest.class.getResource("actionmessage-1.txt"));
	}
	
	public void testYesActionMessages() throws Exception {
		
		ActionMessageTag tag = new ActionMessageTag();
		((InternalActionSupport)action).setHasActionMessage(true);
		tag.setPageContext(pageContext);
		tag.doStartTag();
		tag.doEndTag();
		
		verify(ActionMessageTagTest.class.getResource("actionmessage-2.txt"));
	}
	
	public Action getAction() {
		return new InternalActionSupport();
	}

	/**
	 * Internal ActionSupport class for testing, can be in state with
	 * or without action messages.
	 * 
	 * @author tm_jee
	 * @version $Date$ $Id$
	 */
	public class InternalActionSupport extends ActionSupport {
		
		private static final long serialVersionUID = -3230043189352453629L;
		
		private boolean canHaveActionMessage;
		
		public void setHasActionMessage(boolean canHaveActionMessage) {
			this.canHaveActionMessage = canHaveActionMessage;
		}
		
		public Collection getActionMessages() {
			if (canHaveActionMessage) {
				List messages = new ArrayList();
				messages.add("action message number 1");
				messages.add("action message number 2");
				messages.add("action message number 3");
				return messages;
			}
			else {
				return Collections.EMPTY_LIST;
			}
		}
		
		public boolean hasActionMessages() {
			return canHaveActionMessage;
		}
	}
}
