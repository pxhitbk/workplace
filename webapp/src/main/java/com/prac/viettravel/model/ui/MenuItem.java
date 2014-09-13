/*
 * FILENAME
 *     MenuItem.java
 *
 * FILE LOCATION
 *     $Source$
 *
 * VERSION
 *     $Id$
 *         @version       $Revision$
 *         Check-Out Tag: $Name$
 *         Locked By:     $Lockers$
 *
 * FORMATTING NOTES
 *     * Lines should be limited to 78 characters.
 *     * Files should contain no tabs.
 *     * Indent code using four-character increments.
 *
 * COPYRIGHT
 *     Copyright (C) 2007 Genix Ventures Pty. Ltd. All rights reserved.
 *     This software is the confidential and proprietary information of
 *     Genix Ventures ("Confidential Information"). You shall not
 *     disclose such Confidential Information and shall use it only in
 *     accordance with the terms of the license agreement you entered into
 *     with Genix Ventures.
 */

package com.prac.viettravel.model.ui;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.prac.core.model.BaseEntity;

//
// IMPORTS
// NOTE: Import specific classes without using wildcards.
//

/**
 * Entity for dynamic menu
 */
@Entity
@Table(name="prac_ui_menuitem")
public class MenuItem extends BaseEntity
{
    private static final long serialVersionUID = 427153892739026294L;
    
    private String title;
    private String name;
    private boolean isContentChanged;
    private String pathName;
    private Long order;
    private Long parentId;
    
    public String getTitle()
    {
        return title;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public boolean isContentChanged()
    {
        return isContentChanged;
    }
    public void setContentChanged(boolean isContentChanged)
    {
        this.isContentChanged = isContentChanged;
    }
    public String getPathName()
    {
        return pathName;
    }
    public void setPathName(String pathName)
    {
        this.pathName = pathName;
    }
    public Long getOrder()
    {
        return order;
    }
    public void setOrder(Long order)
    {
        this.order = order;
    }
    public Long getParentId()
    {
        return parentId;
    }
    public void setParentId(Long parentId)
    {
        this.parentId = parentId;
    }
}
