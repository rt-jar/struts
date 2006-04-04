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
package org.apache.struts.action2.showcase.filedownload;

import org.apache.struts.action2.ServletActionContext;
import com.opensymphony.xwork.Action;

import java.io.InputStream;

/**
 * Action to demonstrate how to use file download.
 * <p/>
 * This action is used to download a jpeg file from the image folder.
 *
 * @author Claus Ibsen
 */
public class FileDownloadAction implements Action {

    public InputStream getImageStream() throws Exception {
        return ServletActionContext.getServletContext().getResourceAsStream("/images/logo.png");
    }

    public String execute() throws Exception {
        return SUCCESS;
    }

}
