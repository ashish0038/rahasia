
/*
 * Carrot2 project.
 *
 * Copyright (C) 2002-2010, Dawid Weiss, Stanisław Osiński.
 * All rights reserved.
 *
 * Refer to the full license file "carrot2.LICENSE"
 * in the root folder of the repository checkout or at:
 * http://www.carrot2.org/carrot2.LICENSE
 */

package org.carrot2.util.attribute.test.metadata;

import org.carrot2.util.attribute.Attribute;
import org.carrot2.util.attribute.Bindable;

/**
 *
 */
@Bindable
public class TestAttributeNames
{
    /**
     * Title. Description.
     *
     * @label label
     */
    @Attribute(key = "title-description-label")
    public static final String TITLE_DESCRIPTION_LABEL = "title-description-label";
}