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
package org.apache.struts.action2.showcase.dao;

import org.apache.struts.action2.showcase.model.IdEntity;
import org.apache.struts.action2.showcase.exception.CreateException;
import org.apache.struts.action2.showcase.exception.UpdateException;
import org.apache.struts.action2.showcase.exception.StorageException;

import java.io.Serializable;
import java.util.Collection;

/**
 * Dao. Interface.
 *
 * @author <a href="mailto:gielen@it-neering.net">Rene Gielen</a>
 */

public interface Dao {

    Class getFeaturedClass();

    IdEntity get(Serializable id);

    Serializable create(IdEntity object) throws CreateException;

    IdEntity update(IdEntity object) throws UpdateException;

    Serializable merge(IdEntity object) throws StorageException;

    int delete(Serializable id) throws CreateException;

    int delete(IdEntity object) throws CreateException;

    Collection findAll();
}
