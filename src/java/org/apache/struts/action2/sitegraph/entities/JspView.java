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
package org.apache.struts.action2.sitegraph.entities;

import java.io.File;
import java.util.regex.Pattern;

/**
 * User: plightbo
 * Date: Jun 25, 2005
 * Time: 2:19:15 PM
 */
public class JspView extends FileBasedView {
    public JspView(File file) {
        super(file);
    }

    protected Pattern getActionPattern() {
        return Pattern.compile("<a:action [^>]*name=\"([^\"]+)\"[^>]*>");
    }

    protected Pattern getFormPattern() {
        return Pattern.compile("<a:form [^>]*action=\"([^\"]+)\"[^>]*>");
    }
}
